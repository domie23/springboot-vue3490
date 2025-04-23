package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DinghuojihuabiaoEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DinghuojihuabiaoVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DinghuojihuabiaoView;


/**
 * 订货计划表
 *
 * @author 
 * @email 
 * @date 2022-04-21 15:54:45
 */
public interface DinghuojihuabiaoService extends IService<DinghuojihuabiaoEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DinghuojihuabiaoVO> selectListVO(Wrapper<DinghuojihuabiaoEntity> wrapper);
   	
   	DinghuojihuabiaoVO selectVO(@Param("ew") Wrapper<DinghuojihuabiaoEntity> wrapper);
   	
   	List<DinghuojihuabiaoView> selectListView(Wrapper<DinghuojihuabiaoEntity> wrapper);
   	
   	DinghuojihuabiaoView selectView(@Param("ew") Wrapper<DinghuojihuabiaoEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DinghuojihuabiaoEntity> wrapper);
   	

}

