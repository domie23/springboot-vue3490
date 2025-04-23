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


import com.dao.FengongsiDao;
import com.entity.FengongsiEntity;
import com.service.FengongsiService;
import com.entity.vo.FengongsiVO;
import com.entity.view.FengongsiView;

@Service("fengongsiService")
public class FengongsiServiceImpl extends ServiceImpl<FengongsiDao, FengongsiEntity> implements FengongsiService {


    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<FengongsiEntity> page = this.selectPage(
                new Query<FengongsiEntity>(params).getPage(),
                new EntityWrapper<FengongsiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<FengongsiEntity> wrapper) {
		  Page<FengongsiView> page =new Query<FengongsiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<FengongsiVO> selectListVO(Wrapper<FengongsiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public FengongsiVO selectVO(Wrapper<FengongsiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<FengongsiView> selectListView(Wrapper<FengongsiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public FengongsiView selectView(Wrapper<FengongsiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
