package com.hardik.java8.MethodReference;

import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class EmployeeService {
    public List<Employee> loadEmployeesFromDB(){
        return IntStream.range(1, 10)
                .mapToObj(i->new Employee(i, "employee" + i, new Random().nextInt(50000), new Random().nextInt(18,50)))
                .collect(Collectors.toList());
    }
}
