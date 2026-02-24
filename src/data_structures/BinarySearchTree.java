package data_structures;

import java.util.ArrayList;

public class BinarySearchTree {
    private Node root;


    public void add(Node n) {
        if(root == null) {
            root = n;
            return;
        }
        Node pointer = root;
        while(pointer != null) {
            if(n.data < pointer.data) {
                if(pointer.left == null) {
                    pointer.left = n;
                    break;
                }
                pointer = pointer.left;
                continue;
            }
            if(pointer.right == null) {
                pointer.right = n;
                break;
            }
            pointer = pointer.right;
        }
    }

    public String toString() {
        if(root == null) return null;
        StringBuilder sb = new StringBuilder();
        Node pointer = root;
        ArrayList<Node> nodeQueue = new ArrayList<>();
        nodeQueue.add(pointer);
        while(!nodeQueue.isEmpty()){
            pointer = nodeQueue.getFirst();
            if(pointer == root) {
                sb.append("([root]").append(pointer.data).append(")");
            }
            if(pointer.left != null) {
                nodeQueue.add(pointer.left);
                sb.append("->([left]").append(pointer.left.data).append(")");
            }
            if(pointer.right != null) {
                nodeQueue.add(pointer.right);
                sb.append("->([right]").append(pointer.right.data).append(")");

            }
            nodeQueue.removeFirst();
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree();
        bst.add(new Node(5));
        bst.add(new Node(3));
        bst.add(new Node(7));
        System.out.println(bst.toString());
    }
}

class Node {
    Node left;
    Node right;
    int data;

    public Node(int data) {
        this.data = data;
    }
}
