package com.dao;

import com.entity.ShipinkechengEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ShipinkechengVO;
import com.entity.view.ShipinkechengView;


/**
 * 视频课程
 * 
 * @author 
 * @email 
 * @date 2022-02-21 16:34:53
 */
public interface ShipinkechengDao extends BaseMapper<ShipinkechengEntity> {
	
	List<ShipinkechengVO> selectListVO(@Param("ew") Wrapper<ShipinkechengEntity> wrapper);
	
	ShipinkechengVO selectVO(@Param("ew") Wrapper<ShipinkechengEntity> wrapper);
	
	List<ShipinkechengView> selectListView(@Param("ew") Wrapper<ShipinkechengEntity> wrapper);

	List<ShipinkechengView> selectListView(Pagination page,@Param("ew") Wrapper<ShipinkechengEntity> wrapper);
	
	ShipinkechengView selectView(@Param("ew") Wrapper<ShipinkechengEntity> wrapper);
	

}
