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


import com.dao.ShipinkechengDao;
import com.entity.ShipinkechengEntity;
import com.service.ShipinkechengService;
import com.entity.vo.ShipinkechengVO;
import com.entity.view.ShipinkechengView;

@Service("shipinkechengService")
public class ShipinkechengServiceImpl extends ServiceImpl<ShipinkechengDao, ShipinkechengEntity> implements ShipinkechengService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ShipinkechengEntity> page = this.selectPage(
                new Query<ShipinkechengEntity>(params).getPage(),
                new EntityWrapper<ShipinkechengEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ShipinkechengEntity> wrapper) {
		  Page<ShipinkechengView> page =new Query<ShipinkechengView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ShipinkechengVO> selectListVO(Wrapper<ShipinkechengEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ShipinkechengVO selectVO(Wrapper<ShipinkechengEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ShipinkechengView> selectListView(Wrapper<ShipinkechengEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ShipinkechengView selectView(Wrapper<ShipinkechengEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
