package CodeWithSuraj;

import java.time.LocalDate;

public class CWS_68_leap_year_or_not {
    public static void main(String[] args) {
        LocalDate date=LocalDate.now();

        if(date.isLeapYear()){
            System.out.println("Leap Year");
        }else{
            System.out.println("NOt leap year");
        }
    }
}
