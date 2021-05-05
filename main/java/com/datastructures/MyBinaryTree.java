package com.datastructures;

public class MyBinaryTree<K extends Comparable<K>> {
    private MyBinaryNode<K> root;
    //add binary node to tree having given key value
    public void add(K key) {
        this.root = this.addRecursively(root,key);
    }
    //add recursively by traversing left & right
    private MyBinaryNode<K> addRecursively(MyBinaryNode<K> current, K key) {
        if(current == null)
            return new MyBinaryNode<>(key);
        int compareResult=key.compareTo(current.key);
        if(compareResult == 0) return current;
        if(compareResult < 0) {
            current.left = addRecursively(current.left,key);
        }
        if(compareResult > 0) {
            current.right = addRecursively(current.right,key);
        }
        return current;
    }
    //get total nodes in binary tree
    public int getSize() {
        return this.getSizeRecursive(root);
    }
    //find size by recursively traversing left & right nodes
    private int getSizeRecursive(MyBinaryNode<K> current) {
        return current == null ? 0 : 1 + this.getSizeRecursive(current.left) +
                                         this.getSizeRecursive(current.right);
    }
    //display binary tree nodes
    public void displayBinaryTree() {
        preOrderTraversal(this.root);
    }
    //traverse binary tree as pre order traversal
    public void preOrderTraversal(MyBinaryNode root) {
        if(root !=  null) {
            //Visit the node by Printing the node data
            System.out.printf("%d ",root.key);
            preOrderTraversal(root.left);
            preOrderTraversal(root.right);
        }
    }
}