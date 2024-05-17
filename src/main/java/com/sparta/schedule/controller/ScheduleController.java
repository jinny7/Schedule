package com.sparta.schedule.controller;

import com.sparta.schedule.task.ScheduleService;
import com.sparta.schedule.task.request.search.ScheduleSearchRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Schedule")
public class ScheduleController {

    private final ScheduleService ScheduleService;

    public ScheduleController(ScheduleService ScheduleService) {
        this.ScheduleService = ScheduleService;

    }

    @GetMapping("/test")
    public String test() {
        return "Hello World";
    }

    @GetMapping("/user/print")
    public String printUser(@ModelAttribute ScheduleSearchRequest request) {
        return ScheduleService.printUser(request);
    }

}
