package com.dao;

import com.entity.TingchechangEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.TingchechangVO;
import com.entity.view.TingchechangView;


/**
 * 停车场
 * 
 * @author 
 * @email 
 * @date 2023-02-17 17:06:48
 */
public interface TingchechangDao extends BaseMapper<TingchechangEntity> {
	
	List<TingchechangVO> selectListVO(@Param("ew") Wrapper<TingchechangEntity> wrapper);
	
	TingchechangVO selectVO(@Param("ew") Wrapper<TingchechangEntity> wrapper);
	
	List<TingchechangView> selectListView(@Param("ew") Wrapper<TingchechangEntity> wrapper);

	List<TingchechangView> selectListView(Pagination page,@Param("ew") Wrapper<TingchechangEntity> wrapper);
	
	TingchechangView selectView(@Param("ew") Wrapper<TingchechangEntity> wrapper);
	

}
