package com.grad.app.controller;

import com.grad.common.util.DateUtils;
import com.grad.common.util.RandomStringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/date")
public class WebAppController {
    @GetMapping
    public String whatIsTodayDate(){
        String nextString = new RandomStringUtils(11).nextString();
        return "Date >>> " + DateUtils.currentISODateFormat() + " next Str >>> " + nextString ;
    }
}
