package com.tr.mybatis.config;

import com.baomidou.mybatisplus.annotation.DbType;
import com.baomidou.mybatisplus.extension.plugins.MybatisPlusInterceptor;
import com.baomidou.mybatisplus.extension.plugins.inner.PaginationInnerInterceptor;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * MybatisPlus 分页查询需配置此项
 * @Author: TR
 */
@Configuration
@MapperScan({"com.gitee.sunchenbin.mybatis.actable.dao.*", "com.tr.mybatis.mapper"}) // 第一个固定写法，后面自定义
@ComponentScan("com.gitee.sunchenbin.mybatis.actable.manager.*") // 固定写法
public class MybatisPlusConfig {

    @Bean
    public MybatisPlusInterceptor mybatisPlusInterceptor(){
        MybatisPlusInterceptor interceptor = new MybatisPlusInterceptor();
        interceptor.addInnerInterceptor(new PaginationInnerInterceptor(DbType.MYSQL));
        return interceptor;
    }

}
