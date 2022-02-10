package org.csystem.classworks.localdate.example2;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

import org.csystem.util.console.*;

public class App {
    public static void main(String[] args) {
        var today = LocalDate.now();
        var time = LocalTime.of(19, 45);

        LocalDateTime dateTime = today.atTime(time);
        LocalDateTime dateTime1 = time.atDate(today);

        Console.writeLine(dateTime);
        Console.writeLine(dateTime1);
    }
}
