package com.jcourse.pvwat4er.commands;


import com.jcourse.pvwat4er.Command;

import java.util.Map;
import java.util.Stack;

public class Note implements Command {

    private Stack<Double> stack;

    public void execute(Stack<Double> stack, Map<String, Double> define, String[] s) {
        System.out.println("comment");
    }
}