package com.niluogege.gulimailproduct.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.niluogege.common.utils.PageUtils;
import com.niluogege.gulimailproduct.entity.SpuImagesEntity;

import java.util.Map;

/**
 * spu图片
 *
 * @author niluogege
 * @email niluogege@gmail.com
 * @date 2021-12-29 19:08:51
 */
public interface SpuImagesService extends IService<SpuImagesEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

