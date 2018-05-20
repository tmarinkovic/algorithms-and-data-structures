package model.Input;


public class InsertSortInput implements Input {

    private int[] data;

    public InsertSortInput(int[] data) {
        this.data = data;
    }

    public int[] getData() {
        return data;
    }

}
