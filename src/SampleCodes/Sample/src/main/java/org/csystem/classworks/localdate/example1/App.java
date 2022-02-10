package org.csystem.classworks.localdate.example1;

import org.csystem.util.console.*;
import java.time.LocalDate;
import java.time.Month;

public class App {
    public static void main(String[] args) {
        var birthDate = LocalDate.of(1998, Month.MAY,13);

        Console.writeLine("%02d/%02d/%04d",birthDate.getDayOfMonth(),birthDate.getMonthValue(),birthDate.getYear());
        Console.writeLine("%d %s %d %s", birthDate.getDayOfMonth(), birthDate.getMonth(), birthDate.getYear(), birthDate.getDayOfWeek());


        var nowDate = LocalDate.now();

        Console.writeLine("%02d/%02d/%04d",nowDate.getDayOfMonth(),nowDate.getMonthValue(),nowDate.getYear());
        Console.writeLine("%d %s %d %s",nowDate.getDayOfMonth(),nowDate.getMonthValue(),nowDate.getYear());

    }
}
