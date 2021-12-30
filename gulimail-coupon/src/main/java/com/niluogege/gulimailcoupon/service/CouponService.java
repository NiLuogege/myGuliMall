package com.niluogege.gulimailcoupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.niluogege.common.utils.PageUtils;
import com.niluogege.gulimailcoupon.entity.CouponEntity;

import java.util.Map;

/**
 * 优惠券信息
 *
 * @author niluogege
 * @email niluogege@gmail.com
 * @date 2021-12-30 16:56:28
 */
public interface CouponService extends IService<CouponEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

