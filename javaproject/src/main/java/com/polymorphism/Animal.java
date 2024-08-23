
//This is Example of Method Overriding 

package com.polymorphism;

 class Animals {
public void sound() {
	System.out.println("this is animal sound");
}
}

 class cat extends Animals{
	public void sound() {
		System.out.println("this is cat sound");
	}
}
 
 class dog extends Animals{
	public void sound() {
		System.out.println("this is dog sound");
	}
}
 
 public class Animal{
	 public static void main(String Args[]) {
		 Animals a=new Animals();
		 Animals c=new cat();
		Animals d = new dog();
		a.sound();
		c.sound();
		d.sound();
	 }
 }
