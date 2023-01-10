import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BubbleSortTest {

    @Test
    void sortIntegerList() {
        var bubbleSort = new BubbleSort();
        List<Comparable<? extends Number>> input = Arrays.asList(1, 4, 5, 6, 8, 3, 8);
        assertEquals(Arrays.asList(1,3,4,5,6,8,8),bubbleSort.sort(input));
    }

    @Test
    void sortIntegerAndDoublesList() {
        var bubbleSort = new BubbleSort();
        List<Comparable<? extends Number>> input = List.of(-9.3,0.2,4,0.1,5,9);
        List<Comparable<? extends Number>> output = List.of(-9.3,0.1,0.2,4,5,9);
        assertArrayEquals(output.toArray(),bubbleSort.sort(input).toArray());
    }

    @Test
    void sortEmptyList() {
        var bubbleSort = new BubbleSort();
        List<Comparable<? extends Number>> input = List.of();
        assertArrayEquals(List.of().toArray(),bubbleSort.sort(input).toArray());
    }

    @Test
    void sortListWithNullValues() {
        var bubbleSort = new BubbleSort();
        List<Comparable<? extends Number>> input = Arrays.asList(null,5.0001);
        List<Comparable<? extends Number>> output = List.of(5.0001);
        assertArrayEquals(output.toArray(),bubbleSort.sort(input).toArray());
    }

    @Test
    void sortNullList() {
        var bubbleSort = new BubbleSort();
        assertThrows(RuntimeException.class, () -> bubbleSort.sort(null));
    }
}