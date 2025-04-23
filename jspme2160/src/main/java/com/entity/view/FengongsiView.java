package com.entity.view;

import com.entity.FengongsiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 分公司
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-04-21 15:54:45
 */
@TableName("fengongsi")
public class FengongsiView  extends FengongsiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public FengongsiView(){
	}
 
 	public FengongsiView(FengongsiEntity fengongsiEntity){
 	try {
			BeanUtils.copyProperties(this, fengongsiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
