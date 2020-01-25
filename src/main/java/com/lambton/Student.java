package com.lambton;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

enum Gender {
    MALE,
    FEMALE,
    OTHERS
}

public class Student {
    int studentId;
    String firstName;
    String lastName;
    LocalDate birthDate;
    Gender gender;
    float totalMarks;

    public void setData(int studentId, String firstName, String lastName, LocalDate birthDate,
                        Gender gender,
                        float totalMarks) {
        this.studentId = studentId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
        this.gender = gender;
        this.totalMarks = totalMarks;
    }

    public void printData() {
        System.out.println("Student id          : " + studentId);
        System.out.println("Student FirstName   : " + firstName);
        System.out.println("Student LastName    : " + lastName);
        System.out.println("Student Birth Date  : " + getFormattedBirthDate());
        System.out.println("Student Age (Years) : " + getStudentAge());
        System.out.println("Student Gender      : " + gender);
        System.out.println("Student Total Marks : " + totalMarks);
        getAge();

    }

    private int getStudentAge() {
        int age;

        LocalDate today = LocalDate.now();
        age = today.getYear() - birthDate.getYear();

        return age;
    }

    private String getFormattedBirthDate() {
        DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("E, dd MMM, yyyy");

        String formattedDate = this.birthDate.format(myFormatObj);
        return formattedDate;
    }

    private void getAge() {
        LocalDate now = LocalDate.now();
        Period diff = Period.between(birthDate, now);
        System.out.println(diff.getYears() + " years, " + diff.getMonths() + " months, " + diff.getDays() + " days");
    }

}
