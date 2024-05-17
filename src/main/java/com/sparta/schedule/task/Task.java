package com.sparta.schedule.task;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class Task {

    private static final Logger log = LoggerFactory.getLogger(Task.class);

//    @Scheduled(fixedRate = 1000)
//    public void scheduledExecuteType() {
//        log.info("Task 실행중");
//    }
//
//    @Scheduled(fixedRate = 5000)
//    public void scheduledCurrentTime() {
//        log.info("5초마다 반복");
//    }
}
