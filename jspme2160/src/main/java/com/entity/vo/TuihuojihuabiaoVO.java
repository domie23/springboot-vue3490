package com.entity.vo;

import com.entity.TuihuojihuabiaoEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 退货计划表
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2022-04-21 15:54:45
 */
public class TuihuojihuabiaoVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 生成时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date shengchengshijian;
		
	/**
	 * 商品id
	 */
	
	private String shangpinid;
		
	/**
	 * 商品名
	 */
	
	private String shangpinming;
		
	/**
	 * 数量
	 */
	
	private String shuliang;
		
	/**
	 * 分公司账号
	 */
	
	private String fengongsizhanghao;
		
	/**
	 * 分公司名
	 */
	
	private String fengongsiming;
		
	/**
	 * 经销商账号
	 */
	
	private String jingxiaoshangzhanghao;
		
	/**
	 * 经销商名
	 */
	
	private String jingxiaoshangming;
		
	/**
	 * 是否审核
	 */
	
	private String sfsh;
		
	/**
	 * 审核回复
	 */
	
	private String shhf;
				
	
	/**
	 * 设置：生成时间
	 */
	 
	public void setShengchengshijian(Date shengchengshijian) {
		this.shengchengshijian = shengchengshijian;
	}
	
	/**
	 * 获取：生成时间
	 */
	public Date getShengchengshijian() {
		return shengchengshijian;
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
