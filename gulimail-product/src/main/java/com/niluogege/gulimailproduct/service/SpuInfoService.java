package com.niluogege.gulimailproduct.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.niluogege.common.utils.PageUtils;
import com.niluogege.gulimailproduct.entity.SpuInfoEntity;

import java.util.Map;

/**
 * spu信息
 *
 * @author niluogege
 * @email niluogege@gmail.com
 * @date 2021-12-29 19:08:51
 */
public interface SpuInfoService extends IService<SpuInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

