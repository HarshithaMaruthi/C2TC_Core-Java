package com.cg.Lamdaexpression;

/*interface Lamda{
	public void display();
}*/

public class ThreadExample {

	public static void main(String[] args) {
		new Thread(() -> {System.out.println("This is one thread ");}).start();
		
		
	}

}
/*Thread t = new Thread(new Runnable() {
			public void run() {
				System.out.println("This is thread one");
			}
	});
	t.start();*/
