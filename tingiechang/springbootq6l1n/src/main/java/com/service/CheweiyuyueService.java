package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.CheweiyuyueEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.CheweiyuyueVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.CheweiyuyueView;


/**
 * 车位预约
 *
 * @author 
 * @email 
 * @date 2023-02-17 17:06:48
 */
public interface CheweiyuyueService extends IService<CheweiyuyueEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<CheweiyuyueVO> selectListVO(Wrapper<CheweiyuyueEntity> wrapper);
   	
   	CheweiyuyueVO selectVO(@Param("ew") Wrapper<CheweiyuyueEntity> wrapper);
   	
   	List<CheweiyuyueView> selectListView(Wrapper<CheweiyuyueEntity> wrapper);
   	
   	CheweiyuyueView selectView(@Param("ew") Wrapper<CheweiyuyueEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<CheweiyuyueEntity> wrapper);
   	

    List<Map<String, Object>> selectValue(Map<String, Object> params,Wrapper<CheweiyuyueEntity> wrapper);

    List<Map<String, Object>> selectTimeStatValue(Map<String, Object> params,Wrapper<CheweiyuyueEntity> wrapper);

    List<Map<String, Object>> selectGroup(Map<String, Object> params,Wrapper<CheweiyuyueEntity> wrapper);



}

