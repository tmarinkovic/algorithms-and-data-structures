package model;

import model.Input.InsertSortInput;
import model.Input.MergeInput;
import model.Input.MergeSortInput;
import sort.Data;
import sort.algorithm.InsertionSort;
import sort.algorithm.Merge;
import sort.algorithm.MergeSort;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

public class TimeComplexity {

    private Double complexitySum = 0.0;
    private int complexityIteration = 0;

    public void measure(Algorithm algorithm) {
        System.out.println("TIME COMPLEXITY ANALYSIS FOR: " + algorithm.getClass().getSimpleName());
        LinkedHashMap<Integer, Double> result = new LinkedHashMap<>();

        if (algorithm instanceof Merge) {
            int n =  200000;
            while (n <= 3200000) {
                int[] left = new InsertionSort(false).run(new InsertSortInput(Data.getUnsortedArray(n / 2)));
                int[] right = new InsertionSort(false).run(new InsertSortInput(Data.getUnsortedArray(n / 2)));
                int[] all = new int[n];
                for (int i = 0; i < n; i++) {
                    if (i < n / 2) {
                        all[i] = left[i];
                    } else {
                        all[i] = right[i - n / 2];
                    }
                }
                algorithm.run(new MergeInput(all, 0, (n / 2) - 1, all.length - 1));
                result.put(n, algorithm.getExecutionTime());
                n *= 2;
            }

        }
        else {
            int n =  50000;
            while (n <= 800000) {
                algorithm.run(new InsertSortInput(Data.getUnsortedArray(n)));
                result.put(n, algorithm.getExecutionTime());
                n *= 2;
            }
        }

        printResults(result);
    }

    private void printResults(LinkedHashMap<Integer, Double> result) {
        printHeader();

        List<Integer> keys = new ArrayList<>(result.keySet());
        for (int i = 0; i < result.keySet().size() - 1; i++) {
            System.out.printf("%-15s", keys.get(i));
            System.out.printf("%-15s", result.get(keys.get(i)));
            for (int j = i + 1; j < result.keySet().size(); j++) {
                complexityIteration++;
                int r1 = keys.get(j) / keys.get(i);
                Double r2 = result.get(keys.get(j)) / result.get(keys.get(i));
                System.out.printf(Data.ANSI_CYAN + "%-15s", "O(n^" + root(r2, r1) + ") " + Data.ANSI_RESET);
            }
            System.out.println();
        }
        Double avgComplexity = complexitySum / complexityIteration;
        printResults(result, keys, avgComplexity);
    }

    private void printResults(LinkedHashMap<Integer, Double> result, List<Integer> keys, Double avgComplexity) {
        System.out.printf("%-15s", keys.get(keys.size() - 1));
        System.out.printf("%-15s", result.get(keys.get(keys.size() - 1)));
        System.out.println();
        System.out.print(Data.ANSI_GREEN + "AVERAGE COMPLEXITY: " + Data.ANSI_RESET);
        System.out.println(Data.ANSI_CYAN + "O(n^" + avgComplexity + ")" + Data.ANSI_RESET);
        System.out.println();
        System.out.println();
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
