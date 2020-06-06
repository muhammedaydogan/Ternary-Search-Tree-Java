package com.spartans;

public class Main {

    public static void main(String[] args) {
	// write your code here
        TernarySearchTree tree = new TernarySearchTree();
        tree.insert("ahmet");
        tree.insert("ahmetcan");
        tree.insert("ahmetcan");
        tree.search("ahmet");
        tree.search("ahmetc");
        tree.search("ahmetcan");
        tree.search("ahm");
        tree.search("qqq");
    }
}
