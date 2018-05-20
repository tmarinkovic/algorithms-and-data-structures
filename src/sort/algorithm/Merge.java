package sort.algorithm;

import model.Algorithm;
import model.Input.Input;
import model.Input.MergeInput;
import model.TimeMeasurement;

public class Merge extends TimeMeasurement implements Algorithm {

    public Merge(boolean showExecutionTime) {
        super(showExecutionTime);
    }

    @Override
    public int[] run(Input input) {
        int data[] = input.getData();
        final int startOfLeft = ((MergeInput) input).getStartOfLeftArray();
        final int endOfLeft = ((MergeInput) input).getEndOfLeftArray();
        final int enfOfRight = ((MergeInput) input).getEndOfRightArray();


        start(data.length);

        int n1 = endOfLeft - startOfLeft + 1;
        int n2 = enfOfRight - endOfLeft;

        int[] Left = new int[n1 + 1];
        int[] Right = new int[n2 + 1];

        for(int i = 0 ; i < n1 ; i++){
            Left[i] = data[startOfLeft+i];
        }

        for(int i = 0 ; i < n2 ; i++){
            Right[i] = data[endOfLeft+i + 1];
        }

//        System.arraycopy(data, 0, Left, 0, n1);
//        System.arraycopy(data, n1, Right, 0, n2);

        Left[n1] = Integer.MAX_VALUE;
        Right[n2] = Integer.MAX_VALUE;

        int leftIndex = 0;
        int rightIndex = 0;

        for (int i = startOfLeft; i <= enfOfRight; i++) {
            if (Left[leftIndex] <= Right[rightIndex]) {
                data[i] = Left[leftIndex];
                leftIndex++;
            } else {
                data[i] = Right[rightIndex];
                rightIndex++;
            }
        }
        done();
        return data;

    }
}
