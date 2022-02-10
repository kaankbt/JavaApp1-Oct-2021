package org.csystem.classworks.calendar.example4;

//Calendar sınıfının before ve after metotları

import java.util.Calendar;
import java.util.GregorianCalendar;
import org.csystem.util.console.Console;

public class Example {
    public static void main(String[] args) {
        var birthDate = new GregorianCalendar(1976, Calendar.SEPTEMBER,10);
        var today = new GregorianCalendar();
        var birthDay = new GregorianCalendar(today.get(Calendar.YEAR),birthDate.get(Calendar.MONTH),birthDate.get(Calendar.DAY_OF_MONTH));

        Console.writeLine(today.before(birthDay));
        Console.writeLine(today.after(birthDay));
    }
}
