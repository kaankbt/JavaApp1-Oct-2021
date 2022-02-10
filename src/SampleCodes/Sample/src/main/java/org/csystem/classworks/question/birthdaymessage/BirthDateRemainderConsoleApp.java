package org.csystem.classworks.question.birthdaymessage;

import org.csystem.util.console.Console;


public class BirthDateRemainderConsoleApp {
    private static BirthDateInfo getBirthDateInfo() {
        Console.writeLine("Doğum günü bişgilerini giriniz:");
        var day = Console.readInt("Gün?");

        if (day <= 0)
            return null;

        var month = Console.readInt("Ay?");
        var year = Console.readInt("Yıl?");

        return new BirthDateInfo(day, month, year);
    }

    private BirthDateRemainderConsoleApp() {

    }

    public static void run() {
        String[] message = {"Doğum gününüz kutlu olsun.", "Doğum gününüzü şimdiden kutlarız.", "Geçmiş doğum gününüz kutlu olsun"};

        for (; ; ) {
            var birthDateIInfo = getBirthDateInfo();

            if (birthDateIInfo == null)
                break;

            var birthDateStatus = birthDateIInfo.getBirtDateStatus();

            Console.writeLine(message[birthDateStatus.ordinal()]);
            Console.writeLine("Yaşınız:%f", birthDateIInfo.getAge());
        }
    }
}
