package com.entity.view;

import com.entity.JituanEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 集团
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-04-21 15:54:45
 */
@TableName("jituan")
public class JituanView  extends JituanEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public JituanView(){
	}
 
 	public JituanView(JituanEntity jituanEntity){
 	try {
			BeanUtils.copyProperties(this, jituanEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
