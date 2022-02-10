package org.csystem.classworks.bigdecimal.example4;

import org.csystem.util.console.Console;

public class App {
    public static void main(String[] args) {
        var a = Console.readBigDecimal("Birinci sayıyı giriniz:");
        var b = Console.readBigDecimal("İkinci sayıyı giriniz:");

        Console.writeLine("%s", a.add(b));
        Console.writeLine("%s", a.subtract(b));
        Console.writeLine("%s", a.multiply(b));
        Console.writeLine("%s", a.pow(10));


    }
}
