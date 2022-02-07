package edu.isu.cs2263.hw01;

/**
 * A simple interface that formats the output.
 * @author Savannah Webb
 */

public interface output {
    /**
     *
     * @param result
     */
    static void out(String result) {
        System.out.printf("  -> %s\n", result);
    }
}
