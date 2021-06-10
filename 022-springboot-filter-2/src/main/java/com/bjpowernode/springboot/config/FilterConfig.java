package com.bjpowernode.springboot.config;

import com.bjpowernode.springboot.filter.MyFilter;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration //定义此类为配置类
public class FilterConfig {

    @Bean
    public FilterRegistrationBean myFilterRegistrationBean(){
        //注册过滤器
        FilterRegistrationBean frb = new FilterRegistrationBean(new MyFilter());

        //添加过滤路径
        frb.addUrlPatterns("/user/*");

        return frb;
    }

}
