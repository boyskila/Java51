package com.hackbulgaria51.week8.lakes;

import java.util.ArrayList;
import java.util.List;

public class Lake<T> {
	private List<Node> lake;

	public Lake() {
		lake = new ArrayList<>();
	}

	public void fillTheLake(Node node) {
		for (int i = 1; i < node.getDepth(); i++) {
			Node water = new Node(1000);
			node.getLinks().add(water);
		}
		lake.add(node);
	}

	public int getVolume() {
		int volume = 0;
		for (Node node : lake) {
			volume += node.getData();
			for (Node innerNodes : node.getLinks()) {
				volume += innerNodes.getData();
			}
		}
		return volume;
	}
}
