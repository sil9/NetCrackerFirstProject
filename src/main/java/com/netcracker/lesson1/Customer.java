package com.netcracker.lesson1;


public class Customer extends Person {
    private long money;

    public Customer() {
    }

    public Customer(String name, long money) {
        super(name);
        this.money = money;
    }

    @Override
    public void speak() {
        super.speak();
        System.out.println("I have " + this.money + "$. I'm a customer.");
    }

    public long getMoney() {
        return money;
    }

    public void setMoney(long money) {
        this.money = money;
    }
}
