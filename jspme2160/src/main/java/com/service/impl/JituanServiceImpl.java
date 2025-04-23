package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.JituanDao;
import com.entity.JituanEntity;
import com.service.JituanService;
import com.entity.vo.JituanVO;
import com.entity.view.JituanView;

@Service("jituanService")
public class JituanServiceImpl extends ServiceImpl<JituanDao, JituanEntity> implements JituanService {


    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<JituanEntity> page = this.selectPage(
                new Query<JituanEntity>(params).getPage(),
                new EntityWrapper<JituanEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<JituanEntity> wrapper) {
		  Page<JituanView> page =new Query<JituanView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<JituanVO> selectListVO(Wrapper<JituanEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public JituanVO selectVO(Wrapper<JituanEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<JituanView> selectListView(Wrapper<JituanEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public JituanView selectView(Wrapper<JituanEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
