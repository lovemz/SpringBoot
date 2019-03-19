package com.mzyan.springboot;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

/**
 * 搭建基本环境
 * 1、导入数据库文件，创建出department和employee表
 * 2、创建javabean封装数据
 * 3、整合MyBatis操作数据库
 *      1）配置数据源信息
 *      2）使用注解版的MyBatis
 *          1. @MapperScan 指定需要扫描的mapper接口所在的包
 * 快速体验缓存
 * 1、开启基于注解的缓存
 * 2、标注缓存注解
 */
@MapperScan("com.mzyan.springboot.mapper")
@SpringBootApplication
@EnableCaching
public class SpringBoot09CacheApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBoot09CacheApplication.class, args);
    }

}
