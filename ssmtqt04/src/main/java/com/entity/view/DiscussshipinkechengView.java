package com.entity.view;

import com.entity.DiscussshipinkechengEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 视频课程评论表
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-02-21 16:34:54
 */
@TableName("discussshipinkecheng")
public class DiscussshipinkechengView  extends DiscussshipinkechengEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public DiscussshipinkechengView(){
	}
 
 	public DiscussshipinkechengView(DiscussshipinkechengEntity discussshipinkechengEntity){
 	try {
			BeanUtils.copyProperties(this, discussshipinkechengEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
