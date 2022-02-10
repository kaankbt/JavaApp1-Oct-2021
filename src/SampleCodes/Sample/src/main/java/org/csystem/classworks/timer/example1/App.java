package org.csystem.classworks.timer.example1;

/*----------------------------------------------------------------------------------------------------------------------
    Aşağıdaki örnekte str değişkeni anonim sınıf tarafından yakalanmıştır
----------------------------------------------------------------------------------------------------------------------*/

import org.csystem.util.console.Console;

import java.util.Timer;
import java.util.TimerTask;

class App {
    public static void main(String[] args)
    {
        var timer = new Timer();
        var str = Console.read("Bir yazı giriniz:");

        timer.scheduleAtFixedRate(new TimerTask() {
            public void run()
            {
                Console.write(str);
            }
        }, 0, 1000);

        Console.writeLine("main ends!...");
    }
}