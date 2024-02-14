package anna_task.day2;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;

public class MyBirthDay {
    public static void main(String[] args) {
        LocalDate myBirthDay = LocalDate.of(1968,3,10);
        int year = myBirthDay.getYear();
        int month = myBirthDay.getMonthValue();
        Month monthOfEnum = myBirthDay.getMonth();
        int dayValue = myBirthDay.getDayOfMonth();
        DayOfWeek day = myBirthDay.getDayOfWeek();
        System.out.println("year = "+year);
        System.out.println("month of enum = "+monthOfEnum);
        System.out.println("day of month = "+dayValue);
        System.out.println("day of week = "+day);
        LocalDate today = LocalDate.now();
        System.out.println("my birth day after today = "+myBirthDay.isAfter(today));
        System.out.println("my birth day before today = "+myBirthDay.isBefore(today));

    }
}
