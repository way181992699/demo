package com.star.demo.config;
import org.springframework.context.annotation.Configuration;

import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

import com.star.demo.controller.interceptor.FirstInterceptor;
import com.star.demo.controller.interceptor.SecondInterceptor;
/***
 * 在SpringBoot2.0及Spring 5.0 WebMvcConfigurerAdapter已被废弃，目前找到解决方案就有两种:
 * 1 直接实现WebMvcConfigurer接口
 * 2 直接继承WebMvcConfigurationSupport
 * @author Administrator
 *
 */
@Configuration
public class WebMvcConfigurer extends WebMvcConfigurationSupport {

	
	@Override
	protected void addInterceptors(InterceptorRegistry registry) {
		// 拦截器会按照注册的顺序执行
		registry.addInterceptor(new FirstInterceptor()).addPathPatterns("/user/**");
		registry.addInterceptor(new SecondInterceptor()).addPathPatterns("/MyWife/**");
		super.addInterceptors(registry);
	}
	
	

}
