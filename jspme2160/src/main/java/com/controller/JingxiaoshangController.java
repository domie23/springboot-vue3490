package com.controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Date;
import java.util.List;
import javax.servlet.http.HttpServletRequest;

import com.utils.ValidatorUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.annotation.IgnoreAuth;

import com.entity.JingxiaoshangEntity;
import com.entity.view.JingxiaoshangView;

import com.service.JingxiaoshangService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.CommonUtil;
import java.io.IOException;

/**
 * 经销商
 * 后端接口
 * @author 
 * @email 
 * @date 2022-04-21 15:54:45
 */
@RestController
@RequestMapping("/jingxiaoshang")
public class JingxiaoshangController {
    @Autowired
    private JingxiaoshangService jingxiaoshangService;



    
	@Autowired
	private TokenService tokenService;
	
	/**
	 * 登录
	 */
	@IgnoreAuth
	@RequestMapping(value = "/login")
	public R login(String username, String password, String captcha, HttpServletRequest request) {
		JingxiaoshangEntity user = jingxiaoshangService.selectOne(new EntityWrapper<JingxiaoshangEntity>().eq("jingxiaoshangzhanghao", username));
		if(user==null || !user.getMima().equals(password)) {
			return R.error("账号或密码不正确");
		}
                if("否".equals(user.getSfsh())) return R.error("账号已锁定，请联系管理员审核。");
		String token = tokenService.generateToken(user.getId(), username,"jingxiaoshang",  "经销商" );
		return R.ok().put("token", token);
	}
	
	/**
     * 注册
     */
	@IgnoreAuth
    @RequestMapping("/register")
    public R register(@RequestBody JingxiaoshangEntity jingxiaoshang){
    	//ValidatorUtils.validateEntity(jingxiaoshang);
    	JingxiaoshangEntity user = jingxiaoshangService.selectOne(new EntityWrapper<JingxiaoshangEntity>().eq("jingxiaoshangzhanghao", jingxiaoshang.getJingxiaoshangzhanghao()));
		if(user!=null) {
			return R.error("注册用户已存在");
		}
		Long uId = new Date().getTime();
		jingxiaoshang.setId(uId);
        jingxiaoshangService.insert(jingxiaoshang);
        return R.ok();
    }

	
	/**
	 * 退出
	 */
	@RequestMapping("/logout")
	public R logout(HttpServletRequest request) {
		request.getSession().invalidate();
		return R.ok("退出成功");
	}
	
	/**
     * 获取用户的session用户信息
     */
    @RequestMapping("/session")
    public R getCurrUser(HttpServletRequest request){
    	Long id = (Long)request.getSession().getAttribute("userId");
        JingxiaoshangEntity user = jingxiaoshangService.selectById(id);
        return R.ok().put("data", user);
    }
    
