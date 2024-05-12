package com.dao;

import com.entity.DiscussshipinkechengEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscussshipinkechengVO;
import com.entity.view.DiscussshipinkechengView;


/**
 * 视频课程评论表
 * 
 * @author 
 * @email 
 * @date 2022-02-21 16:34:54
 */
public interface DiscussshipinkechengDao extends BaseMapper<DiscussshipinkechengEntity> {
	
	List<DiscussshipinkechengVO> selectListVO(@Param("ew") Wrapper<DiscussshipinkechengEntity> wrapper);
	
	DiscussshipinkechengVO selectVO(@Param("ew") Wrapper<DiscussshipinkechengEntity> wrapper);
	
	List<DiscussshipinkechengView> selectListView(@Param("ew") Wrapper<DiscussshipinkechengEntity> wrapper);

	List<DiscussshipinkechengView> selectListView(Pagination page,@Param("ew") Wrapper<DiscussshipinkechengEntity> wrapper);
	
	DiscussshipinkechengView selectView(@Param("ew") Wrapper<DiscussshipinkechengEntity> wrapper);
	

}
