package org.csystem.classworks.system;

import org.csystem.util.console.Console;
import org.csystem.util.numeric.NumberUtil;

import java.math.BigInteger;

class App1 {
    public static void main(String[] args) {
        long n = 5697859706174583067L;

        var start = System.nanoTime();
        var result = NumberUtil.isPrime(n);
        var stop = System.nanoTime();
        var elapsed = stop - start;

        Console.writeLine(result ? "Asal" : "Asal değil");
        Console.writeLine("Elapsed (sec):%f", elapsed / 1_000_000_000.);

        start = System.nanoTime();
        result = NumberUtil.isPrime(BigInteger.valueOf(n));
        stop = System.nanoTime();
        elapsed = stop - start;

        Console.writeLine(result ? "Asal" : "Asal değil");
        Console.writeLine("Elapsed (sec):%f", elapsed / 1_000_000_000.);
    }
}
