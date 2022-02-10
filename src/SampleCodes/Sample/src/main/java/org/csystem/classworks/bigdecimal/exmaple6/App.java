package org.csystem.classworks.bigdecimal.exmaple6;

import org.csystem.util.console.Console;

//   r = x.compareTo(y); çağrısı için
//    1. r == -1 <=> x < y
//    2. r == 0 <=> x == y
//    3. r == 1 <=> x > y
public class App {
    public static void main(String[] args) {
        var a = Console.readBigDecimal("Birinci sayıyı giriniz:");
        var b = Console.readBigDecimal("İkinci sayıyı giriniz:");

        Console.writeLine(a.compareTo(b));
    }
}
