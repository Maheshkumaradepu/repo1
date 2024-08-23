package com.abstarction;


abstract class forest{
	public abstract void king();
}

class giraff extends forest{
	public void king() {
		System.out.println("this is King");
	}
}
public class Animal {
 public static void main(String Args[]) {
	 forest g= new giraff();
	 g.king();
 }
}
