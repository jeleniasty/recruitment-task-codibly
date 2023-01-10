import java.math.BigDecimal;
import java.util.*;

public class BubbleSort {
    //Bubble sort Create list “BubbleSort” class with one public method called “sort”
    //(You can create other private methods) which has to sort numbers in accordance
    //with the “Bubble sort” algorithm. method should receive List of Comparable
    //(parameter name = “input”) method should return List of Comparable, but the numbers
    // should be sorted ascending if the input is null then method should throw an exception
    // if the input contains null value in list then method should omit this element Create list
    // “BubbleSortTest” class and create test methods for below cases:
    // input = [1,4,5,6,8,3,8] result = [1,3,4,5,6,8,8]
    // input = [-9.3,0.2,4,0.1,5,9] result = [-9.3,0.1,0.2,4,5,9]
    // input = [] result = []
    // input = [null,5.0001] result = [5.0001]
    // input = null result = RuntimeException

    public List<Comparable<? extends Number>> sort(List<Comparable<? extends Number>> input) {

        if (input == null) {
            throw new RuntimeException();
        }

        List<BigDecimal> list = new ArrayList<>();
        input.stream()
                .filter(Objects::nonNull)
                .forEach(number -> list.add((new BigDecimal(number.toString()))));

        for (int i = list.size(); i > 1; i--) {
            for (int j = 1; j < i; j++) {
                if (list.get(j - 1).compareTo(list.get(j)) > 0) {
                    Collections.swap(list, j, j - 1);
                }
            }
        }

        List<Comparable<? extends Number>> output = new ArrayList<>();
        for (BigDecimal number : list) {
            if (number.remainder(BigDecimal.ONE).equals(BigDecimal.ZERO)) {
                output.add(number.intValue());
            } else {
                output.add(number.doubleValue());
            }
        }
        return output;
    }

}
