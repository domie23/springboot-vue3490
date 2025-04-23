package com.dao;

import com.entity.DinghuojihuabiaoEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DinghuojihuabiaoVO;
import com.entity.view.DinghuojihuabiaoView;


/**
 * 订货计划表
 * 
 * @author 
 * @email 
 * @date 2022-04-21 15:54:45
 */
public interface DinghuojihuabiaoDao extends BaseMapper<DinghuojihuabiaoEntity> {
	
	List<DinghuojihuabiaoVO> selectListVO(@Param("ew") Wrapper<DinghuojihuabiaoEntity> wrapper);
	
	DinghuojihuabiaoVO selectVO(@Param("ew") Wrapper<DinghuojihuabiaoEntity> wrapper);
	
	List<DinghuojihuabiaoView> selectListView(@Param("ew") Wrapper<DinghuojihuabiaoEntity> wrapper);

	List<DinghuojihuabiaoView> selectListView(Pagination page,@Param("ew") Wrapper<DinghuojihuabiaoEntity> wrapper);
	
	DinghuojihuabiaoView selectView(@Param("ew") Wrapper<DinghuojihuabiaoEntity> wrapper);
	

}
