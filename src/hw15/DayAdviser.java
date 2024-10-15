package hw15;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class DayAdviser implements Adviser{
    @Override
    public void advise(){
        LocalDate localDate = LocalDate.now();
        DayOfWeek dayOfWeek = localDate.getDayOfWeek();
        int value = dayOfWeek.getValue();
        Day currentDay = Day.ofNumber(value);
        switch (currentDay){
            case SUNDAY, SATURDAY -> System.out.println("go to the park");
            case MONDAY, TUESDAY, WEDNESDAY, THURSDAY -> System.out.println("focus on work");
            case FRIDAY -> System.out.println("Happy Friday!");
            default -> System.out.println("there is no such day");
        }
    }
}