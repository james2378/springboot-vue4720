package com.dao;

import com.entity.TingchegonggaoEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.TingchegonggaoVO;
import com.entity.view.TingchegonggaoView;


/**
 * 停车公告
 * 
 * @author 
 * @email 
 * @date 2023-02-17 17:06:48
 */
public interface TingchegonggaoDao extends BaseMapper<TingchegonggaoEntity> {
	
	List<TingchegonggaoVO> selectListVO(@Param("ew") Wrapper<TingchegonggaoEntity> wrapper);
	
	TingchegonggaoVO selectVO(@Param("ew") Wrapper<TingchegonggaoEntity> wrapper);
	
	List<TingchegonggaoView> selectListView(@Param("ew") Wrapper<TingchegonggaoEntity> wrapper);

	List<TingchegonggaoView> selectListView(Pagination page,@Param("ew") Wrapper<TingchegonggaoEntity> wrapper);
	
	TingchegonggaoView selectView(@Param("ew") Wrapper<TingchegonggaoEntity> wrapper);
	

}
