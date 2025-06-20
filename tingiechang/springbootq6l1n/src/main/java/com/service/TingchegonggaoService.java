package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.TingchegonggaoEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.TingchegonggaoVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.TingchegonggaoView;


/**
 * 停车公告
 *
 * @author 
 * @email 
 * @date 2023-02-17 17:06:48
 */
public interface TingchegonggaoService extends IService<TingchegonggaoEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<TingchegonggaoVO> selectListVO(Wrapper<TingchegonggaoEntity> wrapper);
   	
   	TingchegonggaoVO selectVO(@Param("ew") Wrapper<TingchegonggaoEntity> wrapper);
   	
   	List<TingchegonggaoView> selectListView(Wrapper<TingchegonggaoEntity> wrapper);
   	
   	TingchegonggaoView selectView(@Param("ew") Wrapper<TingchegonggaoEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<TingchegonggaoEntity> wrapper);
   	

}

