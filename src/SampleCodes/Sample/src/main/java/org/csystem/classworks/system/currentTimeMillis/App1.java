package org.csystem.classworks.system.currentTimeMillis;

import org.csystem.util.console.Console;
import org.csystem.util.numeric.NumberUtil;

import java.math.BigInteger;

class App1 {
    public static void main(String[] args) {
        long n = 5697859706174583067L;

        var start = System.currentTimeMillis();
        var result = NumberUtil.isPrime(n);
        var stop = System.currentTimeMillis();
        var elapsed = stop - start;

        Console.writeLine(result ? "Asal" : "Asal değil");
        Console.writeLine("Elapsed (sec):%f", elapsed / 1000.);

        start = System.currentTimeMillis();
        result = NumberUtil.isPrime(BigInteger.valueOf(n));
        stop = System.currentTimeMillis();
        elapsed = stop - start;

        Console.writeLine(result ? "Asal" : "Asal değil");
        Console.writeLine("Elapsed (sec):%f", elapsed / 1000.);
    }
}