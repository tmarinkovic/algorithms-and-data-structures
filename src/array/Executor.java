package array;

import array.algorithn.MaximumSubArray;
import model.TimeComplexity;

public class Executor {

    public static void main(String[] args) {
        new TimeComplexity().measure(new MaximumSubArray(true));
    }
}
