package com.niluogege.gulimailmember.dao;

import com.niluogege.gulimailmember.entity.MemberLoginLogEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员登录记录
 * 
 * @author niluogege
 * @email niluogege@gmail.com
 * @date 2021-12-30 17:12:42
 */
@Mapper
public interface MemberLoginLogDao extends BaseMapper<MemberLoginLogEntity> {
	
}
