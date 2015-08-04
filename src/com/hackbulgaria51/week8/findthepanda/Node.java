package com.hackbulgaria51.week8.findthepanda;

import java.util.ArrayList;
import java.util.List;

public class Node {
	private List<Pair> links;
	private Pair id;
	private String sign;
	private boolean visited;

	public Node(Pair id, String sign) {
		this.id = id;
		this.sign = sign;
		links = new ArrayList<>();
		setVisited(false);
	}

	public void addLink(Pair node) {
		if (node != null) {
			getLinks().add(node);
		}
	}

	public String getSign() {
		return sign;
	}

	public List<Pair> getLinks() {
		return links;
	}

	public boolean isVisited() {
		return visited;
	}

	public void setVisited(boolean visited) {
		this.visited = visited;
	}
}