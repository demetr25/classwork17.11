package com.company;

import java.time.LocalDateTime;

public class Employee {
    private String name;
    private int age;
    private String work;
    private LocalDateTime startWorkDate;

    public Employee(String name, int age, String work) {
        this.name = name;
        this.age = age;
        this.work = work;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getWork() {
        return work;
    }

    public LocalDateTime getStartWorkDate() {
        return startWorkDate;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setWork(String work) {
        this.work = work;
    }

    public void setStartWorkDate(LocalDateTime startWorkDate) {
        this.startWorkDate = startWorkDate;
    }
}
