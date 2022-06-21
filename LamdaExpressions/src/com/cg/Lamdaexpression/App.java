package com.cg.Lamdaexpression;

interface Lamda{
	void display();
}

public class App {

	public static void main(String[] args) {
	
		Lamda obj = () -> { System.out.println("I'm from display method");
		System.out.println("I'm from display method");
		System.out.println("I'm from display method");
		System.out.println("I'm from display method");
		};
		obj.display();

	}

}
