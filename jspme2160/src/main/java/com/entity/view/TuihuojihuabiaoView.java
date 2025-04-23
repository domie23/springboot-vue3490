package com.entity.view;

import com.entity.TuihuojihuabiaoEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 退货计划表
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-04-21 15:54:45
 */
@TableName("tuihuojihuabiao")
public class TuihuojihuabiaoView  extends TuihuojihuabiaoEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public TuihuojihuabiaoView(){
	}
 
 	public TuihuojihuabiaoView(TuihuojihuabiaoEntity tuihuojihuabiaoEntity){
 	try {
			BeanUtils.copyProperties(this, tuihuojihuabiaoEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
