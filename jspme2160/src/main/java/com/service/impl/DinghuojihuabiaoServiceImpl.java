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


import com.dao.DinghuojihuabiaoDao;
import com.entity.DinghuojihuabiaoEntity;
import com.service.DinghuojihuabiaoService;
import com.entity.vo.DinghuojihuabiaoVO;
import com.entity.view.DinghuojihuabiaoView;

@Service("dinghuojihuabiaoService")
public class DinghuojihuabiaoServiceImpl extends ServiceImpl<DinghuojihuabiaoDao, DinghuojihuabiaoEntity> implements DinghuojihuabiaoService {


    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DinghuojihuabiaoEntity> page = this.selectPage(
                new Query<DinghuojihuabiaoEntity>(params).getPage(),
                new EntityWrapper<DinghuojihuabiaoEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DinghuojihuabiaoEntity> wrapper) {
		  Page<DinghuojihuabiaoView> page =new Query<DinghuojihuabiaoView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DinghuojihuabiaoVO> selectListVO(Wrapper<DinghuojihuabiaoEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DinghuojihuabiaoVO selectVO(Wrapper<DinghuojihuabiaoEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DinghuojihuabiaoView> selectListView(Wrapper<DinghuojihuabiaoEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DinghuojihuabiaoView selectView(Wrapper<DinghuojihuabiaoEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
