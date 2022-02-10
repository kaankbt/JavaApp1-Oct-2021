package org.csystem.classworks.timer.digitalclock;

import org.csystem.util.console.Console;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Timer;
import java.util.TimerTask;

// Anonim class digital clock

public class App {
    public static void main(String[] args) {
        new Timer().scheduleAtFixedRate(new TimerTask() {
            public void run() {
                Console.write("%s\r", DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm:ss").format(LocalDateTime.now()));
            }
        }, 0, 1000);
    }
}


