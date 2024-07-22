/*
Author Name:- Devanand Nana Farkade 
Batch :- J-56
Title :- write a program for abstraction .  
*/

public class AbsractionEx{
	
public static void main(String args[]){
	B b= new B();
		b.absMethod1();
		b.absMethod2();
		
		//Abs a=new Abs("Devaa"); we cant create object of abstract class 
	}
}


 abstract class Abs{

	 String name;  //abstract veriable not allowed here 
	
	public abstract void absMethod1();
	public abstract void absMethod2();
	Abs(String name){
		this.name=name;
		System.out .println("the name is = "+name);
		System.out .println(name);
		
	}
	
}

abstract class A extends Abs{
	public void absMethod1(){
		System.out.println("Implimentation for abstract method  1");
		}
	A(){
		super("Abhi");
	}
	
	
}
class B extends A{
		public void absMethod2(){
					System.out.println("Implimentation for abstract method 2 ");	
		}
		
}