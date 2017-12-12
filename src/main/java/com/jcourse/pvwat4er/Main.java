package com.jcourse.pvwat4er;

import com.jcourse.pvwat4er.commands.*;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Stack<Double> stack = new Stack<Double>();
        Map<String, Double> definitions = new HashMap<String, Double>();
        Map<String, Command> mapCmd = new HashMap<String, Command>();
        mapCmd.put("DEFINE", new Define());
        mapCmd.put("POP", new Pop());
        mapCmd.put("PUSH", new Push());
        mapCmd.put("+", new Plus());
        mapCmd.put("-", new Minus());
        mapCmd.put("*", (Command) new Mult());
        mapCmd.put("/", new Div());
        mapCmd.put("SQRT", new Sqrt());
        mapCmd.put("PRINT", new Print());

        while (true) {

            try {
                Scanner scanner = new Scanner(System.in);
                String string = scanner.nextLine();
                String[] s = string.split(" ");
                try {
                    mapCmd.get(s[0]).execute(stack, definitions, s);
                } catch (Exception e) {
                    e.printStackTrace();
                }

            } catch (NullPointerException e) {
                System.out.println("try better!");
            }
        }
    }
}
