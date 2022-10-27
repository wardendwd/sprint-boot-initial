package com.cn.sz.warden.exception;

import com.cn.sz.warden.response.code.StateCode;
import lombok.Data;

/**
 * 全局异常
 *
 * @author weidong.deng
 * @date 2022-10-27
 */
@Data
public class GlobalException extends RuntimeException {

    private final String code;
    private final String msg;

    public GlobalException(StateCode stateCode) {
        this.code = stateCode.getCode();
        this.msg = stateCode.getMsg();
    }
}
