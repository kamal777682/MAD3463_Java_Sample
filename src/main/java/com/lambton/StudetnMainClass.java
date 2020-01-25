package com.lambton;

import java.time.LocalDate;
import java.time.Month;
import java.util.Date;

public class StudetnMainClass
{
    public static void main(String[] args) {

        Student s1 = new Student();
        LocalDate s1BirthDate =  LocalDate.of(1981, Month.FEBRUARY, 20);
        s1.setData(1,"Charmi","Patel", s1BirthDate ,Gender.FEMALE,
                60);

        s1.printData();

    }
}


