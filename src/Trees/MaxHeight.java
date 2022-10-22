package Trees;
class Node{
    int data;
    Node left, right;
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
    int findmax(Node node){
        if(node==null)
            return 0;
        return Math.max(findmax(node.left),findmax(node.right))+1;
    }
}
public class MaxHeight {
    public static void main(String[] args) {
        Tree tree=new Tree();
        tree.root=new Node(1);

        tree.root.left=new Node(2);
        tree.root.right=new Node(3);

        tree.root.left.left=new Node(4);
        tree.root.left.right=new Node(5);

        tree.root.right.left=new Node(6);
        tree.root.right.right=new Node(7);
        System.out.println("Max height of BT is:"+tree.findmax(tree.root));

    }
}

