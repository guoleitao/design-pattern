package com.glt.designpattern.flyWeight;

/**
 * 管理对象
 */
public class TreeManager {
    int len = 100000;
    int[][] treeArray = new int[len][3];
    private Tree tree;

    public TreeManager() {
        tree = new Tree();
        for (int i = 0; i < len; i++) {
            treeArray[i] = new int[]{(int) Math.round(Math.random() * len), (int) Math.round(Math.random() * len), (int) Math.round(Math.random() * len) % 5};
        }
    }

    public void displayTrees() {
        for (int i = 0; i < len; i++) {
            tree.display(treeArray[i][0], treeArray[i][1], treeArray[i][2]);
        }
    }
}
