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


import com.dao.TuihuojihuabiaoDao;
import com.entity.TuihuojihuabiaoEntity;
import com.service.TuihuojihuabiaoService;
import com.entity.vo.TuihuojihuabiaoVO;
import com.entity.view.TuihuojihuabiaoView;

@Service("tuihuojihuabiaoService")
public class TuihuojihuabiaoServiceImpl extends ServiceImpl<TuihuojihuabiaoDao, TuihuojihuabiaoEntity> implements TuihuojihuabiaoService {


    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<TuihuojihuabiaoEntity> page = this.selectPage(
                new Query<TuihuojihuabiaoEntity>(params).getPage(),
                new EntityWrapper<TuihuojihuabiaoEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<TuihuojihuabiaoEntity> wrapper) {
		  Page<TuihuojihuabiaoView> page =new Query<TuihuojihuabiaoView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<TuihuojihuabiaoVO> selectListVO(Wrapper<TuihuojihuabiaoEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public TuihuojihuabiaoVO selectVO(Wrapper<TuihuojihuabiaoEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<TuihuojihuabiaoView> selectListView(Wrapper<TuihuojihuabiaoEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public TuihuojihuabiaoView selectView(Wrapper<TuihuojihuabiaoEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
