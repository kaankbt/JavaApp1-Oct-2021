package org.csystem.classworks.chronounit.example1;

import org.csystem.util.console.Console;

import java.time.LocalDateTime;
import java.time.Month;
import java.time.temporal.ChronoUnit;

public class App {
    public static void main(String[] args) {
        var now = LocalDateTime.now();
        var bigEarthquake = LocalDateTime.of(1999, Month.AUGUST, 17, 3, 2);

        Console.writeLine(ChronoUnit.DAYS.between(bigEarthquake, now));
        Console.writeLine(ChronoUnit.DAYS.between(bigEarthquake, now) / 365.);
        Console.writeLine(ChronoUnit.YEARS.between(bigEarthquake, now));
        Console.writeLine(ChronoUnit.MONTHS.between(bigEarthquake, now));
        Console.writeLine(ChronoUnit.DECADES.between(bigEarthquake, now));
        Console.writeLine(ChronoUnit.CENTURIES.between(bigEarthquake, now));
        Console.writeLine(ChronoUnit.WEEKS.between(bigEarthquake, now));
    }
}
