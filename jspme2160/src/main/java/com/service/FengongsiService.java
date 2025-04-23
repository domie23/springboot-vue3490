package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.FengongsiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.FengongsiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.FengongsiView;


/**
 * 分公司
 *
 * @author 
 * @email 
 * @date 2022-04-21 15:54:45
 */
public interface FengongsiService extends IService<FengongsiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<FengongsiVO> selectListVO(Wrapper<FengongsiEntity> wrapper);
   	
   	FengongsiVO selectVO(@Param("ew") Wrapper<FengongsiEntity> wrapper);
   	
   	List<FengongsiView> selectListView(Wrapper<FengongsiEntity> wrapper);
   	
   	FengongsiView selectView(@Param("ew") Wrapper<FengongsiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<FengongsiEntity> wrapper);
   	

}

