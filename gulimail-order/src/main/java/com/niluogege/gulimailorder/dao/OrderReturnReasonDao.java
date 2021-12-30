package com.niluogege.gulimailorder.dao;

import com.niluogege.gulimailorder.entity.OrderReturnReasonEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 退货原因
 * 
 * @author niluogege
 * @email niluogege@gmail.com
 * @date 2021-12-30 17:28:05
 */
@Mapper
public interface OrderReturnReasonDao extends BaseMapper<OrderReturnReasonEntity> {
	
}
