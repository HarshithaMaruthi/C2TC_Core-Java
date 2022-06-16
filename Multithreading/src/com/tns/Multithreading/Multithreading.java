package com.tns.Multithreading;
class Eclipse extends Thread {
	public void run() {
		System.out.println("Eclipse thread ID id: " +Thread.currentThread().getId());
	}
}
class PPT extends Thread {
public void run() {
	System.out.println("PPT thread ID id: " +Thread.currentThread().getId());
	}
	
}
class NotePad extends Thread {
	public void run() {
		System.out.println("Notepad thread ID id: " +Thread.currentThread().getId());
	}
}




public class Multithreading {

	public static void main(String[] args) {
		Eclipse obj1=new Eclipse();
		obj1.start();
		PPT obj2=new PPT();
		obj2.start();
		NotePad obj3=new NotePad();
		obj3.start();
		System.out.println("Main thread ID id: " +Thread.currentThread().getId());

	}

}