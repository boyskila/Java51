package com.hackbulgaria51.week8.treelevel;

public class TreeLevel {
	public static void main(String[] args) {
		BST<Integer> bst = new BST<>();
		bst.add(15);
		bst.add(8);
		bst.add(5);
		bst.add(13);
		bst.add(14);
		bst.add(33);
		bst.add(27);
		bst.add(43);
		bst.add(26);
		bst.add(23);
		bst.add(24);
		
		System.out.println(bst);
		System.out.println(bst.getTreeHight());
		System.out.println(bst.getLevelData(5));
	}
}
