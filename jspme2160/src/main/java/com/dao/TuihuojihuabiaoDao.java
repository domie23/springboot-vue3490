package com.dao;

import com.entity.TuihuojihuabiaoEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.TuihuojihuabiaoVO;
import com.entity.view.TuihuojihuabiaoView;


/**
 * 退货计划表
 * 
 * @author 
 * @email 
 * @date 2022-04-21 15:54:45
 */
public interface TuihuojihuabiaoDao extends BaseMapper<TuihuojihuabiaoEntity> {
	
	List<TuihuojihuabiaoVO> selectListVO(@Param("ew") Wrapper<TuihuojihuabiaoEntity> wrapper);
	
	TuihuojihuabiaoVO selectVO(@Param("ew") Wrapper<TuihuojihuabiaoEntity> wrapper);
	
	List<TuihuojihuabiaoView> selectListView(@Param("ew") Wrapper<TuihuojihuabiaoEntity> wrapper);

	List<TuihuojihuabiaoView> selectListView(Pagination page,@Param("ew") Wrapper<TuihuojihuabiaoEntity> wrapper);
	
	TuihuojihuabiaoView selectView(@Param("ew") Wrapper<TuihuojihuabiaoEntity> wrapper);
	

}
