package edu.isu.cs2263.hw01;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class input {
    static void console_input(String expression) {
            int result = expression_evaluator.eval_expression(expression);
            output.out(Integer.toString(result));
    }

    static void batch_input(String fileName) {
        Scanner scanner;
        File name = new File(String.valueOf(fileName));
        try {
            scanner = new Scanner(name);
            while(scanner.hasNextLine()) {
                String expr = scanner.nextLine();
                int result = expression_evaluator.eval_expression(expr);
                String out = expr + " = " + Integer.toString(result) + "\n";
                output.out(out);
            }
        } catch (FileNotFoundException e) {
            System.err.println("File not found. Please enter a valid file name. ");
            e.printStackTrace();
        }
    }
}
