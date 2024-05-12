package com.entity.view;

import com.entity.ShenqingjiangshiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 申请讲师
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-02-21 16:34:53
 */
@TableName("shenqingjiangshi")
public class ShenqingjiangshiView  extends ShenqingjiangshiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public ShenqingjiangshiView(){
	}
 
 	public ShenqingjiangshiView(ShenqingjiangshiEntity shenqingjiangshiEntity){
 	try {
			BeanUtils.copyProperties(this, shenqingjiangshiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
