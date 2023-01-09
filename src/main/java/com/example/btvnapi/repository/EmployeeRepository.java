package com.example.btvnapi.repository;

import com.example.btvnapi.model.Employee;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public interface EmployeeRepository {
    List<Employee> EMPLOYEES = new ArrayList<>() {
        {
            add(new Employee(1, "nam", LocalDate.parse("2001-12-14"), "HD", 1,
                    List.of(LocalDateTime.parse("2022-09-19T07:00:00"), LocalDateTime.parse("2022-09-20T08:15:45"),
                            LocalDateTime.parse("2022-09-21T08:25:45"), LocalDateTime.parse("2022-09-25T08:15:45"),
                            LocalDateTime.parse("2022-09-29T08:52:45"))));
            add(new Employee(2, "hiep", LocalDate.parse("2001-12-14"), "HD", 3,
                    List.of(LocalDateTime.parse("2022-09-09T08:20:20"), LocalDateTime.parse("2022-09-19T08:15:45"))));
            add(new Employee(3, "thang", LocalDate.parse("2001-12-14"), "HD", 4,
                    List.of(LocalDateTime.parse("2022-09-10T08:30:20"), LocalDateTime.parse("2022-09-20T08:15:45"),
                            LocalDateTime.parse("2022-09-29T09:30:45"))));
            add(new Employee(4, "cong", LocalDate.parse("2001-12-14"), "HD", 9,
                    List.of(LocalDateTime.parse("2022-09-15T07:30:20"), LocalDateTime.parse("2022-09-25T08:15:45"))));
            add(new Employee(44, "tien", LocalDate.parse("2001-12-14"), "HD", 1,
                    List.of(LocalDateTime.parse("2022-09-15T07:30:20"), LocalDateTime.parse("2022-09-25T08:15:45"))));
            add(new Employee(6, "quan", LocalDate.parse("2001-12-14"), "HD", 10,
                    List.of(LocalDateTime.parse("2022-09-15T07:30:20"), LocalDateTime.parse("2022-09-25T08:15:45"))));
            add(new Employee(5, "tan", LocalDate.parse("2001-12-14"), "HD", 2,
                    List.of(LocalDateTime.parse("2022-09-15T07:30:20"), LocalDateTime.parse("2022-09-25T08:15:45"))));
            add(new Employee(10, "duc", LocalDate.parse("2001-12-14"), "HD", 7,
                    List.of(LocalDateTime.parse("2022-09-15T07:30:20"), LocalDateTime.parse("2022-09-25T08:15:45"))));
            add(new Employee(7, "nghia", LocalDate.parse("2001-12-14"), "HD", 5,
                    List.of(LocalDateTime.parse("2022-09-15T07:30:20"), LocalDateTime.parse("2022-09-25T08:15:45"))));
            add(new Employee(9, "thinh", LocalDate.parse("2001-12-14"), "HD", 8,
                    List.of(LocalDateTime.parse("2022-09-15T07:30:20"), LocalDateTime.parse("2022-09-25T08:15:45"))));
           add(new Employee(8, "huy", LocalDate.parse("2001-12-14"), "HD", 6,
                    List.of(LocalDateTime.parse("2022-09-29T07:30:20"), LocalDateTime.parse("2022-09-25T08:15:45"))));
        }
    };
}
