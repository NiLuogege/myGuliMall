package com.niluogege.gulimailmember.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@MapperScan("com.niluogege.gulimailmember.dao")
@EnableTransactionManagement//支持事务
public class MyBatisPlusConfig {
}
