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
 * 停车场
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2023-02-17 17:06:48
 */
@TableName("tingchechang")
public class TingchechangEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public TingchechangEntity() {
		
	}
	
	public TingchechangEntity(T t) {
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
	 * 车场编号
	 */
					
	private String chechangbianhao;
	
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
	 * 设置：车场编号
	 */
	public void setChechangbianhao(String chechangbianhao) {
		this.chechangbianhao = chechangbianhao;
	}
	/**
	 * 获取：车场编号
	 */
	public String getChechangbianhao() {
		return chechangbianhao;
	}
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
