package com.netcracker.lesson1;


public abstract class Employee extends Person {
    private long salary;

    public Employee() {
    }

    public Employee(String name, long salary) {
        super(name);
        this.salary = salary;
    }

    @Override
    public void speak() {
        super.speak();
        System.out.print("My salary is " + this.salary + "$. ");
    }

    public long getSalary() {
        return salary;
    }

    public void setSalary(long salary) {
        this.salary = salary;
    }
}
