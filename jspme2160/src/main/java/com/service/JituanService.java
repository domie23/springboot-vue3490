package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.JituanEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.JituanVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.JituanView;


/**
 * 集团
 *
 * @author 
 * @email 
 * @date 2022-04-21 15:54:45
 */
public interface JituanService extends IService<JituanEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<JituanVO> selectListVO(Wrapper<JituanEntity> wrapper);
   	
   	JituanVO selectVO(@Param("ew") Wrapper<JituanEntity> wrapper);
   	
   	List<JituanView> selectListView(Wrapper<JituanEntity> wrapper);
   	
   	JituanView selectView(@Param("ew") Wrapper<JituanEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<JituanEntity> wrapper);
   	

}

