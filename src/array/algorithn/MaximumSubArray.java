package array.algorithn;

import model.Algorithm;
import model.Input.Input;
import model.TimeMeasurement;

public class MaximumSubArray extends TimeMeasurement implements Algorithm {


    public MaximumSubArray(boolean showExecutionTime) {
        super(showExecutionTime);
    }

    @Override
    public int[] run(Input input) {
        int data[] = input.getData();
        start(data.length);

        int currentMaximum = Integer.MIN_VALUE;
        int maximum = 0, startIndex = 0, endIndex = 0, s = 0;

        for (int i = 0; i < data.length; i++) {
            maximum += data[i];

            if (currentMaximum < maximum) {
                currentMaximum = maximum;
                startIndex = s;
                endIndex = i;
            }

            if (maximum < 0) {
                maximum = 0;
                s = i + 1;
            }
        }
        done();
        int[] result = new int[endIndex - startIndex + 1];
        System.arraycopy(data, startIndex, result, 0, endIndex + 1 - startIndex);
        return result;
    }
}
