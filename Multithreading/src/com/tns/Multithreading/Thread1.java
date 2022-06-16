package com.tns.Multithreading;

class Eclic extends Thread{
	public void run() {
		for(int i=0;i<5;i++) {
			System.out.println("Eclipse thread ID is " + Thread.currentThread().getId());
			try {
				sleep(5000);
			}
			catch(Exception e) {
				System.out.println(e);
			}
		}
	}
}
	public class Thread1 {

	public static void main(String[] args) {
		Eclic obj = new Eclic();
		obj.start();
	}
	}



