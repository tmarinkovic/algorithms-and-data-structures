package sort.algorithm;

import model.Input;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class MergeSortTest {

    @Test
    void shouldSort() {
        int[] data = new int[]{1,2,5,7,12,6,7,8,9};
        int[] actual = new MergeSort(false).run(new Input(data, 4));
        int[] expected = new int[]{1,2,5,6,7,7,8,9,12};

        assertArrayEquals(actual, expected);
    }
}