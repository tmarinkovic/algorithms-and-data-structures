package model;

public interface Algorithm {
    int[] run(Input input);

    void start(int n);

    void done();

    Double getExecutionTime();
}
