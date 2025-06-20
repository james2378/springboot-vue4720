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


import com.dao.TingchegonggaoDao;
import com.entity.TingchegonggaoEntity;
import com.service.TingchegonggaoService;
import com.entity.vo.TingchegonggaoVO;
import com.entity.view.TingchegonggaoView;

@Service("tingchegonggaoService")
public class TingchegonggaoServiceImpl extends ServiceImpl<TingchegonggaoDao, TingchegonggaoEntity> implements TingchegonggaoService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<TingchegonggaoEntity> page = this.selectPage(
                new Query<TingchegonggaoEntity>(params).getPage(),
                new EntityWrapper<TingchegonggaoEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<TingchegonggaoEntity> wrapper) {
		  Page<TingchegonggaoView> page =new Query<TingchegonggaoView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<TingchegonggaoVO> selectListVO(Wrapper<TingchegonggaoEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public TingchegonggaoVO selectVO(Wrapper<TingchegonggaoEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<TingchegonggaoView> selectListView(Wrapper<TingchegonggaoEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public TingchegonggaoView selectView(Wrapper<TingchegonggaoEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
