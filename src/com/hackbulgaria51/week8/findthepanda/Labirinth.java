package com.hackbulgaria51.week8.findthepanda;

import java.util.ArrayList;
import java.util.List;

public class Labirinth {
	private List<List<Node>> nodes;
	private List<Node> lab;

	public Labirinth() {
		nodes = new ArrayList<>();
		lab = new ArrayList<>();
	}

	public void createLabirinth(String input) {
		List<Node> row = new ArrayList<>();
		Node n;
		for (int i = 0; i < input.length(); i++) {
			if (i == 0 || i == input.length()) {
				n = new Node(input.charAt(i), 0);
			} else {
				n = new Node(input.charAt(i), 1);
			}
			row.add(n);
		}
		nodes.add(row);
	}

	public boolean canLink(Node a, Node b) {
		
		return a.getSign() != '#' && a.getLinks().size() < 4
				&& b.getSign() != '#' && b.getLinks().size() < 4;
	}

	//
	public void linkNodes() {
		int size = nodes.size();
		for (int i = 1; i < size - 1; i++) {
			for (int j = 0; j < nodes.get(i).size(); j++) {
				Node prev = nodes.get(i - 1).get(j);
				Node current = nodes.get(i).get(j);
				if (canLink(prev, current)) {
					prev.addLinks(current);
					current.addLinks(prev);
				}

			}
		}
	}

	public String toString() {
		String s = "";
		for (int i = 0; i < nodes.size(); i++) {
			for (int j = 0; j < nodes.get(i).size(); j++) {
				s += nodes.get(i).get(j);
			}
			s += "\n";
		}
		return s;
	}
}
