package org.csystem.classworks.timer.digitalclock;

import org.csystem.util.console.Console;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Timer;
import java.util.TimerTask;

// Anonim class kullanılmamış hali.

public class App1 {
    public static void main(String[] args) {
        var prompt = Console.read("Masajı girin:");

        new Timer().scheduleAtFixedRate(new DigitalClockTask(prompt), 0, 1000);
    }
}

class DigitalClockTask extends TimerTask {
    private final String m_prompt;

    public DigitalClockTask(String prompt) {
        m_prompt = prompt;
    }

    public void run() {
        Console.write("%s:%s\r", m_prompt, DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm:ss").format(LocalDateTime.now()));
    }
}
