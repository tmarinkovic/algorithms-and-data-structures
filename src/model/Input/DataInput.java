package model.Input;


public class DataInput implements Input {

    private int[] data;

    public DataInput(int[] data) {
        this.data = data;
    }

    public int[] getData() {
        return data;
    }

}