    /**
     * 密码重置
     */
    @IgnoreAuth
	@RequestMapping(value = "/resetPass")
    public R resetPass(String username, HttpServletRequest request){
    	JingxiaoshangEntity user = jingxiaoshangService.selectOne(new EntityWrapper<JingxiaoshangEntity>().eq("jingxiaoshangzhanghao", username));
    	if(user==null) {
    		return R.error("账号不存在");
    	}
        user.setMima("123456");
        jingxiaoshangService.updateById(user);
        return R.ok("密码已重置为：123456");
    }


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,JingxiaoshangEntity jingxiaoshang, 
		HttpServletRequest request){

		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("fengongsi")) {
			jingxiaoshang.setFengongsizhanghao((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<JingxiaoshangEntity> ew = new EntityWrapper<JingxiaoshangEntity>();
    	PageUtils page = jingxiaoshangService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, jingxiaoshang), params), params));
		request.setAttribute("data", page);
        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,JingxiaoshangEntity jingxiaoshang, 
		HttpServletRequest request){
        EntityWrapper<JingxiaoshangEntity> ew = new EntityWrapper<JingxiaoshangEntity>();
    	PageUtils page = jingxiaoshangService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, jingxiaoshang), params), params));
		request.setAttribute("data", page);
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( JingxiaoshangEntity jingxiaoshang){
       	EntityWrapper<JingxiaoshangEntity> ew = new EntityWrapper<JingxiaoshangEntity>();
      	ew.allEq(MPUtil.allEQMapPre( jingxiaoshang, "jingxiaoshang")); 
        return R.ok().put("data", jingxiaoshangService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(JingxiaoshangEntity jingxiaoshang){
        EntityWrapper< JingxiaoshangEntity> ew = new EntityWrapper< JingxiaoshangEntity>();
 		ew.allEq(MPUtil.allEQMapPre( jingxiaoshang, "jingxiaoshang")); 
		JingxiaoshangView jingxiaoshangView =  jingxiaoshangService.selectView(ew);
		return R.ok("查询经销商成功").put("data", jingxiaoshangView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        JingxiaoshangEntity jingxiaoshang = jingxiaoshangService.selectById(id);
        return R.ok().put("data", jingxiaoshang);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        JingxiaoshangEntity jingxiaoshang = jingxiaoshangService.selectById(id);
        return R.ok().put("data", jingxiaoshang);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody JingxiaoshangEntity jingxiaoshang, HttpServletRequest request){
    	jingxiaoshang.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(jingxiaoshang);
    	JingxiaoshangEntity user = jingxiaoshangService.selectOne(new EntityWrapper<JingxiaoshangEntity>().eq("jingxiaoshangzhanghao", jingxiaoshang.getJingxiaoshangzhanghao()));
		if(user!=null) {
			return R.error("用户已存在");
		}

		jingxiaoshang.setId(new Date().getTime());
        jingxiaoshangService.insert(jingxiaoshang);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody JingxiaoshangEntity jingxiaoshang, HttpServletRequest request){
    	jingxiaoshang.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(jingxiaoshang);
    	JingxiaoshangEntity user = jingxiaoshangService.selectOne(new EntityWrapper<JingxiaoshangEntity>().eq("jingxiaoshangzhanghao", jingxiaoshang.getJingxiaoshangzhanghao()));
		if(user!=null) {
			return R.error("用户已存在");
		}

		jingxiaoshang.setId(new Date().getTime());
        jingxiaoshangService.insert(jingxiaoshang);
        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody JingxiaoshangEntity jingxiaoshang, HttpServletRequest request){
        //ValidatorUtils.validateEntity(jingxiaoshang);
        jingxiaoshangService.updateById(jingxiaoshang);//全部更新
        return R.ok();
    }
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        jingxiaoshangService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
    /**
     * 提醒接口
     */
	@RequestMapping("/remind/{columnName}/{type}")
	public R remindCount(@PathVariable("columnName") String columnName, HttpServletRequest request, 
						 @PathVariable("type") String type,@RequestParam Map<String, Object> map) {
		map.put("column", columnName);
		map.put("type", type);
		
		if(type.equals("2")) {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Calendar c = Calendar.getInstance();
			Date remindStartDate = null;
			Date remindEndDate = null;
			if(map.get("remindstart")!=null) {
				Integer remindStart = Integer.parseInt(map.get("remindstart").toString());
				c.setTime(new Date()); 
				c.add(Calendar.DAY_OF_MONTH,remindStart);
				remindStartDate = c.getTime();
				map.put("remindstart", sdf.format(remindStartDate));
			}
			if(map.get("remindend")!=null) {
				Integer remindEnd = Integer.parseInt(map.get("remindend").toString());
				c.setTime(new Date());
				c.add(Calendar.DAY_OF_MONTH,remindEnd);
				remindEndDate = c.getTime();
				map.put("remindend", sdf.format(remindEndDate));
			}
		}
		
		Wrapper<JingxiaoshangEntity> wrapper = new EntityWrapper<JingxiaoshangEntity>();
		if(map.get("remindstart")!=null) {
			wrapper.ge(columnName, map.get("remindstart"));
		}
		if(map.get("remindend")!=null) {
			wrapper.le(columnName, map.get("remindend"));
		}

		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("fengongsi")) {
			wrapper.eq("fengongsizhanghao", (String)request.getSession().getAttribute("username"));
		}

		int count = jingxiaoshangService.selectCount(wrapper);
		return R.ok().put("count", count);
	}
	
	





}
