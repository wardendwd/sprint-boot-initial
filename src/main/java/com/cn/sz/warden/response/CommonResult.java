package com.cn.sz.warden.response;

import com.cn.sz.warden.constants.StateCodeConstants.Common;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 公共响应类
 *
 * @author weidong.deng
 * @date 2022-10-27
 */
@Data
@NoArgsConstructor
public class CommonResult<T> {

    private String code;
    private String msg;
    private T data;

    public static CommonResult<Void> fail(String code, String msg) {
        return new CommonResult<>(code, msg);
    }

    public static <T> CommonResult<T> success(T data) {
        CommonResult<T> commonResult = new CommonResult<>(Common.SUCCESS.getCode(), Common.SUCCESS.getMsg());
        commonResult.setData(data);
        return commonResult;
    }

    public static <T> CommonResult<T> success() {
        return new CommonResult<>(Common.SUCCESS.getCode(), Common.SUCCESS.getMsg());
    }

    private CommonResult(String code, String msg) {
        this.code = code;
        this.msg = msg;
    }

}
