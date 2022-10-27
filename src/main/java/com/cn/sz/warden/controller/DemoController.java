package com.cn.sz.warden.controller;

import com.cn.sz.warden.constants.StateCodeConstants.MpfBalance;
import com.cn.sz.warden.dto.MpfBalanceDetailDTO;
import com.cn.sz.warden.entity.MpfBalanceDO;
import com.cn.sz.warden.exception.GlobalException;
import com.cn.sz.warden.response.CommonResult;
import com.cn.sz.warden.service.MpfBalanceService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import javax.annotation.Resource;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 测试接口
 *
 * @author weidong.deng
 * @date 2022-10-28
 */
@Slf4j
@Api(tags = "测试接口")
@RestController
@RequestMapping("/demo")
public class DemoController {

    @Resource
    private MpfBalanceService mpfBalanceService;

    @GetMapping("/log")
    public CommonResult<?> testLog() {
        log.info("request come");
        return CommonResult.success();
    }

    @ApiOperation("测试未捕获全局异常")
    @GetMapping("/unhandled-exception")
    public CommonResult<?> testUnhandledException() {
        int i = 1 / 0;
        return CommonResult.success();
    }

    @GetMapping("/global-exception")
    public CommonResult<?> testGlobalException() {
        throw new GlobalException(MpfBalance.NOT_EXIST);
    }

    @GetMapping("/mpf-balance")
    public CommonResult<MpfBalanceDetailDTO> testSelectById() {
        MpfBalanceDO byId = mpfBalanceService.getById(1);
        if (byId != null) {
            MpfBalanceDetailDTO mpfBalanceDetailDTO = new MpfBalanceDetailDTO();
            mpfBalanceDetailDTO.setSchemeNo(byId.getSchemeNo());
            return CommonResult.success(mpfBalanceDetailDTO);
        }
        return CommonResult.success();
    }

}
