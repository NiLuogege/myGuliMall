package com.niluogege.gulimailmember.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.niluogege.common.utils.PageUtils;
import com.niluogege.gulimailmember.entity.MemberLoginLogEntity;

import java.util.Map;

/**
 * 会员登录记录
 *
 * @author niluogege
 * @email niluogege@gmail.com
 * @date 2021-12-30 17:12:42
 */
public interface MemberLoginLogService extends IService<MemberLoginLogEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

