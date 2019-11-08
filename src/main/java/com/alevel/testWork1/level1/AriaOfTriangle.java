package com.alevel.testWork1.level1;

/**
 * 3.Даны точки A,B,C  на плоскости.  Вычислить площадь  треугольника ABC.
 */

public class AriaOfTriangle {


    public double getAreaOfTriangle(Point x, Point y, Point z) {
        double area;

        double a = x.x - z.x;
        double b = y.x - z.x;
        double c = x.y - z.y;
        double d = y.y - z.y;

        area = ((a * d) - (b * c)) * 0.5;

        return Math.abs(area);
    }


    public static class Point {
        double x;
        double y;

        public Point(double x, double y) {
            this.x = x;
            this.y = y;
        }
    }
}
