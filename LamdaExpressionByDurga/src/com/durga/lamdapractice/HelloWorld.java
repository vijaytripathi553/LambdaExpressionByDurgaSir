package com.durga.lamdapractice;
interface Demo1
{
	public void sayHello();
}
public class HelloWorld {
	public static void main(String[] args) {
	Demo1 d=()-> System.out.println("Hello World");
	d.sayHello();
	}

}
