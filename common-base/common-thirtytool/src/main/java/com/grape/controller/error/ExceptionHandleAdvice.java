package com.grape.controller.error;

import java.util.List;

import org.springframework.validation.ObjectError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import com.grape.controller.bean.StatusCode;
import com.grape.controller.reponse.ErrorEntity;

@ControllerAdvice
@ResponseBody

public class ExceptionHandleAdvice {
	
	@ExceptionHandler(MethodArgumentNotValidException.class)
	public ErrorEntity handleIllegalParamException(MethodArgumentNotValidException e) { 
		List<ObjectError> errors = e.getBindingResult().getAllErrors();
		String tips = "参数不合法"; 
		if (errors.size() > 0) { 
			tips = errors.get(0).getDefaultMessage(); 
			} 
		ErrorEntity result = new ErrorEntity(StatusCode.VALID_ERROR, tips);
		
		return result; 
		}
	
}
