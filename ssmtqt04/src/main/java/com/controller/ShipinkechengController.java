package com.controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Date;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

import com.utils.ValidatorUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.annotation.IgnoreAuth;

import com.entity.ShipinkechengEntity;
import com.entity.view.ShipinkechengView;

import com.service.ShipinkechengService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.CommonUtil;
import com.service.StoreupService;
import com.entity.StoreupEntity;

/**
 * 视频课程
 * 后端接口
 * @author 
 * @email 
 * @date 2022-02-21 16:34:53
 */
@RestController
@RequestMapping("/shipinkecheng")
public class ShipinkechengController {
    @Autowired
    private ShipinkechengService shipinkechengService;


    @Autowired
    private StoreupService storeupService;

    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,ShipinkechengEntity shipinkecheng, 
		HttpServletRequest request){

		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("jiangshi")) {
			shipinkecheng.setJiangshigonghao((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<ShipinkechengEntity> ew = new EntityWrapper<ShipinkechengEntity>();
		PageUtils page = shipinkechengService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, shipinkecheng), params), params));
        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,ShipinkechengEntity shipinkecheng, 
		HttpServletRequest request){
        EntityWrapper<ShipinkechengEntity> ew = new EntityWrapper<ShipinkechengEntity>();
		PageUtils page = shipinkechengService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, shipinkecheng), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( ShipinkechengEntity shipinkecheng){
       	EntityWrapper<ShipinkechengEntity> ew = new EntityWrapper<ShipinkechengEntity>();
      	ew.allEq(MPUtil.allEQMapPre( shipinkecheng, "shipinkecheng")); 
        return R.ok().put("data", shipinkechengService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(ShipinkechengEntity shipinkecheng){
        EntityWrapper< ShipinkechengEntity> ew = new EntityWrapper< ShipinkechengEntity>();
 		ew.allEq(MPUtil.allEQMapPre( shipinkecheng, "shipinkecheng")); 
		ShipinkechengView shipinkechengView =  shipinkechengService.selectView(ew);
		return R.ok("查询视频课程成功").put("data", shipinkechengView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        ShipinkechengEntity shipinkecheng = shipinkechengService.selectById(id);
        return R.ok().put("data", shipinkecheng);
    }

    /**
     * 前端详情
     */
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        ShipinkechengEntity shipinkecheng = shipinkechengService.selectById(id);
        return R.ok().put("data", shipinkecheng);
    }
    


    /**
     * 赞或踩
     */
    @RequestMapping("/thumbsup/{id}")
    public R thumbsup(@PathVariable("id") String id,String type){
        ShipinkechengEntity shipinkecheng = shipinkechengService.selectById(id);
        if(type.equals("1")) {
        	shipinkecheng.setThumbsupnum(shipinkecheng.getThumbsupnum()+1);
        } else {
        	shipinkecheng.setCrazilynum(shipinkecheng.getCrazilynum()+1);
        }
        shipinkechengService.updateById(shipinkecheng);
        return R.ok();
    }

    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody ShipinkechengEntity shipinkecheng, HttpServletRequest request){
    	shipinkecheng.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(shipinkecheng);

        shipinkechengService.insert(shipinkecheng);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody ShipinkechengEntity shipinkecheng, HttpServletRequest request){
    	shipinkecheng.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(shipinkecheng);

        shipinkechengService.insert(shipinkecheng);
        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody ShipinkechengEntity shipinkecheng, HttpServletRequest request){
        //ValidatorUtils.validateEntity(shipinkecheng);
        shipinkechengService.updateById(shipinkecheng);//全部更新
        return R.ok();
    }
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        shipinkechengService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
    /**
     * 提醒接口
     */
	@RequestMapping("/remind/{columnName}/{type}")
	public R remindCount(@PathVariable("columnName") String columnName, HttpServletRequest request, 
						 @PathVariable("type") String type,@RequestParam Map<String, Object> map) {
		map.put("column", columnName);
		map.put("type", type);
		
		if(type.equals("2")) {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Calendar c = Calendar.getInstance();
			Date remindStartDate = null;
			Date remindEndDate = null;
			if(map.get("remindstart")!=null) {
				Integer remindStart = Integer.parseInt(map.get("remindstart").toString());
				c.setTime(new Date()); 
				c.add(Calendar.DAY_OF_MONTH,remindStart);
				remindStartDate = c.getTime();
				map.put("remindstart", sdf.format(remindStartDate));
			}
			if(map.get("remindend")!=null) {
				Integer remindEnd = Integer.parseInt(map.get("remindend").toString());
				c.setTime(new Date());
				c.add(Calendar.DAY_OF_MONTH,remindEnd);
				remindEndDate = c.getTime();
				map.put("remindend", sdf.format(remindEndDate));
			}
		}
		
		Wrapper<ShipinkechengEntity> wrapper = new EntityWrapper<ShipinkechengEntity>();
		if(map.get("remindstart")!=null) {
			wrapper.ge(columnName, map.get("remindstart"));
		}
		if(map.get("remindend")!=null) {
			wrapper.le(columnName, map.get("remindend"));
		}

		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("jiangshi")) {
			wrapper.eq("jiangshigonghao", (String)request.getSession().getAttribute("username"));
		}

		int count = shipinkechengService.selectCount(wrapper);
		return R.ok().put("count", count);
	}
	







}
