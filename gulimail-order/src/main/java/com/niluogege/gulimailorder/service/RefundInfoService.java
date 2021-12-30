package com.niluogege.gulimailorder.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.niluogege.common.utils.PageUtils;
import com.niluogege.gulimailorder.entity.RefundInfoEntity;

import java.util.Map;

/**
 * 退款信息
 *
 * @author niluogege
 * @email niluogege@gmail.com
 * @date 2021-12-30 17:28:05
 */
public interface RefundInfoService extends IService<RefundInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

