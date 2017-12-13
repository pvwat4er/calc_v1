package com.jcourse.pvwat4er.commands;

import org.junit.Before;
import org.junit.Test;

import java.util.*;

import static org.junit.Assert.*;

public class SqrtTest {

    Stack<Double> stack = new Stack<>();
    Map<String, Double> map = new HashMap<>();
    String str[] = new String[0];


    @org.junit.Test
    public void execute() throws Exception {
        Sqrt sqrt = new Sqrt();
        stack.push(1.69);
        sqrt.execute(stack, map, str);

        assertEquals(1.3, stack.peek(),.0);
    }

}