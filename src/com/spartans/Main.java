package com.spartans;

public class Main {

    public static void main(String[] args) {
	// write your code here
        TernarySearchTree tree = new TernarySearchTree();

        tree.insert("cat");
        tree.insert("cats");
        tree.insert("up");
        tree.insert("bug");

        System.out.println("Following are search results for cats, bu and cat respectively");
        tree.search("cats");
        tree.search("bu");
        tree.search("cat");
    }
}
