package org.example.loops;

public class MultiplicationTable {
    public String generateTable (int input) {
        StringBuilder s = new StringBuilder();

        for (int i = 1; i <= input; i++) {
            for (int j = 1; j <= 10; j++) {
                s.append(String.format("%d * %d = %d", i, j, i * j));
                s.append("\n");
            }
            s.append("\n");
        }

        return s.toString();
    }
}
