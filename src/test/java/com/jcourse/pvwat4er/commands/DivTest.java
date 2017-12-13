package com.jcourse.pvwat4er.commands;

import org.junit.Before;
import org.junit.Test;

import java.util.*;

import static org.junit.Assert.*;

public class DivTest {

    Stack<Double> stack = new Stack<>();
    Map<String, Double> map = new HashMap<>();
    String str[] = new String[0];


    @org.junit.Test
    public void execute() throws Exception {
        Div div = new Div();
        stack.push(2.5);
        stack.push(2.4);
        div.execute(stack, map, str);

        assertEquals(.96, stack.peek(),.0);
    }

}