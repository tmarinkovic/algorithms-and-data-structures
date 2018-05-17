package model;

public class TimeComplexity {

    private Long startTime;
    private Long endTime;

    protected TimeComplexity() {
        startTime = System.currentTimeMillis();
        System.out.print("STARTED...");

    }

    protected void done() {
        endTime = System.currentTimeMillis();
        System.out.println("   DONE!");
        printReport();
    }

    private void printReport() {
        Double executionTime = ((endTime - startTime) / (double)1000);
        System.out.println("Execution time: " + executionTime + " sec");
    }
}
