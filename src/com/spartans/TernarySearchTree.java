package com.spartans;

public class TernarySearchTree {

    Node root;

    public TernarySearchTree() {
        root = null;
    }

    public void insert(String word) {
        root = insert(root, word);
    }

    public Node insert(Node node, String word) {
        if (node == null) {
            node = new Node(word.charAt(0));
            if (word.length() == 1) {
                node.isEndNode = 1;
            } else
                node.mid = insert(node.mid, word.substring(1));
        } else if (word.charAt(0) < node.data) {
            node.left = insert(node.left, word);
        } else if (word.charAt(0) > node.data) {
            node.right = insert(node.right, word);
        } else {
            if (word.length() == 1) {
                node.isEndNode = 1;
            } else
                node.mid = insert(node.mid, word.substring(1));
        }
        return node;
    }

    public void search(String word) {
        System.out.println(search(root, word) ? "Found" : "Not Found");
    }

    private Boolean search(Node node, String word) {
        if (node == null)
            return false;
        else if (word.charAt(0) < node.data) {
            return search(node.left, word);
        } else if (word.charAt(0) > node.data){
            return search(node.right, word);
        } else {
            if (word.length() == 1){
                return node.isEndNode == 1;
            } else {
                return search(node.mid, word.substring(1));
            }
        }
    }

    public void printTree() {

    }
}
