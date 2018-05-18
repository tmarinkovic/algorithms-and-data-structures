package model;

public interface Algorithm {
    int[] run(int[] data);

    void start(int n);

    void done();

    Double getExecutionTime();
}
