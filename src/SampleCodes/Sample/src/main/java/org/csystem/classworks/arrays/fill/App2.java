package org.csystem.classworks.arrays.fill;

import org.csystem.util.console.Console;

import java.util.Arrays;

public class App2 {
    public static void main(String[] args) {
        var n = Console.readUInt("Bir sayı giriniz:");

        boolean[] doorStatus = new boolean[n];

        Arrays.fill(doorStatus, true);

        for (var st : doorStatus)
            Console.writeLine(st);

        //...
    }
}
