package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.JingxiaoshangEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.JingxiaoshangVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.JingxiaoshangView;


/**
 * 经销商
 *
 * @author 
 * @email 
 * @date 2022-04-21 15:54:45
 */
public interface JingxiaoshangService extends IService<JingxiaoshangEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<JingxiaoshangVO> selectListVO(Wrapper<JingxiaoshangEntity> wrapper);
   	
   	JingxiaoshangVO selectVO(@Param("ew") Wrapper<JingxiaoshangEntity> wrapper);
   	
   	List<JingxiaoshangView> selectListView(Wrapper<JingxiaoshangEntity> wrapper);
   	
   	JingxiaoshangView selectView(@Param("ew") Wrapper<JingxiaoshangEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<JingxiaoshangEntity> wrapper);
   	

}

