package com.cg.abstraction;

abstract class Animal
{
	abstract void eat();
}
class Herbivores extends Animal
{
	void eat()
	{
		System.out.println("I am a vegetarian");
	}
}
class  Carnivores extends Animal
{
	void eat()
	{
		System.out.println("I am non-vegetarian");
	}
}
class Omnivores extends Animal
{
	void eat()
	{
		System.out.println("I will eat both veg and nin-veg");
	}
}
public class Main{

	public static void main(String[] args) {
		{
			Animal goat = new Herbivores();
			Animal Tiger = new Carnivores();
			Animal bear = new Omnivores();
					goat.eat();
					Tiger.eat();
					bear.eat();
		}

	}

}
