


interface Device{
	public void info();
}
public class MethodAbstract{
	public static void main(String args[]){
	B a=new B();
	a.m1();
	a.info();
		
	}
}
class A{
	//public abstract void m1();
}
class B implements Device{
	public void m1(){
				System.out.println(" Non Abstract method from B ");

	}
	public void info(){
		System.out.println("information ");
	}
}
