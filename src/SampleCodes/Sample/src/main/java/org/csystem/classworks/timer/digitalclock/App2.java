package org.csystem.classworks.timer.digitalclock;

import org.csystem.util.console.*;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Timer;
import java.util.TimerTask;

public class App2 {
    public static void main(String[] args) {
        var prompt = Console.read("Masajı girin:");

        new Timer().scheduleAtFixedRate(new TimerTask() {
            public void run() {
                Console.write("%s/:%s\r", prompt, DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm:ss").format(LocalDateTime.now()));
            }
        }, 0, 1000);
    }
}
