package org.csystem.classworks.calendar.expirydate;

import org.csystem.util.console.*;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class ExpiryDateApp {
    public static void main(String[] args) {
        var month = Console.readInt("Son kullanma tarihini giriniz:");
        var year = Console.readInt("Son kullanma tarihi yıl bilgisi giriniz:");
        var expiryDate = new GregorianCalendar(year, month - 1, 1);

        expiryDate.set(Calendar.DAY_OF_MONTH,expiryDate.getActualMaximum(Calendar.DAY_OF_MONTH));

        if(new GregorianCalendar().after(expiryDate))
            Console.writeLine("Kartın son kullanma tarihi geçti");
        else
            Console.writeLine("Kartın son kullanma tarihi henüz geçmemiştir");
    }
}
