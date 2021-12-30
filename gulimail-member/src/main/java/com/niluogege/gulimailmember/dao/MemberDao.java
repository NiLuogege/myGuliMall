package com.niluogege.gulimailmember.dao;

import com.niluogege.gulimailmember.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author niluogege
 * @email niluogege@gmail.com
 * @date 2021-12-30 17:12:42
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
