package com.niluogege.gulimailorder.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@MapperScan("com.niluogege.gulimailorder.dao")
@EnableTransactionManagement//支持事务
public class MyBatisPlusConfig {
}
