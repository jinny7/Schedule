package com.sparta.schedule.task;

import com.sparta.schedule.task.request.search.ScheduleSearchRequest;
import org.springframework.stereotype.Service;

@Service
public class ScheduleService {
    public String printUser(ScheduleSearchRequest request){
        return "TITLE : " + request.getTitle() + " \n"
                + "CONTENTS : " + request.getContents() + " \n"
                + "ID : " + request.getId() + " \n"
                + "PASSWORD : " + request.getPassword() + " \n"
                + "DATE : " + request.getDate() + " \n";
    }
}
