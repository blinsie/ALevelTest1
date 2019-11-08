package com.alevel.testWork1.level1;

import java.util.HashSet;
import java.util.Set;

/**
 * 1.Дан массив чисел. Вернуть число уникальных символов
 * Пример: для 1 4 5 1 1 3 ответ 4.
 */

public class UniqueElements {

    public int getUniqueElementsCountInArray(int[] array) {
        Set<Integer> set = new HashSet<Integer>();
        int counter = 0;

        for (int i = 0; i < array.length; i++) {
            if(!set.contains(array[i])) {
                counter++;
                set.add(array[i]);
            }
        }

        return counter;

    }

}
