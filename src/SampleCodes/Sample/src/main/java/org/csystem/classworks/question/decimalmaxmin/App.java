package org.csystem.classworks.question.decimalmaxmin;

import java.math.BigDecimal;

import org.csystem.util.console.*;


public class App {
    public static void main(String[] args) {
FindMaxMinApp.run();
    }
}

final class FindMaxMinApp {
    private FindMaxMinApp() {
    }

    private static void calculate(BigDecimal initial) {
        var min = initial;
        var max = initial;

        for (; ; ) {
            var val = Console.readBigDecimal("Bir sayı giriniz:");
            if (val.equals(BigDecimal.ZERO))
                break;
            if (val.compareTo(min) < 0)
                min = val;

            if (max.compareTo(val) < 0)
                max = val;
        }
        Console.writeLine("En küçük sayı:%s", min);
        Console.writeLine("En büyük sayı:%s", max);
    }

    public static void run() {
        var val = Console.readBigDecimal("Bir sayı giriniz:");

        if (!val.equals(BigDecimal.ZERO))
            calculate(val);
        else
            Console.writeLine("Hiç sayı girilmedi");
    }
}
