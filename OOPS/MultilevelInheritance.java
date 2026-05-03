package OOPS;

class C1{
	int a,b,c;
	void add() {
		a=10;b=20;
		c=a+b;
		System.out.println("Addition of Two Numbers is: "+c);
	}
	void sub() {
		a=20;b=10;
		c=a-b;
		System.out.println("The Subtraction of two Numbers are:"+c);
}
}
class D1 extends C1{
	void mul(){
		a=20;b=2;
		c=a*b;
		System.out.println("The Multiplication of two Numbers are:"+c);
	}
	void div(){
		a=20;b=2;
		c=a/b;
		System.out.println("The Division of two Numbers are:"+c);
	}
}
class E1 extends D1{
	void remind() {
		a=10;b=3;
		c=a%b;
		System.out.println("The remainder of two numbers are : "+c);
	}
}

public class MultilevelInheritance{

	public static void main(String[] args) {
	    E1 e=new E1();
	    e.add();
	    e.sub();e.mul();e.div();e.remind();
		

	}


}
