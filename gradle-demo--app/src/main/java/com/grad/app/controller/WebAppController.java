package com.grad.app.controller;

import com.grad.common.util.DateUtils;
import com.grad.common.util.RandomStringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class WebAppController {
    @GetMapping
    public String whatIsTodayDate(){

        String random = new RandomStringUtils(10).nextString();
        return DateUtils.currentISODateFormat() + "----" + random;
    }
}
