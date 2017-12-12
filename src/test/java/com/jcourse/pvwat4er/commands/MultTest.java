package com.jcourse.pvwat4er.commands;

import org.junit.Before;
import org.junit.Test;

import java.util.*;

import static org.junit.Assert.*;

public class MultTest {

    Stack<Double> stack = new Stack<>();
    Map<String, Double> map = new HashMap<>();
    String str[] = new String[0];


    @org.junit.Test
    public void execute() throws Exception {
        Mult mult = new Mult();
        stack.push(2.4);
        stack.push(2.5);
        mult.execute(stack, map, str);

        assertEquals(6., stack.peek(),.0);
    }

}