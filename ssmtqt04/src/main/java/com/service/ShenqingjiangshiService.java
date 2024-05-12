package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ShenqingjiangshiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ShenqingjiangshiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ShenqingjiangshiView;


/**
 * 申请讲师
 *
 * @author 
 * @email 
 * @date 2022-02-21 16:34:53
 */
public interface ShenqingjiangshiService extends IService<ShenqingjiangshiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ShenqingjiangshiVO> selectListVO(Wrapper<ShenqingjiangshiEntity> wrapper);
   	
   	ShenqingjiangshiVO selectVO(@Param("ew") Wrapper<ShenqingjiangshiEntity> wrapper);
   	
   	List<ShenqingjiangshiView> selectListView(Wrapper<ShenqingjiangshiEntity> wrapper);
   	
   	ShenqingjiangshiView selectView(@Param("ew") Wrapper<ShenqingjiangshiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ShenqingjiangshiEntity> wrapper);
   	

}

