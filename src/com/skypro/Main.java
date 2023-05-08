package com.skypro;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Employee [] employees = new Employee[4];
        Employee employee1 = new Employee("Ivanov Ivan", 1, 45087);
        Employee employee2 = new Employee("Kyznetsova Anna", 2, 55005);
        Employee employee3 = new Employee("Fernandes Dariya", 3, 80675);
        Employee employee4 = new Employee("Kotova Anastasia", 4, 65667);

        employees[0] = employee1;
        employees[1] = employee2;
        employees[2] = employee3;
        employees[3] = employee4;

        System.out.println( "Получить список всех сотрудников со всеми имеющимися данными ");
        printAllEmployees(employees);

        System.out.println("Сумма затрат на зарплаты в месяц");
        printSum(employees);

        System.out.println("Найти сотрудника с минимальной зарплатой ");
        printEmployeeMinSalary(employees);

        System.out.println("Найти сотрудника с максимальной зарплатой ");
        printEmployeeMaxSalary(employees);

        System.out.println("Посчитать среднее значение зарплат");
        printAverageSalary(employees);

        System.out.println("Получить Ф.И.О всех сотрудников");
        printFullName(employees);

    }
    private static void printAllEmployees(Employee[] employees) {
        for (Employee e: employees) {
            System.out.println(e);
        }
    }
    private static void printSum (Employee[] employees) {
        long sum = 0;
        for (Employee e: employees) {
            sum += e.getSalary();
        }
        System.out.println("Суммарная зарплата: " + sum);

    }
    private static void printEmployeeMinSalary(Employee[] employees) {
        Employee employeeMinSalary = employees[0];
        for (Employee e: employees) {
            if (e.getSalary() < employeeMinSalary.getSalary()) {
                employeeMinSalary = e;
            }
        }
        System.out.println("Сотрудник с минимальной зарплатой " + employeeMinSalary);
    }
    private static void printEmployeeMaxSalary(Employee[] employees) {
        Employee employeeMaxSalary = employees[0];
        for (Employee e: employees) {
            if (e.getSalary() > employeeMaxSalary.getSalary()) {
                employeeMaxSalary = e;
            }
        }
        System.out.println("Сотрудник с максимальной зарплатой " + employeeMaxSalary);
    }
    private static void printAverageSalary(Employee[] employees) {
        long sum = 0;
        for (Employee e: employees) {
            sum += e.getSalary();
        }
        double averageSum = (double) sum / employees.length;
        System.out.println("Средняя зарплата " + averageSum);
    }
    private static void printFullName (Employee[] employees){
        for (Employee e: employees) {
            System.out.println(e.getFullName());
        }

    }



}