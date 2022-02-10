package org.csystem.classworks.calendar.example1;

import java.util.Calendar;
import java.util.GregorianCalendar;

import org.csystem.util.console.Console;

//Calendar sınıfının set metodu.
public class Example {
    public static void main(String[] args) {
        var now = new GregorianCalendar();

        Console.writeLine("%02d/%02d/%04d %02d:%02d:%02d.%02d",
                now.get(Calendar.DAY_OF_MONTH),
                now.get(Calendar.MONTH) + 1,
                now.get(Calendar.YEAR),
                now.get(Calendar.HOUR_OF_DAY),
                now.get(Calendar.MINUTE),
                now.get(Calendar.SECOND),
                now.get(Calendar.MILLISECOND));

        now.set(Calendar.DAY_OF_MONTH, 9);

        Console.writeLine("%02d/%02d/%04d %02d:%02d:%02d.%02d",
                now.get(Calendar.DAY_OF_MONTH),
                now.get(Calendar.MONTH) + 1,
                now.get(Calendar.YEAR),
                now.get(Calendar.HOUR_OF_DAY),
                now.get(Calendar.MINUTE),
                now.get(Calendar.SECOND),
                now.get(Calendar.MILLISECOND));
    }
}
