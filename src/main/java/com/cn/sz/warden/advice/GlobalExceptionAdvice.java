package com.cn.sz.warden.advice;

import com.cn.sz.warden.constants.StateCodeConstants.Common;
import com.cn.sz.warden.exception.GlobalException;
import com.cn.sz.warden.response.CommonResult;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * 全局异常处理
 *
 * @author weidong.deng
 * @date 2022-10-27
 */
@Slf4j
@RestControllerAdvice
public class GlobalExceptionAdvice {

    @ExceptionHandler(GlobalException.class)
    public CommonResult<?> handleGlobalException(GlobalException globalException) {
        log.warn("global exception thrown: {code:{}, msg:{}}", globalException.getCode(), globalException.getMsg());
        return CommonResult.fail(globalException.getCode(), globalException.getMsg());
    }

    @ExceptionHandler(Exception.class)
    public CommonResult<?> handleException(Exception e) {
        log.error("unhandled exception thrown", e);
        return CommonResult.fail(Common.UNAVAILABLE.getCode(), Common.UNAVAILABLE.getMsg());
    }

}
