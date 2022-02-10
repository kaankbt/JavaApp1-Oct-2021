package org.csystem.classworks.bigdecimal.example3;

import java.math.BigDecimal;

import org.csystem.util.console.Console;

public class App {
    public static void main(String[] args) {
        var a = new BigDecimal("0.1");
        var b = new BigDecimal("0.2");
        var c = a.add(b);

        Console.writeLine("%.20f",c.doubleValue());
    }
}
