package com.example.btvnapi.controller;

import com.example.btvnapi.model.Employee;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

import static com.example.btvnapi.repository.EmployeeRepository.EMPLOYEES;

@RestController
@RequestMapping("/athena")
@SpringBootApplication(exclude={DataSourceAutoConfiguration.class})
public class EmployeeController {
    @GetMapping("/get/all")
    public ResponseEntity<List<Employee>> get() {
        return ResponseEntity.ok(EMPLOYEES);
    }
    @GetMapping("/get/late")
    public ResponseEntity<List<Employee>> getDiLmMuon() {
        return ResponseEntity.ok(EMPLOYEES.stream()
                .filter(employee -> employee.getChamCong().stream()
                        .filter(localDateTime -> localDateTime.getHour() > 7)
                        .filter(localDateTime -> localDateTime.getMinute() > 30)
                        .filter(localDateTime -> localDateTime.getSecond() > 00)
                        .count() > 3)
                .collect(Collectors.toList()));
    }
    @GetMapping("/get/log")
    public ResponseEntity<List<Employee>> getLog() {

        return ResponseEntity.ok(EMPLOYEES);
    }
    @GetMapping("/get/goDo")
    public ResponseEntity<List<Employee>> getGoDo() {
        LocalDate localDate = LocalDate.parse("2022-09-19");
        return ResponseEntity.ok(EMPLOYEES.stream().filter(employee -> employee.getChamCong().stream()
                .filter(localDateTime -> localDateTime.getYear() == localDate.getYear())
                .filter(localDateTime -> localDateTime.getMonth() == localDate.getMonth())
                .anyMatch(localDateTime -> localDateTime.getDayOfMonth() == localDate.getDayOfMonth()))
                .collect(Collectors.toList()));
    }
}
