package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.ShenqingjiangshiDao;
import com.entity.ShenqingjiangshiEntity;
import com.service.ShenqingjiangshiService;
import com.entity.vo.ShenqingjiangshiVO;
import com.entity.view.ShenqingjiangshiView;

@Service("shenqingjiangshiService")
public class ShenqingjiangshiServiceImpl extends ServiceImpl<ShenqingjiangshiDao, ShenqingjiangshiEntity> implements ShenqingjiangshiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ShenqingjiangshiEntity> page = this.selectPage(
                new Query<ShenqingjiangshiEntity>(params).getPage(),
                new EntityWrapper<ShenqingjiangshiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ShenqingjiangshiEntity> wrapper) {
		  Page<ShenqingjiangshiView> page =new Query<ShenqingjiangshiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ShenqingjiangshiVO> selectListVO(Wrapper<ShenqingjiangshiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ShenqingjiangshiVO selectVO(Wrapper<ShenqingjiangshiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ShenqingjiangshiView> selectListView(Wrapper<ShenqingjiangshiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ShenqingjiangshiView selectView(Wrapper<ShenqingjiangshiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
