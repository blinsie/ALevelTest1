package com.alevel.testWork1.level1;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class UniqueElementsTest {

    UniqueElements uniqueElements = new UniqueElements();
    int[] firstArray = new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
    int[] secondArray = new int[]{1, 1, 17, 3, 3, 5, 5, 7, 8, 9};
    int[] thirdArray = new int[]{ 4, 4, 4, 4, 4, 9};
    int[] duplicateArray = new int[]{666, 666, 666, 666, 666};
    int[] oneElementArray = new int[]{-3};
    int[] emptyArray = new int[]{};

    @Test
    public void getUniqueElementsCountInFirstArrayTest() {
        Assert.assertEquals(10, uniqueElements.getUniqueElementsCountInArray(firstArray));
    }

    @Test
    public void getUniqueElementsCountInSecondArrayTest() {
        Assert.assertEquals(7, uniqueElements.getUniqueElementsCountInArray(secondArray));
    }

    @Test
    public void getUniqueElementsCountInThirdArrayTest() {
        Assert.assertEquals(2, uniqueElements.getUniqueElementsCountInArray(thirdArray));
    }

    @Test
    public void getUniqueElementsCountInDuplicateArrayTest() {
        Assert.assertEquals(1, uniqueElements.getUniqueElementsCountInArray(duplicateArray));
    }
    @Test
    public void getUniqueElementsCountInEmptyArrayTest() {
        Assert.assertEquals(0, uniqueElements.getUniqueElementsCountInArray(emptyArray));
    }

    @Test
    public void getUniqueElementsCountInOneElementArrayTest() {
        Assert.assertEquals(1, uniqueElements.getUniqueElementsCountInArray(oneElementArray));
    }

}