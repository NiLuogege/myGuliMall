package com.niluogege.gulimailmember.feign;

import com.niluogege.common.utils.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

//告诉spring cloud这个接口是一个远程客户端，要调用coupon服务，
// 再去调用coupon服务/coupon/coupon/member/list对应的方法
@FeignClient("gulimail-coupon")
public interface CouponFeignService {

    @GetMapping("/gulimailcoupon/coupon/member/list")
    public R membercoupons();
}
