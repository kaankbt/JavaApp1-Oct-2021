package org.csystem.classworks.linkedList.example2;

import org.csystem.util.console.Console;

import java.util.LinkedList;

public class Example {
    public static void main(String[] args) {
        var list = new LinkedList<Integer>();

        for (int i = 0; i < 10; ++i)
            list.addFirst(i * 10);

        while (!list.isEmpty())
            Console.write("%d ", list.pop());

        Console.writeLine();
    }
}