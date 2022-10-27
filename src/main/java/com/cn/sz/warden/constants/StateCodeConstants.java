package com.cn.sz.warden.constants;

import com.cn.sz.warden.response.code.StateCode;

/**
 * 状态码常量
 *
 * @author weidong.deng
 * @date 2022-10-27
 */
public final class StateCodeConstants {

    /**
     * 通用模块的状态码
     */
    public static final class Common {
        public static final StateCode SUCCESS = new StateCode("200", "success");
        public static final StateCode UNAVAILABLE = new StateCode("500", "system unavailable");
    }

    /**
     * 账户相关异常
     */
    public static final class MpfBalance {
        public static final StateCode NOT_EXIST = new StateCode("10000", "账户不存在");
    }

}
