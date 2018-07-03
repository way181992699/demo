package com.star.demo.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import com.star.demo.controller.interceptor.FirstInterceptor;

/***
 * 在SpringBoot2.0及Spring 5.0 WebMvcConfigurerAdapter已被废弃，目前找到解决方案就有两种:
 * 1 直接实现WebMvcConfigurer接口
 * 2 直接继承WebMvcConfigurationSupport
 * @author Administrator
 *
 */
//@Configuration
public class WebMvcConfigurer2 implements WebMvcConfigurer {

	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		registry.addInterceptor(new FirstInterceptor()).addPathPatterns("/*/**");
		WebMvcConfigurer.super.addInterceptors(registry);
	}



}
