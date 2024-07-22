/*
Author Name:- Devanand Nana Farkade 
Batch :- J-56
Title :- write a program for calculate area shapes .  
*/

package myshapes;
abstract class Shape{
 public abstract void calculateArea(int radius);

}


public class AbsCalculateArea{
	public static void main(String []args){

	Circle c=new Circle();
	c.calculateArea(6);
	
	Square s=new Square();
	s.calculateArea(5);
}
}
class Circle extends Shape{

	final float PI=3.14f;
	int radius;
		 public void calculateArea(int radius){
			 this.radius=radius;
			float result= PI*radius*radius;
			System.out.println(result);
	 }
}

 class Square extends Shape{
	int lenght;
	 public void calculateArea(int lenght){
		 this.lenght=lenght;
		 int result=lenght*lenght;
		 System.out.println(result );
	 }
}



//