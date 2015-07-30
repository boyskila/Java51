package com.hackbulgaria51.week7.functioncallsoop;
import java.util.Stack;

public class Composition {
	private String[] splitedComposition;
	private Stack<String> composition;

	Composition(String composition) {
		this.composition = new Stack<>();
		splitedComposition = composition.split(" . ");
		for (int i = 0; i < splitedComposition.length; i++) {
			this.composition.push(splitedComposition[i]);
		}
	}

	public String getTop() {
		return composition.pop();
	}
	public boolean isEmpty(){
		return composition.isEmpty();
	}
}
