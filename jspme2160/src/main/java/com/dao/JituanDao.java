package com.dao;

import com.entity.JituanEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.JituanVO;
import com.entity.view.JituanView;


/**
 * 集团
 * 
 * @author 
 * @email 
 * @date 2022-04-21 15:54:45
 */
public interface JituanDao extends BaseMapper<JituanEntity> {
	
	List<JituanVO> selectListVO(@Param("ew") Wrapper<JituanEntity> wrapper);
	
	JituanVO selectVO(@Param("ew") Wrapper<JituanEntity> wrapper);
	
	List<JituanView> selectListView(@Param("ew") Wrapper<JituanEntity> wrapper);

	List<JituanView> selectListView(Pagination page,@Param("ew") Wrapper<JituanEntity> wrapper);
	
	JituanView selectView(@Param("ew") Wrapper<JituanEntity> wrapper);
	

}
