package com.niluogege.gulimailcoupon.dao;

import com.niluogege.gulimailcoupon.entity.SeckillSessionEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 秒杀活动场次
 * 
 * @author niluogege
 * @email niluogege@gmail.com
 * @date 2021-12-30 16:56:28
 */
@Mapper
public interface SeckillSessionDao extends BaseMapper<SeckillSessionEntity> {
	
}
