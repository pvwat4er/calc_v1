package com.jcourse.pvwat4er.commands;

import org.junit.Before;
import org.junit.Test;

import java.util.*;

import static org.junit.Assert.*;

public class PlusTest {

    Stack<Double> stack = new Stack<>();
    Map<String, Double> map = new HashMap<>();
    String str[] = new String[0];


    @org.junit.Test
    public void execute() throws Exception {
        Plus plus = new Plus();
        stack.push(2.);
        stack.push(5.2);
        plus.execute(stack, map, str);

        assertEquals(7.2, stack.peek(),.0);
    }

}