package com.bridgelabz.algorithms;

import com.bridgelabz.algorithms.collection.Stack;

public class BalancedParanthesis {
/**
 * used to check balanced equation
 * */
    public static void checkBalanced() {
        Stack<Character> stack = new Stack<Character>();
         String expression = "(5+6)∗(7+8)/(4+3)(5+6)∗(7+8)/(4+3)";
        char[] charExpression = expression.toCharArray();
        for (int i = 0; i < charExpression.length; i++) {
            if (charExpression[i] == '(') {
                stack.push(charExpression[i]);

            } else if (charExpression[i] == ')') {

                if (stack.isEmpty()==false) {
                    char c = stack.pop();
                }
            }
        }
        if(stack.isEmpty()== true) {
            System.out.println("Balanced Expression");
        }
    }

    public static void main(String[] args) {
        checkBalanced();
    }
}
