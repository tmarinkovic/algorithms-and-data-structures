package sort;

import model.TimeComplexity;
import sort.algorithm.InsertionSort;
import sort.algorithm.MergeSort;

public class Executor {

    public static void main(String[] args) {
        //new TimeComplexity().measure(new InsertionSort());
        new TimeComplexity().measure(new MergeSort(true));
    }
}
