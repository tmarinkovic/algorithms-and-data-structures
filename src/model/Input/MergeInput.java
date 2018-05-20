package model.Input;

public class MergeInput implements Input {

    private int[] data;
    private int startOfLeftArray;
    private int endOfLeftArray;
    private int endOfRightArray;

    public MergeInput(int[] data, int startOfLeftArray, int endOfLeftArray, int endOfRightArray) {
        this.data = data;
        this.startOfLeftArray = startOfLeftArray;
        this.endOfLeftArray = endOfLeftArray;
        this.endOfRightArray = endOfRightArray;
    }

    @Override
    public int[] getData() {
        return data;
    }

    public int getStartOfLeftArray() {
        return startOfLeftArray;
    }

    public int getEndOfLeftArray() {
        return endOfLeftArray;
    }

    public int getEndOfRightArray() {
        return endOfRightArray;
    }
}
