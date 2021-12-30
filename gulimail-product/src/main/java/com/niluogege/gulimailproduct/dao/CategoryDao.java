package com.niluogege.gulimailproduct.dao;

import com.niluogege.gulimailproduct.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author niluogege
 * @email niluogege@gmail.com
 * @date 2021-12-29 19:08:51
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
