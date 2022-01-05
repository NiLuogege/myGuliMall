package com.niluogege.gulimailproduct.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.niluogege.common.utils.PageUtils;
import com.niluogege.gulimailproduct.entity.SpuCommentEntity;

import java.util.Map;

/**
 * 商品评价
 *
 * @author 夏沫止水
 * @email HeJieLin@gulimall.com
 * @date 2020-05-22 19:00:18
 */
public interface SpuCommentService extends IService<SpuCommentEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

