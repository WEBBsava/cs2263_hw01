package edu.isu.cs2263.hw01;

import java.util.List;

/**
 * A class that evaluates the given expression/
 * @author Savannah Webb
 */

public class expression_evaluator {
    /**
     * Method to process an expression and return the result
     * @param expr The input string from the user (assumed to be valid input)
     * @return The value of the expression
     */
    static int eval_expression(String expr) {
        int result = 0;
        String[] components = expr.split(" ");
        List<String> operators = List.of("+", "-", "/", "*");
        String operator = "";

        for (String item : components) {
            if (!operators.contains(item)) {
                switch(operator) {
                    case "+" -> {result += Integer.parseInt(item);}
                    case "-" -> {result -= Integer.parseInt(item);}
                    case "/" -> {result /= Integer.parseInt(item);}
                    case "*" -> {result *= Integer.parseInt(item);}
                    default -> {result = Integer.parseInt(item);}
                }
            } else {
                operator = item;
            }
        }
        return result;
    }
}
