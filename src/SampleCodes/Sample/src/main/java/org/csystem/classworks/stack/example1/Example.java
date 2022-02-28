package org.csystem.classworks.stack.example1;

import org.csystem.util.console.Console;

import java.util.Stack;
// Stack sınıfı (LIFO: Last In First Out)
public class Example {
    public static void main(String[] args)
    {
        var stack = new Stack<Integer>();

        for (int i = 0; i < 10; ++i)
            stack.push(i * 10);

        Console.writeLine("Peek:%d", stack.peek());
        while (!stack.empty())
            Console.write("%d ", stack.pop());

        Console.writeLine();

    }
}
