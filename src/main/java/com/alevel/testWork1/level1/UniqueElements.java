package com.alevel.testWork1.level1;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * 1.Дан массив чисел. Вернуть число уникальных символов
 * Пример: для 1 4 5 1 1 3 ответ 4.
 */

public class UniqueElements {

    public int getUniqueElementsCountInArray(int[] array) {
        int counter = array.length;
        int currentNum = 0;

        Arrays.sort(array);

        for (int i = 0; i < array.length; ) {
            for (int j = i; j < array.length; j++) {
                if (array[j] == array[i]) {
                    currentNum++;
                }
            }
            if (currentNum > 1) {
                counter = counter - currentNum + 1;
                i = i + currentNum;
            } else {
                i++;
            }
            currentNum = 0;
        }

        return counter;

    }

}
