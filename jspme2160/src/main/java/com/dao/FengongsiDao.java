package com.dao;

import com.entity.FengongsiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.FengongsiVO;
import com.entity.view.FengongsiView;


/**
 * 分公司
 * 
 * @author 
 * @email 
 * @date 2022-04-21 15:54:45
 */
public interface FengongsiDao extends BaseMapper<FengongsiEntity> {
	
	List<FengongsiVO> selectListVO(@Param("ew") Wrapper<FengongsiEntity> wrapper);
	
	FengongsiVO selectVO(@Param("ew") Wrapper<FengongsiEntity> wrapper);
	
	List<FengongsiView> selectListView(@Param("ew") Wrapper<FengongsiEntity> wrapper);

	List<FengongsiView> selectListView(Pagination page,@Param("ew") Wrapper<FengongsiEntity> wrapper);
	
	FengongsiView selectView(@Param("ew") Wrapper<FengongsiEntity> wrapper);
	

}
