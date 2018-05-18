package sort.algorithm;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class InsertionSortTest {

    @Test
    void shouldSort() {
        int[] data = new int[]{6, 65, 7, 9, 88, 4, 50, 24, 6};
        int[] actual = new InsertionSort().run(data);
        int[] expected = new int[]{4, 6, 6, 7, 9, 24, 50, 65, 88};

        assertArrayEquals(actual, expected);
    }
}
