package com.alevel.testWork1.level2;

/**
 * 2. По заданному бинарному дереву найдите его максимальную глубину.
 * Максимальная глубина - это количество узлов вдоль самого длинного
 * пути от корневого узла до самого дальнего конечного узла.
 *
 * /**
 *  * Definition for a binary tree node.
 *  * public class TreeNode {
 *  *     int val;
 *  *     TreeNode left;
 *  *     TreeNode right;
 *  *     TreeNode(int x) { val = x; }
 *  * }
 *  */


public class BinaryTreeMaxDepth {

    public int getBinaryTreeMaxDepth (TreeNode node) {
        if (node == null)
            return 0;
        else {
            return 1 + Math.max(getBinaryTreeMaxDepth(node.left),
                    getBinaryTreeMaxDepth(node.right));
        }
    }


    public static class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;

      public TreeNode(int x) {
          val = x;
      }
    }
}
