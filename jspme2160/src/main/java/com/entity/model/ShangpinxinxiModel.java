package com.entity.model;

import com.entity.ShangpinxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
 

/**
 * 商品信息
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2022-04-21 15:54:45
 */
public class ShangpinxinxiModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 所属id
	 */
	
	private String suoshuid;
		
	/**
	 * 商品名
	 */
	
	private String shangpinming;
		
	/**
	 * 品类
	 */
	
	private String pinlei;
		
	/**
	 * 商品编号
	 */
	
	private String shangpinbianhao;
		
	/**
	 * 规格
	 */
	
	private String guige;
		
	/**
	 * 材质
	 */
	
	private String caizhi;
		
	/**
	 * 基重
	 */
	
	private String jizhong;
		
	/**
	 * 数量
	 */
	
	private String shuliang;
		
	/**
	 * 定尺
	 */
	
	private String dingchi;
		
	/**
	 * 品牌名称
	 */
	
	private String pinpaimingcheng;
		
	/**
	 * nc商品编号
	 */
	
	private String ncshangpinbianhao;
		
	/**
	 * 图片
	 */
	
	private String tupian;
				
	
	/**
	 * 设置：所属id
	 */
	 
	public void setSuoshuid(String suoshuid) {
		this.suoshuid = suoshuid;
	}
	
	/**
	 * 获取：所属id
	 */
	public String getSuoshuid() {
		return suoshuid;
	}
				
	
	/**
	 * 设置：商品名
	 */
	 
	public void setShangpinming(String shangpinming) {
		this.shangpinming = shangpinming;
	}
	
	/**
	 * 获取：商品名
	 */
	public String getShangpinming() {
		return shangpinming;
	}
				
	
	/**
	 * 设置：品类
	 */
	 
	public void setPinlei(String pinlei) {
		this.pinlei = pinlei;
	}
	
	/**
	 * 获取：品类
	 */
	public String getPinlei() {
		return pinlei;
	}
				
	
	/**
	 * 设置：商品编号
	 */
	 
	public void setShangpinbianhao(String shangpinbianhao) {
		this.shangpinbianhao = shangpinbianhao;
	}
	
	/**
	 * 获取：商品编号
	 */
	public String getShangpinbianhao() {
		return shangpinbianhao;
	}
				
	
	/**
	 * 设置：规格
	 */
	 
	public void setGuige(String guige) {
		this.guige = guige;
	}
	
	/**
	 * 获取：规格
	 */
	public String getGuige() {
		return guige;
	}
				
	
	/**
	 * 设置：材质
	 */
	 
	public void setCaizhi(String caizhi) {
		this.caizhi = caizhi;
	}
	
	/**
	 * 获取：材质
	 */
	public String getCaizhi() {
		return caizhi;
	}
				
	
	/**
	 * 设置：基重
	 */
	 
	public void setJizhong(String jizhong) {
		this.jizhong = jizhong;
	}
	
	/**
	 * 获取：基重
	 */
	public String getJizhong() {
		return jizhong;
	}
				
	
	/**
	 * 设置：数量
	 */
	 
	public void setShuliang(String shuliang) {
		this.shuliang = shuliang;
	}
	
	/**
	 * 获取：数量
	 */
	public String getShuliang() {
		return shuliang;
	}
				
	
	/**
	 * 设置：定尺
	 */
	 
	public void setDingchi(String dingchi) {
		this.dingchi = dingchi;
	}
	
	/**
	 * 获取：定尺
	 */
	public String getDingchi() {
		return dingchi;
	}
				
	
	/**
	 * 设置：品牌名称
	 */
	 
	public void setPinpaimingcheng(String pinpaimingcheng) {
		this.pinpaimingcheng = pinpaimingcheng;
	}
	
	/**
	 * 获取：品牌名称
	 */
	public String getPinpaimingcheng() {
		return pinpaimingcheng;
	}
				
	
	/**
	 * 设置：nc商品编号
	 */
	 
	public void setNcshangpinbianhao(String ncshangpinbianhao) {
		this.ncshangpinbianhao = ncshangpinbianhao;
	}
	
	/**
	 * 获取：nc商品编号
	 */
	public String getNcshangpinbianhao() {
		return ncshangpinbianhao;
	}
				
	
	/**
	 * 设置：图片
	 */
	 
	public void setTupian(String tupian) {
		this.tupian = tupian;
	}
	
	/**
	 * 获取：图片
	 */
	public String getTupian() {
		return tupian;
	}
			
}
