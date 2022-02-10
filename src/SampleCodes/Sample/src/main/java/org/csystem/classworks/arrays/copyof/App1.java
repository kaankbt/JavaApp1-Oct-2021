package org.csystem.classworks.arrays.copyof;

import org.csystem.util.array.ArrayUtil;
import org.csystem.util.console.Console;

import java.util.Arrays;
import java.util.Random;

class App1 {
    public static void main(String[] args) {
        var r = new Random();
        var n = Console.readInt("Bir sayı giriniz:");
        var a = ArrayUtil.getRandomArray(r, n, 1, 100);
        var b = Arrays.copyOf(a, a.length / 2);

        ArrayUtil.display(2, a);
        ArrayUtil.display(2, b);
    }
}
