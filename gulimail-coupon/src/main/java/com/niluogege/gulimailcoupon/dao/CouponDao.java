package com.niluogege.gulimailcoupon.dao;

import com.niluogege.gulimailcoupon.entity.CouponEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券信息
 * 
 * @author niluogege
 * @email niluogege@gmail.com
 * @date 2021-12-30 16:56:28
 */
@Mapper
public interface CouponDao extends BaseMapper<CouponEntity> {
	
}
