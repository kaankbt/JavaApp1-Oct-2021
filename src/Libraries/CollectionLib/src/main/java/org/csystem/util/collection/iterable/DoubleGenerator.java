/*----------------------------------------------------------------------
	FILE        : DoubleGenerator.java
	AUTHOR      : JavaApp1-Oct-2021 group
	LAST UPDATE : 13.02.2022

	Iterable double random number generator class

	Copyleft (c) 1993 by C and System Programmers Association (CSD)
	All Rights Free
-----------------------------------------------------------------------*/
package org.csystem.util.collection.iterable;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Random;
import java.util.function.DoubleSupplier;

public class DoubleGenerator implements Iterable<Double> {
    private final int m_count;
    private final DoubleSupplier m_supplier;

    private DoubleGenerator(int count, DoubleSupplier supplier)
    {
        m_count = count;
        m_supplier = supplier;
    }

    public static DoubleGenerator of(Random random, int count, double min, double bound)
    {
        return of(count, () -> random.nextDouble() * (bound - min) + min);
    }

    public static DoubleGenerator of(int count, DoubleSupplier supplier)
    {
        return new DoubleGenerator(count, supplier);
    }

    //...

    @Override
    public Iterator<Double> iterator()
    {
        return new Iterator<>() {
            int count;
            @Override
            public boolean hasNext()
            {
                return count + 1 <= m_count;
            }

            @Override
            public Double next()
            {
                if (!hasNext())
                    throw new NoSuchElementException("No such value");

                ++count;
                return m_supplier.getAsDouble();
            }
        };
    }
}
