package com.alweb29.schedulemanager.month.rest;

import com.alweb29.schedulemanager.day.entity.DayClass;
import com.alweb29.schedulemanager.day.service.DayService;
import com.alweb29.schedulemanager.month.entity.MonthClass;
import com.alweb29.schedulemanager.month.service.MonthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/month")
public class MonthRestController {

    private MonthService monthService;

    private DayService dayService;

    @Autowired
    public MonthRestController(MonthService monthService, DayService dayService) {
        this.monthService = monthService;
        this.dayService = dayService;
    }

    @GetMapping("/months")
    public List<MonthClass> findAll(){
        return monthService.findAll();
    }

    @GetMapping("/months/{month_id}")
    public MonthClass getMonth(@PathVariable int month_id){

        MonthClass monthClass = monthService.findById(month_id);

        return monthClass;
    }

    @PostMapping("/months")
    public MonthClass addMonth(@RequestBody MonthClass monthClass){
        monthClass.setMonth_id(0);
        MonthClass dbMonthClass = monthService.save(monthClass);

        monthService.generateDaysForMonth(dbMonthClass);

        return dbMonthClass;
    }

    @PutMapping("/months")
    public MonthClass updateMonth(@RequestBody MonthClass monthClass){
        MonthClass dBMonthClass = monthService.save(monthClass);

        monthService.deleteDaysByMonthId(monthClass.getMonth_id());
        monthService.generateDaysForMonth(dBMonthClass);
        return dBMonthClass;
    }

    @DeleteMapping("/months/{month_id}")
    public String deleteMonth(@PathVariable int month_id){
        MonthClass monthClass = monthService.findById(month_id);

        if (monthClass == null) {
            throw new MonthNotFoundException("This month doesn't exist");
        }

        monthService.deleteById(month_id);

        monthService.deleteDaysByMonthId(month_id);
        return "Month with id " + month_id + " deleted";
    }

    //helper function for testing
    @DeleteMapping("/months/cleardays")
    public String deleteDays(){
        List<DayClass> days =  dayService.findAll();

        for (DayClass day : days){
            int id = day.getDay_id();
            dayService.deleteById(id);
        }
        return "All Days deleted";
    }
}
