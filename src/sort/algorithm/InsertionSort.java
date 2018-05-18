package sort.algorithm;


import model.Algorithm;
import model.Input;
import model.TimeMeasurement;

public class InsertionSort extends TimeMeasurement implements Algorithm {

    public InsertionSort(boolean showExecutionTime) {
        super(showExecutionTime);
    }

    @Override
    public int[] run(Input input) {
        int[] data = input.getData();
        start(data.length);
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
}
