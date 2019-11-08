package com.alevel.testWork1.level1;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class AriaOfTriangleTest {

    AriaOfTriangle ariaOfTriangle = new AriaOfTriangle();
    AriaOfTriangle.Point a = new AriaOfTriangle.Point(2.2, 3.3);
    AriaOfTriangle.Point b = new AriaOfTriangle.Point(0.0, 3.4);
    AriaOfTriangle.Point c = new AriaOfTriangle.Point(5.6, 8.7);
    AriaOfTriangle.Point d = new AriaOfTriangle.Point(0.0, 0.0);
    AriaOfTriangle.Point d1 = new AriaOfTriangle.Point(1.0, 0.0);
    AriaOfTriangle.Point d2 = new AriaOfTriangle.Point(2.0, 0.0);

    @Test
    public void getAreaOfTriangleTest() {
        Assert.assertEquals(6.11, ariaOfTriangle.getAreaOfTriangle(a, b, c), 0.0001);
    }

    @Test
    public void getAreaOfZeroTriangleTest() {
        Assert.assertEquals(0.0, ariaOfTriangle.getAreaOfTriangle(d, d, d), 0.0001);
    }

    @Test
    public void getAreaOfOnePointTest() {
        Assert.assertEquals(0.0, ariaOfTriangle.getAreaOfTriangle(a, a, a), 0.0001);
    }

    @Test
    public void getAreaOfOneLinePointTest() {
        Assert.assertEquals(0.0, ariaOfTriangle.getAreaOfTriangle(d, d1, d2), 0.0001);
    }
}