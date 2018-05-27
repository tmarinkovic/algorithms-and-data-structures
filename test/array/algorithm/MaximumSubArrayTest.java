package array.algorithm;

import array.algorithn.MaximumSubArray;
import model.Input.DataInput;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class MaximumSubArrayTest {

    @Test
    void shouldSort() {
        int[] data = new int[]{13, -3, -25, 20, -3, -16, -23, 18, 20, -7, 12, -5, -22, 15, -4, 7};
        int[] actual = new MaximumSubArray(false).run(new DataInput(data));
        int[] expected = new int[]{18, 20, -7, 12};

        assertArrayEquals(actual, expected);
    }

}
