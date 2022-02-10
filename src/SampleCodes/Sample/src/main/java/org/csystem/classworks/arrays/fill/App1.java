package org.csystem.classworks.arrays.fill;

import org.csystem.util.array.ArrayUtil;
import org.csystem.util.console.Console;

import java.util.Arrays;

public class App1 {
    public static void main(String[] args) {
        var n = Console.readUInt("Bir sayı giriniz");

        int[] a = new int[n];

        Arrays.fill(a, -1);
        ArrayUtil.display(a);

    }
}
