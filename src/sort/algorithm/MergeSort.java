package sort.algorithm;

import model.Algorithm;
import model.Input;
import model.TimeMeasurement;

public class MergeSort extends TimeMeasurement implements Algorithm {

    public MergeSort(boolean showExecutionTime) {
        super(showExecutionTime);
    }

    @Override
    public int[] run(Input input) {
        int[] data = input.getData();

        start(data.length);

        int n1 = input.getMergeSortBreak() + 1;
        int n2 = data.length - n1;

        int[] Left = new int[n1+1];
        int[] Right = new int[n2+1];

        System.arraycopy(data, 0, Left, 0, n1);
        System.arraycopy(data, n1, Right, 0, n2);

        Left[n1] = Integer.MAX_VALUE;
        Right[n2] = Integer.MAX_VALUE;

        int leftIndex = 0;
        int rightIndex = 0;

        for(int i = 0; i < data.length; i++){
            if(Left[leftIndex] <= Right[rightIndex]){
                data[i] = Left[leftIndex];
                leftIndex++;
            }
            else{
                data[i] = Right[rightIndex];
                rightIndex++;
            }
        }
        done();
        return data;
    }
}
