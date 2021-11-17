package com.company;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main3 {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Ivan a", 12, "h"));
        students.add(new Student("Ivan b", 15, "b"));
        students.add(new Student("Ivan c", 16, "n"));
        students.add(new Student("Ivan d", 18, "m"));
        students.add(new Student("Ivan e", 19, "d"));
        students.add(new Student("Ivan f", 20, "q"));

        students.stream().filter(st -> st.getAge() >=18)
                .map(student -> new Employee(student.getName(), student.getAge(), "McDonalds"))
                .peek(employee -> employee.setStartWorkDate(LocalDateTime.now()))
                .sorted((e1, e2) -> e1.getName().compareTo(e2.getName()))
                .collect(Collectors.toList());
        System.out.println();
    }
}
