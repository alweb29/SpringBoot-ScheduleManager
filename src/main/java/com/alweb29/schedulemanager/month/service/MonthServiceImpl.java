package com.alweb29.schedulemanager.month.service;

import com.alweb29.schedulemanager.day.entity.DayClass;
import com.alweb29.schedulemanager.day.service.DayService;
import com.alweb29.schedulemanager.month.dao.MonthDAO;
import com.alweb29.schedulemanager.month.entity.MonthClass;
import com.alweb29.schedulemanager.month.rest.MonthNotFoundException;
import org.springframework.stereotype.Service;

import java.time.YearMonth;
import java.util.List;

@Service
public class MonthServiceImpl implements MonthService{

    private MonthDAO monthDAO;
    private DayService dayService;

    public MonthServiceImpl(MonthDAO monthDAO, DayService dayService) {
        this.monthDAO = monthDAO;
        this.dayService = dayService;
    }

    @Override
    public List<MonthClass> findAll() {
        return monthDAO.findAll();
    }

    @Override
    public MonthClass findById(int month_id) {
        return monthDAO.findById(month_id);
    }

    @Override
    public MonthClass save(MonthClass month) {
        return monthDAO.save(month);
    }

    @Override
    public void deleteById(int id) {
        monthDAO.deleteById(id);
    }

    @Override
    public void generateDaysForMonth(MonthClass monthClass) {

        String monthName = monthClass.getMonth_name();
        for (int i = 1; i <= getNumberOfDays(monthName); i++) {
            DayClass dayClass = new DayClass();
            dayClass.setMonthClass(monthClass);
            dayClass.setDat_number(i);
            dayService.save(dayClass);
        }
    }

    private int getNumberOfDays(String monthName) {
        // Possible to change on the go in the future
        int year = 2023;
        int month = switch (monthName.toLowerCase()) {
            case "january" -> 1;
            case "february" -> 2;
            case "march" -> 3;
            case "april" -> 4;
            case "may" -> 5;
            case "june" -> 6;
            case "july" -> 7;
            case "august" -> 8;
            case "september" -> 9;
            case "october" -> 10;
            case "november" -> 11;
            case "december" -> 12;
            // make new exception for this case
            default -> throw new MonthNotFoundException("Wrong month name");
        };

        YearMonth yearMonth = YearMonth.of(year, month);
        int daysInMonth = yearMonth.lengthOfMonth();

        return daysInMonth;
    }

    public void deleteDaysByMonthId(int month_id){
        dayService.deleteByMonthId(month_id);
    }

}
