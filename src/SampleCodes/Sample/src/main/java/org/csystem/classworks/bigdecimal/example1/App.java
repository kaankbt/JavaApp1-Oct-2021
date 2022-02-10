package org.csystem.classworks.bigdecimal.example1;

import org.csystem.util.console.Console;

import java.math.BigDecimal;

public class App {
    public static void main(String[] args) {
        var a = BigDecimal.valueOf(0.1);
        var b = BigDecimal.valueOf(0.2);
        var c = a.add(b);

        Console.writeLine("c = %.20f", c.doubleValue());

    }
}
