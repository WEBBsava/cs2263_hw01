package edu.isu.cs2263.hw01;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Path;
import java.util.Scanner;

/**
 *
 * @author Savannah Webb
 */

public interface input {
    static void output(String result) {
        System.out.printf("  -> %s\n", result);
    }

    /**
     * Simple method that handles reading a given batch file and returning the answers.
     * @param batchFile
     */

    /**
     * Scanner scanner;
     * scanner = new Scanner(new File("path"));
     *
     * while(scanner.hasNext()) {
     *   String str = scanner.nextLine();
     *   // Do something with line
     * }
     *
     * String filename = "./thisfile.txt";
     * Scanner scan = new Scanner(filename);
     * System.out.printLn(scan.nextLine());
     */
    static void batch_input(Path batchFile) {
        Scanner scanner;
        String file = "/" + String.valueOf(batchFile);
        try {
            scanner = new Scanner(new File(file));
            while(scanner.hasNext()) {
                String expr = scanner.nextLine();
                int result = expression_evaluator.eval_expression(expr);
                String out = expr + Integer.toString(result);
                output(out);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }



    }

}
