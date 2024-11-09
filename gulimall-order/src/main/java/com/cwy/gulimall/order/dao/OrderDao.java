package com.cwy.gulimall.order.dao;

import com.cwy.gulimall.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author yujin
 * @email sunlightcs@gmail.com
 * @date 2024-11-06 16:22:04
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
