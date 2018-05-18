package sort;

import model.TimeComplexity;
import sort.algorithm.InsertionSort;

public class Executor {

    public static void main(String[] args) {
        new TimeComplexity().measure(new InsertionSort());
    }
}
