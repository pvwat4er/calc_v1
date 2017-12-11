package com.jcourse.pvwat4er.commands;

import com.jcourse.pvwat4er.Command;

import java.util.Stack;
import java.util.Map;

public class Plus implements Command {

    private Stack<Double> stack;

    public void execute(Stack<Double> stack, Map<String, Double> define, String[] s) {

        if (stack.size() < 2) {
            System.out.println("Невозможно выполнить команду! Стек должен содержать более одного элемента!");
        } else {
            stack.push(stack.pop() + stack.pop());
        }
    }
}

