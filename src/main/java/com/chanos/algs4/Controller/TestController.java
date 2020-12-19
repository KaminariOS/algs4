package com.chanos.algs4.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author kaminari
 */
@RestController
public class TestController {
    @GetMapping("/create")
    @ResponseBody
    public CommonResult create() {
        int count = 10;
        if (count > 0) {
            return CommonResult.success(count);
        } else {
            return CommonResult.failed();
        }
    }
}
