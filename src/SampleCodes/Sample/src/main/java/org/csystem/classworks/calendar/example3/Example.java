package org.csystem.classworks.calendar.example3;
// Calendar sınıfı (GregorianCalendar)tarih-zaman değerleri için geçerlilik kontrolü yupmaz. Geçerli olmayan değerleri
//hesaplayarak (ekleyerek veya çıkartarak) uygun tarih-zamana dönüştürür

import java.util.Calendar;
import java.util.GregorianCalendar;

import org.csystem.util.console.Console;

public class Example {
    public static void main(String[] args) {
        var now = new GregorianCalendar(2021, Calendar.FEBRUARY, 1234, -123, 1);

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
