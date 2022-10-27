package com.cn.sz.warden.response.code;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * 状态码
 *
 * @author weidong.deng
 * @date 2022-10-27
 */
@Data
@AllArgsConstructor
public class StateCode {

    private String code;
    private String msg;

}
