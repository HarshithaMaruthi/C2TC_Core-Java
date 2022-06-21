package com.cg.Lamdaexpression;
/*interface addition{
	public int add(int a,int b);
}

public class Variablee {

	public static void main(String[] args) {
		addition  d2=(int a,int b)-> (a+b); {
			System.out.println(d2.add(5, 20));
		}

	}

}*/

interface addition {
	public int add();
}
public class Variablee {
	public static void main(String[] args) {
		addition d2=()-> (5+20); {
			System.out.println(d2.add());
		}
	}
}
