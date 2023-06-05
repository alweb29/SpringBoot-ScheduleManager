package com.alweb29.schedulemanager.schedule.service;

import org.springframework.stereotype.Service;

@Service
public interface ScheduleService {

    public void createSchedule();
    public void printSchedule();
    public void getSchedule();
    public void deleteSchedule();

}
