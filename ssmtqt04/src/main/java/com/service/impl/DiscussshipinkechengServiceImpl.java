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


import com.dao.DiscussshipinkechengDao;
import com.entity.DiscussshipinkechengEntity;
import com.service.DiscussshipinkechengService;
import com.entity.vo.DiscussshipinkechengVO;
import com.entity.view.DiscussshipinkechengView;

@Service("discussshipinkechengService")
public class DiscussshipinkechengServiceImpl extends ServiceImpl<DiscussshipinkechengDao, DiscussshipinkechengEntity> implements DiscussshipinkechengService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscussshipinkechengEntity> page = this.selectPage(
                new Query<DiscussshipinkechengEntity>(params).getPage(),
                new EntityWrapper<DiscussshipinkechengEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscussshipinkechengEntity> wrapper) {
		  Page<DiscussshipinkechengView> page =new Query<DiscussshipinkechengView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscussshipinkechengVO> selectListVO(Wrapper<DiscussshipinkechengEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscussshipinkechengVO selectVO(Wrapper<DiscussshipinkechengEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscussshipinkechengView> selectListView(Wrapper<DiscussshipinkechengEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscussshipinkechengView selectView(Wrapper<DiscussshipinkechengEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
