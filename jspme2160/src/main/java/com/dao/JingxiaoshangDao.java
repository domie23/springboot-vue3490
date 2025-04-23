package com.dao;

import com.entity.JingxiaoshangEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.JingxiaoshangVO;
import com.entity.view.JingxiaoshangView;


/**
 * 经销商
 * 
 * @author 
 * @email 
 * @date 2022-04-21 15:54:45
 */
public interface JingxiaoshangDao extends BaseMapper<JingxiaoshangEntity> {
	
	List<JingxiaoshangVO> selectListVO(@Param("ew") Wrapper<JingxiaoshangEntity> wrapper);
	
	JingxiaoshangVO selectVO(@Param("ew") Wrapper<JingxiaoshangEntity> wrapper);
	
	List<JingxiaoshangView> selectListView(@Param("ew") Wrapper<JingxiaoshangEntity> wrapper);

	List<JingxiaoshangView> selectListView(Pagination page,@Param("ew") Wrapper<JingxiaoshangEntity> wrapper);
	
	JingxiaoshangView selectView(@Param("ew") Wrapper<JingxiaoshangEntity> wrapper);
	

}
