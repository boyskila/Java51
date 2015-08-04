package com.hackbulgaria51.week8.findthepanda;

import java.util.ArrayList;
import java.util.List;

public class Node {
	private char sign;
	private List<Node> links;
	private int position;

	public Node(char sign, int position) {
		this.setSign(sign);
		setLinks(new ArrayList<>());
		this.setPosition(position);
	}

	public String toString() {

		return getSign() + "";
	}

	public void addLinks(Node node) {
		getLinks().add(node);
	}

	public char getSign() {
		return sign;
	}

	public void setSign(char sign) {
		this.sign = sign;
	}

	public List<Node> getLinks() {
		return links;
	}

	public void setLinks(List<Node> links) {
		this.links = links;
	}

	public int getPosition() {
		return position;
	}

	public void setPosition(int position) {
		this.position = position;
	}
}
