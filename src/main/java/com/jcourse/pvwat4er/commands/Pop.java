package com.jcourse.pvwat4er.commands;

import com.jcourse.pvwat4er.Command;

import java.util.Stack;
import java.util.Map;

public class Pop implements Command {

    private Stack<Double> stack;

    public void execute(Stack<Double> stack, Map<String, Double> define, String[] s){
        stack.pop();

    }
}
