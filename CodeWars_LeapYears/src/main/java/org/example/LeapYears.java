package org.example;
public class LeapYears {
    public static boolean isLeapYear(int year) {

        if (year % 4 == 0) {
            if (year % 100 == 0) {
                return year % 400 == 0;
            }
            return true;
        }
        return false;
    }
}

/*
Better way is use .isLeap() method
___
import static java.time.Year.of;

interface LeapYears {
  static boolean isLeapYear(int year) {
    return of(year).isLeap();
  }
}
 */