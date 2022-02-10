package org.csystem.classworks.nested.example1;
/*----------------------------------------------------------------------------------------------------------------------
    Bir sınıf içerisinde başka bir sınıf static olarak bildirilebilir. Bu durumda içteki sınıf dıştaki sınıfın
    bir elemanıdır (member). Dolayısıyla sınıfın bir elemanı static olabileceğinden (ctor hariç) içteki sınıf da static
    olarak bildirilebilir. Sınıfın tüm elemanlarının erişim belirleyicileri olabildiğine göre içteki sınıf da
    bildiriminde erişim belirleyiciler kullanılabilir
----------------------------------------------------------------------------------------------------------------------*/

public class Example {
    public static void main(String[] args) {

    }
}

class A {
    static class B {
        //...
    }

    public static class C {
        //...
    }

    private static class D {
        //...
    }

    protected static class E {
        //...
    }
}
