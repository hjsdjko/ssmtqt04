package com.entity.view;

import com.entity.KemufenleiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 科目分类
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-02-21 16:34:53
 */
@TableName("kemufenlei")
public class KemufenleiView  extends KemufenleiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public KemufenleiView(){
	}
 
 	public KemufenleiView(KemufenleiEntity kemufenleiEntity){
 	try {
			BeanUtils.copyProperties(this, kemufenleiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
