package com.skypro;

public class Employee {
    private int id;
    private String fullName;
    private int department;
    private long salary;
    private static int counterId = 0;

    public Employee(String fullName, int department, long salary) {
        this.id = counterId;
        counterId++;
        this.fullName = fullName;
        this.department = department;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public String getFullName() {
        return fullName;
    }

    public int getDepartment() {
        return department;
    }

    public long getSalary() {
        return salary;
    }

    public static int getCounterId() {
        return counterId;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    public void setSalary(long salary) {
        this.salary = salary;
    }

    public static void setCounterId(int counterId) {
        Employee.counterId = counterId;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", fullName='" + fullName + '\'' +
                ", department=" + department +
                ", salary=" + salary +
                '}';
    }
}
