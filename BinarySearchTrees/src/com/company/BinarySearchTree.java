package com.company;

public class BinarySearchTree {

    // Binary tree node can have at most two children (left and right)
    // Binary search tree means all values on the left subtree are smaller than root
    // Search traversals re recursive

    private TreeNode root;

    public TreeNode find(Integer data) {
        if (root != null)
            return root.find(data);

        return null;
    }

    public void insert(Integer data) {
        if (this.root == null)
            this.root = new TreeNode(data);
        else
            this.root.insert(data);
    }

    public Integer smallest() {
        if (root != null)
            return root.smallest();
        else return null;
    }

    public Integer largest() {
        if (root != null)
            return root.largest();
        else
            return null;
    }

    public void delete(Integer data) {
        //very complicated to actually implement, use soft delete instead
        TreeNode toDel = find(data);
        toDel.delete();
    }

    public void traverseInOrder() {
        if (root != null) root.traverseInOrder(root);
    }

}
