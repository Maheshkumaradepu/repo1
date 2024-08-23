package com.abstarction;

interface truck {
	void sound();
}

class tipper implements truck {
	public void sound() {
		System.out.println("honking");
	}
}

public class Vehicle {
	public static void main(String[] args) {
		tipper t = new tipper();
		t.sound();
	}
}
