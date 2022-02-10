package org.csystem.classworks.bigdecimal.example5;

import org.csystem.util.console.Console;

public class App {
    public static void main(String[] args) {
        var a = Console.readBigDecimal("Birinci sayıyı giriniz:");
        var b = Console.readBigDecimal("İkinci sayıyı giriniz:");

        Console.writeLine(a.equals(b) ? "Eşit" : "Eşit değil");

    }
}
