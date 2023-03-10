package org.example.fromthecource;

import java.time.LocalDate;
import java.time.Period;
import java.time.chrono.IsoChronology;
import java.time.temporal.ChronoUnit;

import static java.time.temporal.ChronoUnit.DAYS;

public class Birthday {


    public static int getAge(int year, int month, int date) {
        LocalDate birthDay = LocalDate.of(year, month, date);
        LocalDate nowData = LocalDate.now();
        int inDays = (int) DAYS.between(birthDay, nowData);
        System.out.println("Возвраст в днях " + inDays);

        return inDays;
    }

    public static LocalDate nextBirthday(int year, int month, int date) {

        LocalDate myBirthday = LocalDate.of(year, month, date);
        LocalDate nextBirthday = LocalDate.of(year, month, date);
        LocalDate dat = LocalDate.now();


        while (nextBirthday.isBefore(dat)) {
            nextBirthday = nextBirthday.plusDays(1000);
        }

        System.out.println("Следующий день рождения в 1000 дней " + nextBirthday);

        return nextBirthday;
    }

}
