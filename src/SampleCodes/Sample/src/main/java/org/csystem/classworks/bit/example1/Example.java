/*----------------------------------------------------------------------------------------------------------------------
    Sınıf Çalışması: Parametresi ile aldığı int türden bir sayının kaç tane bitinin 1(bir) olduğunu döndüren setBitsCount
    isimli metot ile kaç tane sıfır olduğunu döndüren clearBitsCount metotlarını yazınız
----------------------------------------------------------------------------------------------------------------------*/
package org.csystem.classworks.bit.example1;


import org.csystem.util.console.Console;

import static org.csystem.util.bitwise.BitwiseUtil.*;

class Example {
    public static void main(String[] args) {
        SetClearBitsCountTest.run();
    }
}

class SetClearBitsCountTest {
    private SetClearBitsCountTest() {
    }

    public static void run() {
        for (; ; ) {
            var val = Console.readInt("Bir sayı giriniz:");

            writeBits(val);
            Console.writeLine("Number of set bits:%d", setBitsCount(val));
            Console.writeLine("Number of clear bits:%d", clearBitsCount(val));

            if (val == 0)
                break;
        }
    }
}