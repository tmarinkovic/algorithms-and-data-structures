package sort;

import model.TimeComplexity;
import sort.algorithm.BubbleSort;
import sort.algorithm.InsertionSort;
import sort.algorithm.Merge;
import sort.algorithm.MergeSort;

public class Executor {

    public static void main(String[] args) {
        new TimeComplexity().measure(new InsertionSort(true));
        new TimeComplexity().measure(new Merge(true));
        new TimeComplexity().measure(new MergeSort(true));
        new TimeComplexity().measure(new BubbleSort(true));
    }
}
