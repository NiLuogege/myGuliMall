package com.niluogege.gulimailproduct.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.niluogege.common.utils.PageUtils;
import com.niluogege.gulimailproduct.entity.BrandEntity;

import java.util.Map;

/**
 * 品牌
 *
 * @author 夏沫止水
 * @email HeJieLin@gulimall.com
 * @date 2020-05-22 19:00:18
 */
public interface BrandService extends IService<BrandEntity> {

    PageUtils queryPage(Map<String, Object> params);

    void updateDetail(BrandEntity brand);
}

