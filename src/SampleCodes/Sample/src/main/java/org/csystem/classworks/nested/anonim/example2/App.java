package org.csystem.classworks.nested.anonim.example2;
/*----------------------------------------------------------------------------------------------------------------------
    Şüphesiz anonim sınıf bildiriminde kullanılacak sınıfın erişilebilir ctor'ların olması gerekir
----------------------------------------------------------------------------------------------------------------------*/
import org.csystem.util.console.*;

        class App {
            public static void main(String[] args) {

                Sample s1, s2, s3;

                s1 = new Sample() {

                };

                s2 = new Sample() {

                };

                s3 = new Sample() {

                };

                System.out.println(s1.getClass().getName());
                System.out.println(s2.getClass().getName());
                System.out.println(s3.getClass().getName());

                s1.foo();
                s2.foo();
                s3.foo();
            }
        }

        class Sample {
            Sample() {
            }

            public void foo() {
                Console.writeLine("Sample");
            }
        }

