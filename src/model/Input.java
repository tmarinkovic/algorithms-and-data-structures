package model;

public class Input {

    private int[] data;
    private int mergeSortBreak;

    public Input(int[] data, int mergeSortBreak) {
        this.data = data;
        this.mergeSortBreak = mergeSortBreak;
    }

    public Input(int[] data) {
        this.data = data;
    }

    public int[] getData() {
        return data;
    }

    public int getMergeSortBreak() {
        return mergeSortBreak;
    }
}
