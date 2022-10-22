import jdk.jshell.spi.SPIResolutionException;

import javax.swing.*;

class Node{
    int data;
    Node left,right;
    Node(int value){
        data=value;
        left=right=null;
    }
}
class Tree{
    Node root;
    Tree(){
        root=null;
    }
    void preOrder(Node node){
        if (node==null)
            return;
        System.out.println(node.data+" ");
        preOrder(node.left);
        preOrder(node.right);
    }
    void InOrder(Node node){
        if (node==null)
            return;
        InOrder(node.left);
        System.out.println(node.data+" ");
        InOrder(node.right);
    }
    void PostOrder(Node node){
        if (node==null)
            return;
        PostOrder(node.left);
        PostOrder(node.right);
        System.out.println(node.data+" ");
    }
}

public class BinaryTree {
    public static void main(String[] args) {
        Tree tree=new Tree();
        tree.root=new Node(1);

        tree.root.left=new Node(2);
        tree.root.right=new Node(3);

        tree.root.left.left=new Node(4);
        tree.root.left.right=new Node(5);

        tree.root.right.left=new Node(6);
        tree.root.right.right=new Node(7);
        System.out.print("\nPreorder: ");
        tree.preOrder(tree.root);

        System.out.print("\nInorder: ");
        tree.InOrder(tree.root);

        System.out.print("\nPostorder: ");
        tree.PostOrder(tree.root);
    }
}
