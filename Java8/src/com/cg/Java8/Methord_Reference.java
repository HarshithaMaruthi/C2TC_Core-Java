package com.cg.Java8;

	import java.util.Arrays;
	import java.util.List;

	public class Methord_Reference {

		public static void main(String[] args) {
			List<Integer> List = Arrays.asList(1,2,3,4,5,6);
	        List.forEach(System.out::println);
		}

	}

