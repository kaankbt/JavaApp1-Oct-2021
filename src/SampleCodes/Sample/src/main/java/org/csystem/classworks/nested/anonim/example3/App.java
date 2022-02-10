package org.csystem.classworks.nested.anonim.example3;
/*----------------------------------------------------------------------------------------------------------------------
    abstract sınıf kullanılarak anonim sınıf nesneleri yaratılabilir. Bu durumda anonim sınıf bildirimi içerisinde
    tüm abstract metotların override edilmesi gerekir
----------------------------------------------------------------------------------------------------------------------*/

import org.csystem.util.console.*;

public class App {
    public static void main(String[] args) {
        Sample s1 = new Sample() {
            public void foo() {
                Console.writeLine("App$1.foo");
            }
        };

        Sample s2 = new Sample() {
            public void foo() {
                Console.writeLine("App1$2.foo");
            }
        };

        for (int i = 0; i < 10; ++i) {
            System.out.println("-------------------------------------------");
            Sample s = (int) (Math.random() * 2) == 1 ? s1 : s2;
            System.out.println(s.getClass().getName());
            s.foo();
            System.out.println("-------------------------------------------");
        }


    }
}

abstract class Sample {
    public abstract void foo();
}