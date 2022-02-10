package org.csystem.classworks.timer.example;
/*----------------------------------------------------------------------------------------------------------------------
    java.util.Timer sınıfı periyodik işlemlerin arka planda yapılması için kullanılan temel sınıflardan biridir. Bu
    sınıfın scheduleXXX metotları ile ayrı bir akış (thread) oluşturulur. scheduleXXX metotlarının farkları ileride
    ele alınacaktır. scheduleXXX metotları parametresi ile aldığı TimerTask referansının dinamik türüne ilişkin override
    edilen run metodununun yaratılacak akış tarafından çağrılmasını sağlar. Timer sınıfı, sheduleXXX metotları ile verilen
    periyotta yapılacak işi TimerTask üzerinden programcıdan almaktadır. Bu kavrama genel olarak "callback" denir. Timer
    sınıfına ilişkin diğer detaylar ileride ele
    alınacaktır

    Aşağıdaki örnekte main metodunun bitip arka timer'ın çalışmaya devam ettiğine dikkat ediniz
----------------------------------------------------------------------------------------------------------------------*/

import org.csystem.util.console.Console;

import java.util.Timer;
import java.util.TimerTask;

public class App {
    public static void main(String[] args) {

        var timer = new Timer();

        timer.scheduleAtFixedRate(new TimerTask() {
            public void run() {
                Console.write(".");
            }
        }, 0, 1000);

        Console.writeLine("main ends!...");
    }
}
