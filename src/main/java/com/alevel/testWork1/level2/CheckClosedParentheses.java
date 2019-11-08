package com.alevel.testWork1.level2;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;

/**
 * 1.Учитывая строку, содержащую только символы '(', ')', '{', '}', '[' и ']',
 * определите, является ли входная строка допустимой.
 *
 * Входная строка действительна, если:
 * Открытые скобки должны быть закрыты скобками того же типа.
 * Открытые скобки должны быть закрыты в правильном порядке.
 * Обратите внимание, что пустая строка также считается допустимой.
 */

public class CheckClosedParentheses {

    public boolean isAllParenthesesClosed(String string) {
        Deque stack = new ArrayDeque();

        char[] charArray = string.toCharArray();

        for (char ch : charArray) {
            if (ch == '(')
                stack.push(')');
            else if (ch == '[')
                stack.push(']');
            else if (ch == '{')
                stack.push('}');
            else if (stack.isEmpty() || !stack.pop().equals(ch)) {
                return false;
            }
        }

        return stack.isEmpty();
    }


}
