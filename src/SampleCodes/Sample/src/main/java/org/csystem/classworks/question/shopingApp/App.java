package org.csystem.classworks.question.shopingApp;

import org.csystem.application.shopping.Product;
import org.csystem.application.shopping.ProductFactory;
import org.csystem.util.console.*;
import java.math.BigDecimal;

public class App {
    public static void main(String[] args) {

    }
}

final class ShopingApp {
    private static BigDecimal getTotal(Product[] products) {
        var total = BigDecimal.ZERO;

        for(var p : products)
            total = total.add(p.getTotal());

        return total;
    }
    private ShopingApp() {

    }

    public static void run() {
        var factory = new ProductFactory();

        Console.writeLine("Total:%s", getTotal(factory.getProducts()));

        factory.incrementProductByRatio(20.3);

        Console.writeLine("Total:%s", getTotal(factory.getProducts()));
        factory.decrementProductByRatio(23.7);

        Console.writeLine("Total:%s", getTotal(factory.getProducts()));
    }
}
