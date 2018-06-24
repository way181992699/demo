package com.star.demo.exception;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.star.demo.pojo.JSONResult;

//@RestControllerAdvice
public class AjaxExceptionHandler {

//	@ExceptionHandler(value = Exception.class)
	public JSONResult defaultErrorHandler(HttpServletRequest req, 
			Exception e) throws Exception {

		e.printStackTrace();
		return JSONResult.errorException(e.getMessage());
	}
}
