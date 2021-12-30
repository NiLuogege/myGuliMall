package com.niluogege.gulimailware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.niluogege.common.utils.PageUtils;
import com.niluogege.gulimailware.entity.PurchaseDetailEntity;

import java.util.Map;

/**
 * 
 *
 * @author niluogege
 * @email niluogege@gmail.com
 * @date 2021-12-30 17:44:30
 */
public interface PurchaseDetailService extends IService<PurchaseDetailEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

