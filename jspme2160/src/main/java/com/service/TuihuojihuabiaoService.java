package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.TuihuojihuabiaoEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.TuihuojihuabiaoVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.TuihuojihuabiaoView;


/**
 * 退货计划表
 *
 * @author 
 * @email 
 * @date 2022-04-21 15:54:45
 */
public interface TuihuojihuabiaoService extends IService<TuihuojihuabiaoEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<TuihuojihuabiaoVO> selectListVO(Wrapper<TuihuojihuabiaoEntity> wrapper);
   	
   	TuihuojihuabiaoVO selectVO(@Param("ew") Wrapper<TuihuojihuabiaoEntity> wrapper);
   	
   	List<TuihuojihuabiaoView> selectListView(Wrapper<TuihuojihuabiaoEntity> wrapper);
   	
   	TuihuojihuabiaoView selectView(@Param("ew") Wrapper<TuihuojihuabiaoEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<TuihuojihuabiaoEntity> wrapper);
   	

}

