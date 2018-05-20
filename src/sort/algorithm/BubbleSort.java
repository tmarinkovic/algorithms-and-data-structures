package sort.algorithm;

import model.Algorithm;
import model.Input.Input;
import model.TimeMeasurement;

public class BubbleSort extends TimeMeasurement implements Algorithm {

    public BubbleSort(boolean showExecutionTime) {
        super(showExecutionTime);
    }

    @Override
    public int[] run(Input input) {
        int[] data = input.getData();
        start(data.length);
        for (int i = 0; i < data.length; i++) {
            for (int j = data.length - 1; j > i; j--) {
                if (data[j] < data[j - 1]) {
                    int temp = data[j];
                    data[j] = data[j - 1];
                    data[j - 1] = temp;
                }
            }
        }
        done();
        return data;
    }
}
