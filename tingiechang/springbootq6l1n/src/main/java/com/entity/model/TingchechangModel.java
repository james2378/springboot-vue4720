package com.entity.model;

import com.entity.TingchechangEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 停车场
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2023-02-17 17:06:48
 */
public class TingchechangModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 车场名称
	 */
	
	private String chechangmingcheng;
		
	/**
	 * 车场类型
	 */
	
	private String chechangleixing;
		
	/**
	 * 图片
	 */
	
	private String tupian;
		
	/**
	 * 车位详情
	 */
	
	private String cheweixiangqing;
		
	/**
	 * 车位数量
	 */
	
	private Integer cheweishuliang;
		
	/**
	 * 车位状态
	 */
	
	private String cheweizhuangtai;
		
	/**
	 * 小时价格
	 */
	
	private Integer xiaoshijiage;
		
	/**
	 * 包月价格
	 */
	
	private Integer baoyuejiage;
		
	/**
	 * 位置
	 */
	
	private String weizhi;
		
	/**
	 * 咨询电话
	 */
	
	private String zixundianhua;
		
	/**
	 * 备注
	 */
	
	private String beizhu;
				
	
	/**
	 * 设置：车场名称
	 */
	 
	public void setChechangmingcheng(String chechangmingcheng) {
		this.chechangmingcheng = chechangmingcheng;
	}
	
	/**
	 * 获取：车场名称
	 */
	public String getChechangmingcheng() {
		return chechangmingcheng;
	}
				
	
	/**
	 * 设置：车场类型
	 */
	 
	public void setChechangleixing(String chechangleixing) {
		this.chechangleixing = chechangleixing;
	}
	
	/**
	 * 获取：车场类型
	 */
	public String getChechangleixing() {
		return chechangleixing;
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
				
	
	/**
	 * 设置：车位详情
	 */
	 
	public void setCheweixiangqing(String cheweixiangqing) {
		this.cheweixiangqing = cheweixiangqing;
	}
	
	/**
	 * 获取：车位详情
	 */
	public String getCheweixiangqing() {
		return cheweixiangqing;
	}
				
	
	/**
	 * 设置：车位数量
	 */
	 
	public void setCheweishuliang(Integer cheweishuliang) {
		this.cheweishuliang = cheweishuliang;
	}
	
	/**
	 * 获取：车位数量
	 */
	public Integer getCheweishuliang() {
		return cheweishuliang;
	}
				
	
	/**
	 * 设置：车位状态
	 */
	 
	public void setCheweizhuangtai(String cheweizhuangtai) {
		this.cheweizhuangtai = cheweizhuangtai;
	}
	
	/**
	 * 获取：车位状态
	 */
	public String getCheweizhuangtai() {
		return cheweizhuangtai;
	}
				
	
	/**
	 * 设置：小时价格
	 */
	 
	public void setXiaoshijiage(Integer xiaoshijiage) {
		this.xiaoshijiage = xiaoshijiage;
	}
	
	/**
	 * 获取：小时价格
	 */
	public Integer getXiaoshijiage() {
		return xiaoshijiage;
	}
				
	
	/**
	 * 设置：包月价格
	 */
	 
	public void setBaoyuejiage(Integer baoyuejiage) {
		this.baoyuejiage = baoyuejiage;
	}
	
	/**
	 * 获取：包月价格
	 */
	public Integer getBaoyuejiage() {
		return baoyuejiage;
	}
				
	
	/**
	 * 设置：位置
	 */
	 
	public void setWeizhi(String weizhi) {
		this.weizhi = weizhi;
	}
	
	/**
	 * 获取：位置
	 */
	public String getWeizhi() {
		return weizhi;
	}
				
	
	/**
	 * 设置：咨询电话
	 */
	 
	public void setZixundianhua(String zixundianhua) {
		this.zixundianhua = zixundianhua;
	}
	
	/**
	 * 获取：咨询电话
	 */
	public String getZixundianhua() {
		return zixundianhua;
	}
				
	
	/**
	 * 设置：备注
	 */
	 
	public void setBeizhu(String beizhu) {
		this.beizhu = beizhu;
	}
	
	/**
	 * 获取：备注
	 */
	public String getBeizhu() {
		return beizhu;
	}
			
}
