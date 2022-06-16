package com.tns.Array;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

public class LinkedListHeterogeneousDemo {

	public static void main(String[] args) {
	LinkedList list = new LinkedList();
	list.add("Raj");
	list.add(4);
	list.add("Hemanth");
	list.add(8);
	System.out.println(((LinkedList)list).offer("Jeevan"));
	System.out.println(list);

	}

}
