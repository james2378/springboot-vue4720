package com.entity.view;

import com.entity.TingchegonggaoEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 停车公告
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2023-02-17 17:06:48
 */
@TableName("tingchegonggao")
public class TingchegonggaoView  extends TingchegonggaoEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public TingchegonggaoView(){
	}
 
 	public TingchegonggaoView(TingchegonggaoEntity tingchegonggaoEntity){
 	try {
			BeanUtils.copyProperties(this, tingchegonggaoEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
