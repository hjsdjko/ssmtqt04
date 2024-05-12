package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscussshipinkechengEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscussshipinkechengVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscussshipinkechengView;


/**
 * 视频课程评论表
 *
 * @author 
 * @email 
 * @date 2022-02-21 16:34:54
 */
public interface DiscussshipinkechengService extends IService<DiscussshipinkechengEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscussshipinkechengVO> selectListVO(Wrapper<DiscussshipinkechengEntity> wrapper);
   	
   	DiscussshipinkechengVO selectVO(@Param("ew") Wrapper<DiscussshipinkechengEntity> wrapper);
   	
   	List<DiscussshipinkechengView> selectListView(Wrapper<DiscussshipinkechengEntity> wrapper);
   	
   	DiscussshipinkechengView selectView(@Param("ew") Wrapper<DiscussshipinkechengEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscussshipinkechengEntity> wrapper);
   	

}

