package com.niluogege.gulimailorder.dao;

import com.niluogege.gulimailorder.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author niluogege
 * @email niluogege@gmail.com
 * @date 2021-12-30 17:28:05
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
