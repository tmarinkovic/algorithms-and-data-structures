package sort.algorithm;

import model.Input.DataInput;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class BubbleSortTest {

    @Test
    void shouldSort() {
        int[] data = new int[]{6, 65, 7, 9, 88, 4, 50, 6, 24};
        int[] actual = new BubbleSort(false).run(new DataInput(data));
        int[] expected = new int[]{4, 6, 6, 7, 9, 24, 50, 65, 88};

        assertArrayEquals(actual, expected);
    }

}
