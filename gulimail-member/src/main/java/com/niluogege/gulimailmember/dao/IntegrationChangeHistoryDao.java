package com.niluogege.gulimailmember.dao;

import com.niluogege.gulimailmember.entity.IntegrationChangeHistoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 积分变化历史记录
 * 
 * @author niluogege
 * @email niluogege@gmail.com
 * @date 2021-12-30 17:12:42
 */
@Mapper
public interface IntegrationChangeHistoryDao extends BaseMapper<IntegrationChangeHistoryEntity> {
	
}
