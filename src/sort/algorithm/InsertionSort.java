package sort.algorithm;


import model.Algorithm;
import model.TimeComplexity;

public class InsertionSort extends TimeComplexity implements Algorithm {

    private int[] data;

    public InsertionSort(int[] data) {
        this.data = data;
    }

    @Override
    public int[] run() {
        for (int i = 1; i < data.length; i++) {
            int current = data[i];
            int j = i - 1;
            while (j >= 0 && data[j] > current) {
                data[j + 1] = data[j];
                j--;
            }
            data[j + 1] = current;
        }
        done();
        return data;
    }

    @Override
    public void done() {
        super.done();
    }
}
