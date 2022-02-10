package org.csystem.classworks.arrays.equals;


import org.csystem.util.array.ArrayUtil;
import org.csystem.util.console.Console;

import java.util.Arrays;
import java.util.Random;

class App1 {
    public static void main(String[] args) {
        var seed1 = Console.readLong("Birinci tohum değerini giriniz:");
        var seed2 = Console.readLong("İkinci tohum değerini giriniz:");
        var r1 = new Random(seed1);
        var r2 = new Random(seed2);

        var a = ArrayUtil.getRandomArray(r1, 10, 1, 99);
        var b = ArrayUtil.getRandomArray(r2, 10, 1, 99);

        ArrayUtil.display(2, a);
        ArrayUtil.display(2, b);

        Console.writeLine(Arrays.equals(a, b) ? "Tüm elemanlar eşit" : "En az bir tane farklı eleman var");
    }
}