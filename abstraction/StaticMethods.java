/*
Author Name:- Devanand Nana Farkade 
Batch :- J-56
Title :- write a program for create static .  
*/


//parent 
//static justStaticMetho
//child  extends parent


public class StaticMethods{
	public static void main(String args[]){
	Child c= new Child();
	c.justStaticMethod();
	
	}
}
class Parent{
	static void justStaticMethod(){  //here we are trying to call static method from multilevel child class
		System.out.println("we created static method here in parent class");
	}
}
class A extends Parent{
	
}

class Child extends A{
	
}