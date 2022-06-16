package com.tns.Array;

import java.util.LinkedList;

public class LinkedlistDemo {

	public static void main(String[] args) {
		LinkedList <String> name = new LinkedList<>();
		name.add("Ravi");
		name.add("Rahul");
		name.add("Charan");
		name.add("Ajay");
		name.add("Ajay");
		name.add(null);
		name.addFirst("JAY");
		name.addLast("Jay Kumar");
		System.out.println("The name in the list are:" + name);

	}

}
