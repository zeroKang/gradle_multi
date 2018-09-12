package org.zerock.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.zerock.core.mapper.TimeMapper;

@RestController
public class TimeController {

    @Autowired
    TimeMapper timeMapper;

    @GetMapping("/now")
    public String getNow() {
        return timeMapper.getTime();
//        return "hello";
    }
}
