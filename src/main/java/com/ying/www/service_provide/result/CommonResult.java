package com.ying.www.service_provide.result;

import com.ying.www.service_provide.constants.ResultConstants;
import lombok.Data;
import lombok.experimental.Accessors;

/**
 *
 * @author Chavy
 * @date 2020/5/3
 * @param <T>
 */
@Data
@Accessors(chain = true)
public class CommonResult<T> {

    private int code;

    private String message;

    private boolean success;

    private T data;

    public CommonResult<T> success(){
        return setSuccess(true).setCode(ResultConstants.SUCCESS_CODE).setMessage(ResultConstants.OPERATE_SUCCESS);
    }

    public CommonResult<T> success(T data){
        return success().setData(data);
    }

    public static CommonResult<Void> of(boolean success){
        if(success){
            return new CommonResult<Void>().success();
        }else{
            return new CommonResult<Void>().fail("SYSTEM_ERROR");
        }
    }

    public CommonResult<T> fail(){
        return setSuccess(false).setCode(ResultConstants.FAIL_CODE).setMessage(ResultConstants.OPERATE_FAIL);
    }

    public CommonResult<T> fail(String message){
        return setSuccess(false).setCode(ResultConstants.FAIL_CODE).setMessage(message);
    }

    public CommonResult<T> fail(String message, int code){
        return setSuccess(false).setCode(code).setMessage(message);
    }
}
