package com.entity.vo;

import com.entity.JingxiaoshangEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 经销商
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2022-04-21 15:54:45
 */
public class JingxiaoshangVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
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
