package com.cn.sz.warden.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * 账户余额实体类
 *
 * @author weidong.deng
 * @date 2022-10-27
 */
@Data
@TableName("mpf_balance")
public class MpfBalanceDO {

    @TableId
    private Integer id;

    private String schemeNo;

}
