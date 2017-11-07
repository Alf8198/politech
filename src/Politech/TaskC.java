package Politech;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class TaskC implements Service{


    @Override
    public ArrayList list() {
        return null;
    }

    @Override
    public int num() {
        return 0;
    }

    @Override
    public Date uD() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите дату в форматы гггг/мм/дд");
        String date = sc.nextLine();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd");

        LocalDate userTime = LocalDate.parse(date, formatter);

        LocalDate startUserYear = LocalDate.of(userTime.getYear(), 1, 1);

        long dayOfStartYear = ChronoUnit.DAYS.between(startUserYear, userTime);
        System.out.println(dayOfStartYear);
        return null;
    }


}

