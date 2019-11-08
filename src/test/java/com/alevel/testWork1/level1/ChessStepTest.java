package com.alevel.testWork1.level1;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ChessStepTest {

    int[][] field = new int[8][8];
    ChessStep.FieldPoint start1 = new ChessStep.FieldPoint(4, 2);
    ChessStep.FieldPoint start2 = new ChessStep.FieldPoint(0, 2);
    ChessStep.FieldPoint finish1 = new ChessStep.FieldPoint(3, 4);
    ChessStep.FieldPoint finish2 = new ChessStep.FieldPoint(1, 4);
    ChessStep.FieldPoint zeroPoint = new ChessStep.FieldPoint(0, 0);
    ChessStep.FieldPoint minusPoint = new ChessStep.FieldPoint(-6, 0);

    @Test
    public void canKnightJumpInOneStepTrueTest() {
        Assert.assertTrue(new ChessStep().canKnightJumpInOneStep(start1, finish1));
    }

    @Test
    public void canKnightJumpInOneStepFalseTest() {
        Assert.assertFalse(new ChessStep().canKnightJumpInOneStep(start1, finish2));
    }

    @Test
    public void canKnightJumpInOneNegativeStepTest() {
        Assert.assertFalse(new ChessStep().canKnightJumpInOneStep(start1, minusPoint));
    }

    @Test
    public void canKnightJumpInOneStepFromBorderTest() {
        Assert.assertTrue(new ChessStep().canKnightJumpInOneStep(start2, finish2));
    }
}