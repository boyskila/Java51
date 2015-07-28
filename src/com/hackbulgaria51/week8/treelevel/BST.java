package com.hackbulgaria51.week8.treelevel;

import java.util.LinkedList;
import java.util.List;

public class BST<T extends Comparable<T>> {
	private Node<T> root;
	private List<T> levelData;

	public BST() {
		root = null;
	}

	public boolean empty() {
		return root == null;
	}

	public void add(T data) {
		if (empty()) {
			root = new Node<>(data);
		} else {
			addRecursive(data, root);
		}
	}

	private void addRecursive(T data, Node<T> root) {
		Node<T> newNode = new Node<>(data);
		Node<T> tempNode = null;
		if (data.compareTo(root.data) < 0) {
			if (root.left == null) {
				root.left = newNode;
				return;
			}
			tempNode = root.left;
		} else {
			if (root.right == null) {
				root.right = newNode;
				return;
			}
			tempNode = root.right;
		}
		if (tempNode != null) {
			addRecursive(data, tempNode);
		}
	}

	public int getTreeHight() {
		return calculateHight(root);
	}

	private int calculateHight(Node<T> node) {
		if (node == null) {
			return 0;
		}
		int a = calculateHight(node.left);
		int b = calculateHight(node.right);
		return 1 + Math.max(a, b);

	}

	private void findLevel(Node<T> root, int level) {
		if (root == null) {
			return;
		}
		if (level == 1) {
			levelData.add(root.data);
		}
		findLevel(root.left, level - 1);
		findLevel(root.right, level - 1);
	}

	public List<T> getLevelData(int level) {
		levelData = new LinkedList<>();
		findLevel(root, level);
		return levelData;
	}

	private String toStringRecursive(Node<T> root) {
		if (root == null){
			return " ";
		}
		String str = "";
		str += toStringRecursive(root.left);
		str += root.data;
		str += toStringRecursive(root.right);
		return str;
	}

	public String toString() {
		String str = "[";
		str += toStringRecursive(root);
		return str + "]";
	}

}