package com.alevel.testWork1.level2;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class CheckClosedParenthesesTest {

    @Test
    public void isAllParenthesesClosedFirstTrueTest() {
        Assert.assertTrue(new CheckClosedParentheses().isAllParenthesesClosed("{}"));
    }

    @Test
    public void isAllParenthesesClosedSecondTrueTest() {
        Assert.assertTrue(new CheckClosedParentheses().isAllParenthesesClosed("{}()[]"));
    }

    @Test
    public void isAllParenthesesClosedThirdTrueTest() {
        Assert.assertTrue(new CheckClosedParentheses().isAllParenthesesClosed("{[]()}"));
    }

    @Test
    public void isAllParenthesesClosedFirstFalseTest() {
        Assert.assertFalse(new CheckClosedParentheses().isAllParenthesesClosed("{[}] ()"));
    }

    @Test
    public void isAllParenthesesClosedSecondFalseTest() {
        Assert.assertFalse(new CheckClosedParentheses().isAllParenthesesClosed("987{}"));
    }

    @Test
    public void isAllParenthesesClosedThirdFalseTest() {
        Assert.assertFalse(new CheckClosedParentheses().isAllParenthesesClosed("[{}(])"));
    }

}