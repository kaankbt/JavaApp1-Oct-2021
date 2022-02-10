package org.csystem.classworks.calendar.example;

import org.csystem.util.console.Console;
import java.util.Calendar;
import java.util.GregorianCalendar;

//GregorianCalendar sınıfının default ctor'u ile sistemin tarih-zaman bilgisi elde edilebilir.
public class Example {
    public static void main(String[] args) {
        var now = Calendar.getInstance();
        var now1 = new GregorianCalendar();

        Console.writeLine("%02d/%02d/%04d %02d:%02d:%02d.%02d",
                now.get(Calendar.DAY_OF_MONTH),
                now.get(Calendar.MONTH) + 1,
                now.get(Calendar.YEAR),
                now.get(Calendar.HOUR_OF_DAY),
                now.get(Calendar.MINUTE),
                now.get(Calendar.SECOND),
                now.get(Calendar.MILLISECOND));
        System.out.println("_______________________________________");
        Console.writeLine("%02d/%02d/%04d %02d:%02d:%02d.%02d",
                now.get(Calendar.DAY_OF_MONTH),
                now1.get(Calendar.MONTH) + 1,
                now1.get(Calendar.YEAR),
                now1.get(Calendar.HOUR_OF_DAY),
                now1.get(Calendar.MINUTE),
                now1.get(Calendar.SECOND),
                now1.get(Calendar.MILLISECOND));
    }
}
