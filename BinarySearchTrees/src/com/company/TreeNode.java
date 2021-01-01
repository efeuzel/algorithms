package com.company;

public class TreeNode {

    private Integer data;
    private TreeNode leftChild;
    private TreeNode rightChild;
    private boolean isDeleted = false;

    public TreeNode(Integer data) {
        this.data = data;
    }

    public TreeNode find(Integer data) {
        if (this.data == data && this.isDeleted == false)
            return this;
        if (data < this.data && this.leftChild != null)
            return leftChild.find(data);
        if (this.rightChild != null)
            return this.rightChild.find(data);

        return null;
    }

    public void insert(Integer data) {
        if (data >= this.data) {
            if (this.rightChild == null)
                this.rightChild = new TreeNode(data);
            else
                this.rightChild.insert(data);
        } else {
            if (this.leftChild == null)
                this.leftChild = new TreeNode(data);
            else
                this.leftChild.insert(data);
        }

    }

    public Integer smallest() {
        if (this.leftChild == null)
            return this.data;
        else
            return this.leftChild.smallest();
    }

    public Integer largest() {
        if (this.rightChild == null)
            return this.data;
        else
            return this.rightChild.largest();
    }

    public void traverseInOrder(TreeNode node) {
        if (node == null)
            return;
        traverseInOrder(node.getLeftChild());
        System.out.print(node.getData() + " ");
        traverseInOrder(node.getRightChild());
    }

    public Integer getData() {
        return data;
    }

    public TreeNode getLeftChild() {
        return leftChild;
    }

    public void setLeftChild(TreeNode leftChild) {
        this.leftChild = leftChild;
    }

    public TreeNode getRightChild() {
        return rightChild;
    }

    public void setRightChild(TreeNode rightChild) {
        this.rightChild = rightChild;
    }

    public void delete() {
        this.isDeleted = true;
    }

    public boolean getIsDeleted() {
        return this.isDeleted;
    }
}
