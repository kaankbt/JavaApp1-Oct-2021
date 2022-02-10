package org.csystem.classworks.lambda;

import org.csystem.util.console.Console;

//Runnable arayüzü eski bir arayüz olmasına karşın yapısı gereği Java 8'den itibaren functional arayüz durumuna gelmiştir

public class Example2 {
    public static void main(String[] args) {
        Runnable r = () -> Console.writeLine("Merhaba");

        r.run();
    }
}
