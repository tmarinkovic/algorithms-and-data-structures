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
        int sum = 0, startIndex = 0, endIndex = 0, tempStartIndex = 0;

        for (int i = 0; i < data.length; i++) {
            sum += data[i];

            if (currentMaximum < sum) {
                currentMaximum = sum;
                startIndex = tempStartIndex;
                endIndex = i;
            }

            if (sum < 0) {
                sum = 0;
                tempStartIndex = i + 1;
            }
        }
        done();
        int[] result = new int[endIndex - startIndex + 1];
        System.arraycopy(data, startIndex, result, 0, endIndex + 1 - startIndex);
        return result;
    }
}
