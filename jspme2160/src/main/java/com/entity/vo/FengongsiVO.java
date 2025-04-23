package com.entity.vo;

import com.entity.FengongsiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 分公司
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2022-04-21 15:54:45
 */
public class FengongsiVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 分公司名
	 */
	
	private String fengongsiming;
		
	/**
	 * 分公司账号
	 */
	
	private String fengongsizhanghao;
		
	/**
	 * 密码
	 */
	
	private String mima;
		
	/**
	 * 分公司地址
	 */
	
	private String fengongsidizhi;
		
	/**
	 * 是否审核
	 */
	
	private String sfsh;
		
	/**
	 * 审核回复
	 */
	
	private String shhf;
				
	
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
	 * 设置：分公司地址
	 */
	 
	public void setFengongsidizhi(String fengongsidizhi) {
		this.fengongsidizhi = fengongsidizhi;
	}
	
	/**
	 * 获取：分公司地址
	 */
	public String getFengongsidizhi() {
		return fengongsidizhi;
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
