package com.dao;

import com.entity.CheweiyuyueEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.CheweiyuyueVO;
import com.entity.view.CheweiyuyueView;


/**
 * 车位预约
 * 
 * @author 
 * @email 
 * @date 2023-02-17 17:06:48
 */
public interface CheweiyuyueDao extends BaseMapper<CheweiyuyueEntity> {
	
	List<CheweiyuyueVO> selectListVO(@Param("ew") Wrapper<CheweiyuyueEntity> wrapper);
	
	CheweiyuyueVO selectVO(@Param("ew") Wrapper<CheweiyuyueEntity> wrapper);
	
	List<CheweiyuyueView> selectListView(@Param("ew") Wrapper<CheweiyuyueEntity> wrapper);

	List<CheweiyuyueView> selectListView(Pagination page,@Param("ew") Wrapper<CheweiyuyueEntity> wrapper);
	
	CheweiyuyueView selectView(@Param("ew") Wrapper<CheweiyuyueEntity> wrapper);
	

    List<Map<String, Object>> selectValue(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<CheweiyuyueEntity> wrapper);

    List<Map<String, Object>> selectTimeStatValue(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<CheweiyuyueEntity> wrapper);

    List<Map<String, Object>> selectGroup(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<CheweiyuyueEntity> wrapper);



}
