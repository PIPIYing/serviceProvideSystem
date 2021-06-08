package com.ying.www.service_provide.config;

import com.ying.www.service_provide.constants.ResultConstants;
import com.ying.www.service_provide.result.CommonResult;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import java.nio.file.AccessDeniedException;


/**
 *
 * @author Chavy
 * @date 2020/5/3
 */
@ControllerAdvice
@Component
public class GlobalExceptionHandlerAdvice {


    @ExceptionHandler(IllegalStateException.class)
    @ResponseBody
    public CommonResult<Void> handlerIllegalStateException(IllegalStateException ex) {
        return new CommonResult<Void>().fail(ex.getMessage());
    }

    @ExceptionHandler(AccessDeniedException.class)
    @ResponseBody
    public CommonResult<Void> handlerAuthorizationException(AccessDeniedException ex){
        return new CommonResult<Void>().fail("权限不足！", ResultConstants.FORBIDDEN_CODE);
    }

    @ExceptionHandler(Exception.class)
    @ResponseBody
    public CommonResult<Void> handlerException(Exception e){
        return new CommonResult<Void>().fail(e.getMessage());
    }
}

