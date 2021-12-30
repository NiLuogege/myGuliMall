package com.niluogege.gulimailware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.niluogege.common.utils.PageUtils;
import com.niluogege.gulimailware.entity.WareSkuEntity;

import java.util.Map;

/**
 * 商品库存
 *
 * @author niluogege
 * @email niluogege@gmail.com
 * @date 2021-12-30 17:44:30
 */
public interface WareSkuService extends IService<WareSkuEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

