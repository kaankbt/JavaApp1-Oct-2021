package org.csystem.classworks.bigdecimal.example7;
import org.csystem.util.console.Console;

import java.math.BigDecimal;

public class App {
    public static void main(String[] args) {
        var start = Console.readBigDecimal("Birinci sayıyı giriniz:");
        var end = Console.readBigDecimal("İkinci sayıyı giriniz:");

        var sum = BigDecimal.ZERO;
        var incValue = BigDecimal.valueOf(0.001);

        for (var value = start; value.compareTo(end) < 0; value = value.add(incValue))
            sum = sum.add(value);

        Console.writeLine("Sum:%s", sum);
    }
}
