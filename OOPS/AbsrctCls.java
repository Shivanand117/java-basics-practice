package OOPS;

abstract class Animmal{
	Animmal(){
		System.out.println("We all are talking about the Animals");
	}
	abstract public void eat();
}
class Cat extends Animmal{
	Cat(){
		super();
	}
	public void eat() {
		System.out.println("Cat is drinking milk secretely");
	}
}
class Lion extends Animmal{
	Lion(){
		super();
	}
	public void eat() {
		System.out.println("Lion is eatiing the meat of hen");
	}
}
public class AbsrctCls {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cat c=new Cat();
		Lion l=new Lion();
		c.eat();l.eat();
		
	}

}
