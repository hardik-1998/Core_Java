package com.hardik.java8.MethodReference;

import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class MethodRefDemo {
    public static void main(String[] args) {
        EmployeeService service = new EmployeeService();
        //anonymous impl
//        service.loadEmployeesFromDB()
//                .forEach(new Consumer<Employee>() {
//                    @Override
//                    public void accept(Employee employee) {
//                        System.out.println(employee);
//                    }
//                });
//        System.out.println("-------------------------------------------------");
//        //lambda expression
//        service.loadEmployeesFromDB()
//                .forEach(employee -> System.out.println(employee));
//        System.out.println("-------------------------------------------------");
//        //method reference using print method
//        System.out.println("method reference using print method");
//        service.loadEmployeesFromDB()
//                        .forEach(MethodRefDemo::print);
//        System.out.println("-------------------------------------------------");
//        //Method Reference
//        service.loadEmployeesFromDB()
//                .forEach(System.out::println);

        List<Employee> employeeList = service.loadEmployeesFromDB();
        employeeList.forEach(System.out::println);
        System.out.println("------------------------------------------------");
        System.out.println("List of employees who are from IT and salary is greater than 30000 and age is between 20 to 30");
        List<Employee> employeeWithCon = employeeList.stream()
                .filter(e->e.getSalary() > 30000)
                .filter(e->e.getAge() >= 20 && e.getAge() <= 40)
                .collect(Collectors.toList());

        employeeWithCon.forEach(System.out::println);
    }
    public static void print(Employee employee){
        System.out.println(employee);
    }
}
