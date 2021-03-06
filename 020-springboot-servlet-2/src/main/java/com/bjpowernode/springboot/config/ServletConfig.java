package com.bjpowernode.springboot.config;

import com.bjpowernode.springboot.servlet.MyServlet;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration //该注解将此类定义为配置类(相当于一个xml文件)
public class ServletConfig {

    /**
     * @Bean 是一个方法级别上的注解，主要用在配置类里
     * 相当于一个
     * <beans>
     * <bean id="" class="">
     * </beans>
     */
    @Bean
    public ServletRegistrationBean myServletRegistrationBean() {
        ServletRegistrationBean srb = new ServletRegistrationBean(new MyServlet(), "/myservlet");

        return srb;
    }
}
