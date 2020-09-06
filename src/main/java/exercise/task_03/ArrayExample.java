package exercise.task_03;

import java.util.Arrays;
import java.util.LinkedHashSet;

/**
 * Wykorzystując podejście TDD zaimplementuj w klasie ArrayExample metodę:
 *
 * public String[] removeDuplicates(String[] array)
 *
 * Metoda powinna zwrócić nową tablicę bez duplikatów.
 */

public class ArrayExample {

    public String[] removeDuplicates(String[] array) {
        if (array == null) {
            throw new IllegalArgumentException("array can't be null");
        }

        LinkedHashSet<String> set = new LinkedHashSet<>(Arrays.asList(array));
        return set.toArray(new String[] {});
    }
}
