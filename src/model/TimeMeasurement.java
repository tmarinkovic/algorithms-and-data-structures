package model;

import sort.Data;

public class TimeMeasurement {

    private Long startTime;
    private Long endTime;
    private Double executionTime;

    public void start(int n) {
        startTime = System.currentTimeMillis();
        System.out.printf("%-40s", "STARTED(n=" + n + ")...");
    }

    public void done() {
        endTime = System.currentTimeMillis();
        System.out.println(Data.ANSI_GREEN + "DONE!" + Data.ANSI_RESET);
        printReport();
    }

    public Double getExecutionTime() {
        return executionTime;
    }

    private void printReport() {
        executionTime = ((endTime - startTime) / (double) 1000);
        System.out.printf("%-40s", "Execution time:");
        System.out.println(executionTime + " sec");
    }
}
