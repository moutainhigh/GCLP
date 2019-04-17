package com.grape.controller.error;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.grape.controller.bean.StatusCode;
import com.grape.controller.reponse.ErrorEntity;
import com.grape.controller.reponse.Response;
import org.springframework.http.HttpStatus;
import io.swagger.annotations.ApiOperation;

@ControllerAdvice
@ResponseBody
public class RestErrorAdvice  {

	@ApiOperation(hidden=true, value = "验证出错的错误界面")
	@ResponseStatus(HttpStatus.BAD_REQUEST)
	@ExceptionHandler(MethodArgumentNotValidException.class)
    public Response validError(MethodArgumentNotValidException e) {
		BindingResult result = e.getBindingResult();
	    FieldError error = result.getFieldError();
	    String field = error.getField();
	    String code = error.getDefaultMessage();
	    String message = String.format("%s:%s", field, code);
        return new ErrorEntity(StatusCode.VALID_ERROR,message);
    }

}