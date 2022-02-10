/*----------------------------------------------------------------------------------------------------------------------
    Sınıf Çalışması: Bir sayının 2'nin kuvveti olup olmadığını test eden programı bölme ve mod operatörlerini kullanmadan
    bitsel operatörler ile yazınız
----------------------------------------------------------------------------------------------------------------------*/
package org.csystem.classworks.bit.example;

import org.csystem.util.bitwise.BitwiseUtil;
import org.csystem.util.console.Console;

public class Example {
    public static void main(String[] args) {
        PowerOfTwoApp.run();
    }
}

class PowerOfTwoApp {
    private PowerOfTwoApp() {
    }

    public static void run() {

        for (; ; ) {
            var a = Console.readInt("Bir sayı giriniz:");

            Console.writeLine("------------------------");
            BitwiseUtil.writeBits(a);
            BitwiseUtil.writeBits(a - 1);

            Console.writeLine("%d sayısı 2'nin %s", a, a != 0 && (a & (a - 1)) == 0 ? "kuvvetidir" : "kuvveti değildir");
            Console.writeLine("------------------------");

            if (a == 0)
                break;
        }
    }
}
