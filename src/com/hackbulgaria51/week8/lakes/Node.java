package com.hackbulgaria51.week8.lakes;

import java.util.ArrayList;
import java.util.List;

public class Node {
	private int data;
	private List<Node> links;
	private int depth;

	public Node(int data, int depth) {
		this.data = data;
		this.depth = depth;
		links = new ArrayList<>();
	}

	public Node(int data) {
		this.data = data;
	}

	public int getData() {
		return data;
	}

	public List<Node> getLinks() {
		return links;
	}

	public int getDepth() {
		return depth;
	}
}
