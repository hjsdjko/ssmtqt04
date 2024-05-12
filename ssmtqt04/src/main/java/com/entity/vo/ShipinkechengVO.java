package com.entity.vo;

import com.entity.ShipinkechengEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 视频课程
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2022-02-21 16:34:53
 */
public class ShipinkechengVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
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
