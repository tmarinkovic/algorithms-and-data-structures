package sort.algorithm;

import model.Algorithm;
import model.Input.Input;
import model.Input.MergeInput;
import model.Input.MergeSortInput;

public class MergeSort implements Algorithm {


    @Override
    public int[] run(Input input) {
        int data[] = input.getData();
        int p = ((MergeSortInput) input).getStart();
        int r = ((MergeSortInput) input).getEnd();

        int t = p + 1;

        if (t < r) {
            int q = (int) Math.floor((p + r) / 2.0);
            data = run(new MergeSortInput(data, p, q));
            data = run(new MergeSortInput(data, q, r));
            data = new Merge(false).run(new MergeInput(data, p, q - 1, r - 1));
        }

        return data;
    }

    @Override
    public void start(int n) {

    }

    @Override
    public void done() {

    }

    @Override
    public Double getExecutionTime() {
        return null;
    }
}
