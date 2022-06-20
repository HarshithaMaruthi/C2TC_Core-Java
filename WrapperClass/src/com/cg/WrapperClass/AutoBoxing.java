package com.cg.WrapperClass;

public class AutoBoxing {

			public static void main(String[] args) {
				int a=20;
				Integer i=Integer.valueOf(a);//converting int into integer explicitly
				Integer j=a; //autoboxing
				System.out.println(a+" "+i+ " "+j);
			}

			

		}


