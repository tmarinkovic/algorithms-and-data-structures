package model;

import sort.Data;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class TimeComplexity {

    private int n = 50000;
    private Double complexitySum = 0.0;
    private int complexityIteration = 0;

    public void measure(Algorithm algorithm) {
        HashMap<Integer, Double> result = new HashMap<>();
        while (n <= 800000) {
            algorithm.run(Data.getUnsortedArray(n));
            result.put(n, algorithm.getExecutionTime());
            n *= 2;
        }
        printResults(result);
    }

    private void printResults(HashMap<Integer, Double> result) {
        printHeader();

        List<Integer> keys = new ArrayList<>(result.keySet());
        for (int i = 0; i < result.keySet().size() - 1; i++) {
            System.out.printf("%-15s", keys.get(i));
            System.out.printf("%-15s", result.get(keys.get(i)));
            for (int j = i + 1; j < result.keySet().size(); j++) {
                complexityIteration ++;
                int r1 = keys.get(j) / keys.get(i);
                Double r2 = result.get(keys.get(j)) / result.get(keys.get(i));
                System.out.printf(Data.ANSI_CYAN + "%-15s", "O(n^" + root(r2, r1) + ") " + Data.ANSI_RESET);
            }
            System.out.println();
        }
        Double avgComplexity = complexitySum / complexityIteration;
        printResults(result, keys, avgComplexity);
    }

    private void printResults(HashMap<Integer, Double> result, List<Integer> keys, Double avgComplexity) {
        System.out.printf("%-15s", keys.get(keys.size() - 1));
        System.out.printf("%-15s", result.get(keys.get(keys.size() - 1)));
        System.out.println();
        System.out.print(Data.ANSI_GREEN + "AVERAGE COMPLEXITY: " + Data.ANSI_RESET);
        System.out.println(Data.ANSI_CYAN + "O(n^" + avgComplexity + ")" + Data.ANSI_RESET);
    }

    private void printHeader() {
        System.out.println(Data.ANSI_GREEN + "RESULTS:" + Data.ANSI_RESET);
        System.out.printf("%-15s", "Items");
        System.out.printf("%-15s", "Time(sec)");
        System.out.printf("%-15s", "Complexity");
        System.out.println();
    }

    private String root(Double A, int N) {
        double xPre = Math.random() % 10;
        double eps = 0.001;
        double delX = 2147483647;
        double xK = 0.0;
        while (delX > eps) {
            xK = ((N - 1.0) * xPre + A / Math.pow(xPre, N - 1)) / (double) N;
            delX = Math.abs(xK - xPre);
            xPre = xK;
        }
        complexitySum += xK;
        return String.format("%.2f", xK);
    }

}
