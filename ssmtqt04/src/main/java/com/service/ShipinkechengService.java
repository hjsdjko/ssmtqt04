package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ShipinkechengEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ShipinkechengVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ShipinkechengView;


/**
 * 视频课程
 *
 * @author 
 * @email 
 * @date 2022-02-21 16:34:53
 */
public interface ShipinkechengService extends IService<ShipinkechengEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ShipinkechengVO> selectListVO(Wrapper<ShipinkechengEntity> wrapper);
   	
   	ShipinkechengVO selectVO(@Param("ew") Wrapper<ShipinkechengEntity> wrapper);
   	
   	List<ShipinkechengView> selectListView(Wrapper<ShipinkechengEntity> wrapper);
   	
   	ShipinkechengView selectView(@Param("ew") Wrapper<ShipinkechengEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ShipinkechengEntity> wrapper);
   	

}

