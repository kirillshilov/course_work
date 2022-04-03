package ru.skypro;

import java.util.Objects;

public class Employee {
    private String nameOfEmployer;
    private int department;
    private int salary;
    int id;
    static int allCounter = 1;
    public Employee(String nameOfEmployer, int department, int salary) {
        this.nameOfEmployer = nameOfEmployer;
        this.department = department;
        this.salary = salary;
        this.id = allCounter;
        allCounter++;
    }

    public void setCounterOfEmployer(int counterOfEmployer) {
        this.id = counterOfEmployer;
    }

    public void setNameOfEmployer(String nameOfEmployer) {
        this.nameOfEmployer = nameOfEmployer;
    }

    public int getCounterOfEmployer() {
        return id;
    }

    public static int getCounter() {
        return allCounter - 1;
    }

    public  String getNameOfEmployer() {
        return nameOfEmployer;
    }

    public  int getDepartment() {
        return department;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
     String a = " Имя: " + this.nameOfEmployer + " Зарплата: " + this.salary + " Отдел:  " + this.department + " id работника " + this.id ;
        return  a;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return department == employee.department && salary == employee.salary && id == employee.id && Objects.equals(nameOfEmployer, employee.nameOfEmployer);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameOfEmployer, department, salary, id);
    }
}

