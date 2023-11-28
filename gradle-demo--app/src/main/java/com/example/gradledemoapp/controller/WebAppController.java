package com.example.gradledemoapp.controller;

import com.grad.common.util.DateUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class WebAppController {
    @GetMapping
    public String whatIsTodayDate(){

        return DateUtils.currentISODateFormat();
    }
}
