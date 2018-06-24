package com.star.demo.exception;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

import com.star.demo.pojo.JSONResult;

@ControllerAdvice
public class StarExceptionHandler {
	public static final String IMOOC_ERROR_VIEW = "error";

//	@ExceptionHandler(value = Exception.class)
//    public Object errorHandler(HttpServletRequest reqest, 
//    		HttpServletResponse response, Exception e) throws Exception {
//    	
//    	e.printStackTrace();
//    	
//		ModelAndView mav = new ModelAndView();
//        mav.addObject("exception", e);
//        mav.addObject("url", reqest.getRequestURL());
//        mav.setViewName(IMOOC_ERROR_VIEW);
//        return mav;
//    }
	
	@ExceptionHandler(value = Exception.class)
    public Object errorHandler(HttpServletRequest reqest, 
    		HttpServletResponse response, Exception e) throws Exception {
    	
    	e.printStackTrace();
    	System.out.println("a");
    	if (isAjax(reqest)) {
    		System.out.println("b");
    		return JSONResult.errorException(e.getMessage());
    	} else {
    		System.out.println("c");
    		ModelAndView mav = new ModelAndView();
            mav.addObject("exception", e);
            mav.addObject("url", reqest.getRequestURL());
            mav.setViewName(IMOOC_ERROR_VIEW);
            return mav;
    	}
    }
	
	//@Description: 判断是否是ajax请求
	 
	public static boolean isAjax(HttpServletRequest httpRequest){
		return  (httpRequest.getHeader("X-Requested-With") != null  
					&& "XMLHttpRequest"
						.equals( httpRequest.getHeader("X-Requested-With").toString()) );
	}
}
