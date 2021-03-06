package com.datastructures;

import org.junit.Assert;
import org.junit.Test;

public class MyBinaryTreeTest {
    @Test
    public void given3Numbers_WhenAddedToBinaryTree_ShouldReturnSizeThree(){
        MyBinaryTree<Integer> myBinaryTree = new MyBinaryTree<Integer>();
        myBinaryTree.add(56);
        myBinaryTree.add(30);
        myBinaryTree.add(70);
        int size = myBinaryTree.getSize();
        Assert.assertEquals(3,size);
    }
    @Test
    public void givenNumbers_WhenAddedToBinaryTree_ShouldReturnCorrectSize(){
        MyBinaryTree<Integer> myBinaryTree = new MyBinaryTree<Integer>();
        myBinaryTree.add(56);
        myBinaryTree.add(30);
        myBinaryTree.add(70);
        myBinaryTree.add(22);
        myBinaryTree.add(40);
        myBinaryTree.add(11);
        myBinaryTree.add(60);
        myBinaryTree.add(63);
        myBinaryTree.add(3);
        myBinaryTree.add(16);
        myBinaryTree.add(67);
        myBinaryTree.add(95);
        myBinaryTree.add(65);
        int size = myBinaryTree.getSize();
        myBinaryTree.displayBinaryTree();
        Assert.assertEquals(13,size);
    }
    @Test
    public void givenNumbers_WhenAddedToBinaryTree_ShouldBeAbleTo_SearchGivenElement(){
        MyBinaryTree<Integer> myBinaryTree = new MyBinaryTree<Integer>();
        myBinaryTree.add(56);
        myBinaryTree.add(30);
        myBinaryTree.add(70);
        myBinaryTree.add(22);
        myBinaryTree.add(40);
        myBinaryTree.add(11);
        myBinaryTree.add(60);
        myBinaryTree.add(63);
        myBinaryTree.add(3);
        myBinaryTree.add(16);
        myBinaryTree.add(67);
        myBinaryTree.add(95);
        myBinaryTree.add(65);
        MyBinaryNode myBinaryNode = myBinaryTree.searchTree(63);
        myBinaryTree.displayBinaryTree();
        Assert.assertEquals(63,myBinaryNode.key);
    }
}
