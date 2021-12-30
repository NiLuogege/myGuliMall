package com.niluogege.gulimailware.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@MapperScan("com.niluogege.gulimailware.dao")
@EnableTransactionManagement//支持事务
public class MyBatisPlusConfig {
}
