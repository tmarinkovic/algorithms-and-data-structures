package sort;

import sort.algorithm.InsertionSort;

public class Executor {

    public static void main(String[] args) {
        new InsertionSort(Data.getUnsortedArray(1000000)).run();
    }
}
