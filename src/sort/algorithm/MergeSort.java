package sort.algorithm;

import model.Algorithm;
import model.Input.Input;
import model.Input.MergeInput;
import model.Input.MergeSortInput;
import model.TimeMeasurement;

public class MergeSort extends TimeMeasurement implements Algorithm {


    public MergeSort(boolean showExecutionTime) {
        super(showExecutionTime);
    }

    @Override
    public int[] run(Input input) {
        start(input.getData().length);
        int[] data = recursive(input);
        done();
        return data;
    }

    private int[] recursive(Input input) {
        int data[] = input.getData();
        int p = ((MergeSortInput) input).getStart();
        int r = ((MergeSortInput) input).getEnd();

        int t = p + 1;

        if (t < r) {
            int q = (int) Math.floor((p + r) / 2.0);
            data = recursive(new MergeSortInput(data, p, q));
            data = recursive(new MergeSortInput(data, q, r));
            data = new Merge(false).run(new MergeInput(data, p, q - 1, r - 1));
        }

        return data;
    }

}
