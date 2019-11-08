package com.alevel.testWork1.level1;

/**
 * 2.Ход коня по шахматной доске. Вводится текущее положение коня и клетка в
 * которую пробуют его передвинуть за 1 ход. Программа должна проверить,
 * возможно ли это сделать.
 */


public class ChessStep {

    public boolean canKnightJumpInOneStep(FieldPoint start, FieldPoint finish) {

        if (start.i < 0 || start.j < 0 || finish.i < 0 || finish.j < 0)
            return false;

        return ((Math.abs(start.i - finish.i) == 2) && ((Math.abs(start.j - finish.j)) == 1))
            || ((Math.abs(start.i - finish.i) == 1) && ((Math.abs(start.j - finish.j)) == 2));
    }

    public static class FieldPoint {
        int i;
        int j;

        public FieldPoint(int i, int j) {
            this.i = i;
            this.j = j;
        }
    }
}
