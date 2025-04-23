package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;


/**
 * 商品信息
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2022-04-21 15:54:45
 */
@TableName("shangpinxinxi")
public class ShangpinxinxiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public ShangpinxinxiEntity() {
		
	}
	
	public ShangpinxinxiEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
	@TableId
	private Long id;
	/**
	 * 商品id
	 */
					
	private String shangpinid;
	
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
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 设置：商品id
	 */
	public void setShangpinid(String shangpinid) {
		this.shangpinid = shangpinid;
	}
	/**
	 * 获取：商品id
	 */
	public String getShangpinid() {
		return shangpinid;
	}
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
