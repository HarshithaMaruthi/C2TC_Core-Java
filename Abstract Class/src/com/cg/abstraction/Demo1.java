package com.cg.abstraction;

abstract class Bike{
	Bike()
	{
		System.out.println("bike is credited");
	}
	abstract void run();
	void changeGear() {
		System.out.println("gear changed");
	}
}
class Honda extends Bike{
	void run() {
		System.out.println("running safely");
	}
}
class Demo1 {

	public static void main(String[] args) {
		Honda h= new Honda();
		h.run();
		h.changeGear();

	}

}
