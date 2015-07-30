package com.hackbulgaria51.week7.functioncallsoop;
import java.util.HashMap;
import java.util.Map;

public class FunctionsCollection {
	private Map<String, Function> collection;

	public FunctionsCollection() {
		collection = new HashMap<>();
	}

	public void addFunction(String name, Function f) {
		collection.put(name, f);
	}

	public Function getFunction(String name) {
		return collection.get(name);
	}

	public String toString() {
		String str = "";
		for (Map.Entry<String, Function> entry : collection.entrySet()) {
			String key = entry.getKey().toString();
			;
			Function value = entry.getValue();
			str += key + " " + value.toString();
			str += "\n";
		}
		return str;
	}
}
