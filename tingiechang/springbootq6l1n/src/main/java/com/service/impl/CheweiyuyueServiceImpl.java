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


import com.dao.CheweiyuyueDao;
import com.entity.CheweiyuyueEntity;
import com.service.CheweiyuyueService;
import com.entity.vo.CheweiyuyueVO;
import com.entity.view.CheweiyuyueView;

@Service("cheweiyuyueService")
public class CheweiyuyueServiceImpl extends ServiceImpl<CheweiyuyueDao, CheweiyuyueEntity> implements CheweiyuyueService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<CheweiyuyueEntity> page = this.selectPage(
                new Query<CheweiyuyueEntity>(params).getPage(),
                new EntityWrapper<CheweiyuyueEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<CheweiyuyueEntity> wrapper) {
		  Page<CheweiyuyueView> page =new Query<CheweiyuyueView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<CheweiyuyueVO> selectListVO(Wrapper<CheweiyuyueEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public CheweiyuyueVO selectVO(Wrapper<CheweiyuyueEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<CheweiyuyueView> selectListView(Wrapper<CheweiyuyueEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public CheweiyuyueView selectView(Wrapper<CheweiyuyueEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

    @Override
    public List<Map<String, Object>> selectValue(Map<String, Object> params, Wrapper<CheweiyuyueEntity> wrapper) {
        return baseMapper.selectValue(params, wrapper);
    }

    @Override
    public List<Map<String, Object>> selectTimeStatValue(Map<String, Object> params, Wrapper<CheweiyuyueEntity> wrapper) {
        return baseMapper.selectTimeStatValue(params, wrapper);
    }

    @Override
    public List<Map<String, Object>> selectGroup(Map<String, Object> params, Wrapper<CheweiyuyueEntity> wrapper) {
        return baseMapper.selectGroup(params, wrapper);
    }




}
