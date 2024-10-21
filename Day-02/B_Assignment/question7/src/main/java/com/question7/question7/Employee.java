package com.question7.question7;

public class Employee extends Person implements Job {
    private String position;
    private double salary;

    public Employee(String name, int age, String position, double salary) {
        super(name, age);
        this.position = position;
        this.salary = salary;
    }
    @Override
    public String getPosition() {
        return position;
    }

    @Override
    public double getSalary() {
        return salary;
    }

    public void displayInfo() {
        System.out.println("Name: " + getName());
        System.out.println("Age: " + getAge());
        System.out.println("Position: " + getPosition());
        System.out.println("Salary: " + getSalary());
    }
}