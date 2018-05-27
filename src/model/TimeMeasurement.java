package model;

import data.Data;

public abstract class TimeMeasurement {

    private Long startTime;
    private Long endTime;
    private Double executionTime;
    private boolean showExecutionTime;

    public TimeMeasurement(boolean showExecutionTime) {
        this.showExecutionTime = showExecutionTime;
    }

    public void start(int n) {
        if(showExecutionTime) {
            startTime = System.nanoTime();
            System.out.printf("%-40s", "STARTED(n=" + n + ")...");
        }
    }


    public void done() {
        if(showExecutionTime) {
            endTime = System.nanoTime();
            System.out.println(Data.ANSI_GREEN + "DONE!" + Data.ANSI_RESET);
            printReport();
        }
    }

    public Double getExecutionTime() {
        return executionTime;
    }

    private void printReport() {
        if(showExecutionTime) {
            executionTime = (endTime - startTime)/ 1000000000.0;
            System.out.printf("%-40s", "Execution time:");
            System.out.println(executionTime + " sec");
        }
    }
}
