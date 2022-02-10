package org.csystem.classworks.lambda.app;

import org.csystem.util.console.Console;
import org.csystem.util.scheduler.Scheduler;
import org.csystem.util.thread.ThreadUtil;

import java.util.concurrent.TimeUnit;

class App {
    public static void main(String[] args) {
        var scheduler = new Scheduler(1, TimeUnit.SECONDS);

        scheduler.schedule(() -> Console.write("."), () -> Console.writeLine("\nİşlem sonlandı"));

        ThreadUtil.sleep(5000);

        scheduler.cancel();
    }
}
