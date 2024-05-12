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
 * 视频课程
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2022-02-21 16:34:53
 */
@TableName("shipinkecheng")
public class ShipinkechengEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public ShipinkechengEntity() {
		
	}
	
	public ShipinkechengEntity(T t) {
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
	 * 题目
	 */
					
	private String timu;
	
	/**
	 * 科目分类
	 */
					
	private String kemufenlei;
	
	/**
	 * 图片
	 */
					
	private String tupian;
	
	/**
	 * 讲师工号
	 */
					
	private String jiangshigonghao;
	
	/**
	 * 讲师姓名
	 */
					
	private String jiangshixingming;
	
	/**
	 * 答案
	 */
					
	private String daan;
	
	/**
	 * 发布时间
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 		
	private Date fabushijian;
	
	/**
	 * 解析
	 */
					
	private String jiexi;
	
	/**
	 * 视频
	 */
					
	private String shipin;
	
	/**
	 * 是否审核
	 */
					
	private String sfsh;
	
	/**
	 * 审核回复
	 */
					
	private String shhf;
	
	/**
	 * 赞
	 */
					
	private Integer thumbsupnum;
	
	/**
	 * 踩
	 */
					
	private Integer crazilynum;
	
	
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
	 * 设置：题目
	 */
	public void setTimu(String timu) {
		this.timu = timu;
	}
	/**
	 * 获取：题目
	 */
	public String getTimu() {
		return timu;
	}
	/**
	 * 设置：科目分类
	 */
	public void setKemufenlei(String kemufenlei) {
		this.kemufenlei = kemufenlei;
	}
	/**
	 * 获取：科目分类
	 */
	public String getKemufenlei() {
		return kemufenlei;
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
	 * 设置：讲师工号
	 */
	public void setJiangshigonghao(String jiangshigonghao) {
		this.jiangshigonghao = jiangshigonghao;
	}
	/**
	 * 获取：讲师工号
	 */
	public String getJiangshigonghao() {
		return jiangshigonghao;
	}
	/**
	 * 设置：讲师姓名
	 */
	public void setJiangshixingming(String jiangshixingming) {
		this.jiangshixingming = jiangshixingming;
	}
	/**
	 * 获取：讲师姓名
	 */
	public String getJiangshixingming() {
		return jiangshixingming;
	}
	/**
	 * 设置：答案
	 */
	public void setDaan(String daan) {
		this.daan = daan;
	}
	/**
	 * 获取：答案
	 */
	public String getDaan() {
		return daan;
	}
	/**
	 * 设置：发布时间
	 */
	public void setFabushijian(Date fabushijian) {
		this.fabushijian = fabushijian;
	}
	/**
	 * 获取：发布时间
	 */
	public Date getFabushijian() {
		return fabushijian;
	}
	/**
	 * 设置：解析
	 */
	public void setJiexi(String jiexi) {
		this.jiexi = jiexi;
	}
	/**
	 * 获取：解析
	 */
	public String getJiexi() {
		return jiexi;
	}
	/**
	 * 设置：视频
	 */
	public void setShipin(String shipin) {
		this.shipin = shipin;
	}
	/**
	 * 获取：视频
	 */
	public String getShipin() {
		return shipin;
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
	/**
	 * 设置：赞
	 */
	public void setThumbsupnum(Integer thumbsupnum) {
		this.thumbsupnum = thumbsupnum;
	}
	/**
	 * 获取：赞
	 */
	public Integer getThumbsupnum() {
		return thumbsupnum;
	}
	/**
	 * 设置：踩
	 */
	public void setCrazilynum(Integer crazilynum) {
		this.crazilynum = crazilynum;
	}
	/**
	 * 获取：踩
	 */
	public Integer getCrazilynum() {
		return crazilynum;
	}

}
