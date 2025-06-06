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
 * 经销商
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2022-04-21 15:54:45
 */
@TableName("jingxiaoshang")
public class JingxiaoshangEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public JingxiaoshangEntity() {
		
	}
	
	public JingxiaoshangEntity(T t) {
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
	 * 分公司账号
	 */
					
	private String fengongsizhanghao;
	
	/**
	 * 分公司名
	 */
					
	private String fengongsiming;
	
	/**
	 * 经销商名
	 */
					
	private String jingxiaoshangming;
	
	/**
	 * 经销商账号
	 */
					
	private String jingxiaoshangzhanghao;
	
	/**
	 * 密码
	 */
					
	private String mima;
	
	/**
	 * 经销商地址
	 */
					
	private String jingxiaoshangdizhi;
	
	/**
	 * 是否审核
	 */
					
	private String sfsh;
	
	/**
	 * 审核回复
	 */
					
	private String shhf;
	
	
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
	 * 设置：分公司账号
	 */
	public void setFengongsizhanghao(String fengongsizhanghao) {
		this.fengongsizhanghao = fengongsizhanghao;
	}
	/**
	 * 获取：分公司账号
	 */
	public String getFengongsizhanghao() {
		return fengongsizhanghao;
	}
	/**
	 * 设置：分公司名
	 */
	public void setFengongsiming(String fengongsiming) {
		this.fengongsiming = fengongsiming;
	}
	/**
	 * 获取：分公司名
	 */
	public String getFengongsiming() {
		return fengongsiming;
	}
	/**
	 * 设置：经销商名
	 */
	public void setJingxiaoshangming(String jingxiaoshangming) {
		this.jingxiaoshangming = jingxiaoshangming;
	}
	/**
	 * 获取：经销商名
	 */
	public String getJingxiaoshangming() {
		return jingxiaoshangming;
	}
	/**
	 * 设置：经销商账号
	 */
	public void setJingxiaoshangzhanghao(String jingxiaoshangzhanghao) {
		this.jingxiaoshangzhanghao = jingxiaoshangzhanghao;
	}
	/**
	 * 获取：经销商账号
	 */
	public String getJingxiaoshangzhanghao() {
		return jingxiaoshangzhanghao;
	}
	/**
	 * 设置：密码
	 */
	public void setMima(String mima) {
		this.mima = mima;
	}
	/**
	 * 获取：密码
	 */
	public String getMima() {
		return mima;
	}
	/**
	 * 设置：经销商地址
	 */
	public void setJingxiaoshangdizhi(String jingxiaoshangdizhi) {
		this.jingxiaoshangdizhi = jingxiaoshangdizhi;
	}
	/**
	 * 获取：经销商地址
	 */
	public String getJingxiaoshangdizhi() {
		return jingxiaoshangdizhi;
	}
	/**
	 * 设置：是否审核
	 */
	public void setSfsh(String sfsh) {
		this.sfsh = sfsh;
	}
	/**
	 * 获取：是否审核
	 */
	public String getSfsh() {
		return sfsh;
	}
	/**
	 * 设置：审核回复
	 */
	public void setShhf(String shhf) {
		this.shhf = shhf;
	}
	/**
	 * 获取：审核回复
	 */
	public String getShhf() {
		return shhf;
	}

}
