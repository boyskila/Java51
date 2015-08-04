package com.hackbulgaria51.week8.findthepanda;

import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class Labirinth {
	private String[][] lab;
	private List<Node> nodes;
	Node[][] n;

	public Labirinth(String[][] lab, int row, int col) {
		nodes = new LinkedList<>();
		this.lab = lab;
		n = new Node[row][col];
	}

	public void makeLinks() {
		for (int i = 0; i < lab.length; i++) {
			for (int j = 0; j < lab[i].length; j++) {
				Node node = new Node(new Pair(i, j), lab[i][j]);
				if (!lab[i][j].equals("#")) {
					node.addLink(checkRight(i, j));
					node.addLink(checkDown(i, j));
					node.addLink(checkUp(i, j));
					node.addLink(checkLeft(i, j));
					n[i][j] = node;
					nodes.add(node);
				}
			}
		}
	}

	private Node getStartPosition() {
		for (Node node : nodes) {
			if (node.getSign().equals("U")) {
				return node;
			}
		}
		return null;
	}

	public boolean canFind() {
		Stack<Pair> p = new Stack<>();
		Node node = getStartPosition();
		for (int i = 0; i < nodes.size(); i++) {
			List<Pair> links = node.getLinks();
			for (int j = 0; j < links.size(); j++) {
				Pair pa = links.get(j);
				Node nodi = n[pa.x][pa.y];
				if (!nodi.isVisited()) {
					p.add(links.get(j));
				}
			}
			if (!p.isEmpty()) {
				Pair pair = p.pop();
				int x = pair.x;
				int y = pair.y;
				if (node.getSign().equals("P")) {
					return true;
				}
				node.setVisited(true);
				node = n[x][y];
			} else {
				return false;
			}
		}
		return false;
	}

	private Pair checkRight(int x, int y) {
		return y < lab[x].length - 1 && !lab[x][++y].equals("#") ? new Pair(x,
				y) : null;
	}

	private Pair checkLeft(int x, int y) {
		return y > 0 && !lab[x][--y].equals("#") ? new Pair(x, y) : null;
	}

	private Pair checkUp(int x, int y) {
		return x > 0 && !lab[--x][y].equals("#") ? new Pair(x, y) : null;
	}

	private Pair checkDown(int x, int y) {
		return x < lab.length - 1 && !lab[++x][y].equals("#") ? new Pair(x, y)
				: null;
	}
}
