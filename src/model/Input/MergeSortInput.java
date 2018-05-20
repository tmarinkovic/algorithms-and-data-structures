package model.Input;


public class MergeSortInput implements Input {

    private int[] data;
    private int start;
    private int end;

    public MergeSortInput(int[] data, int start, int end) {
        this.data = data;
        this.start = start;
        this.end = end;
    }

    @Override
    public int[] getData() {
        return data;
    }

    public int getStart() {
        return start;
    }

    public int getEnd() {
        return end;
    }
}
