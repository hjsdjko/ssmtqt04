package com.entity.view;

import com.entity.ShipinkechengEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 视频课程
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-02-21 16:34:53
 */
@TableName("shipinkecheng")
public class ShipinkechengView  extends ShipinkechengEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public ShipinkechengView(){
	}
 
 	public ShipinkechengView(ShipinkechengEntity shipinkechengEntity){
 	try {
			BeanUtils.copyProperties(this, shipinkechengEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
