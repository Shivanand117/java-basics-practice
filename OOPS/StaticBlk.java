package OOPS;

public class StaticBlk {
	static int a;
	int b;
	static {
		System.out.println("This is Static block");
	}
	{
		System.out.println("This is Non static block");
	}
	StaticBlk(){
		System.out.println("This is Constructor block");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println(a=10);
		StaticBlk s=new StaticBlk();
		s.b=20;
		System.out.println(s.b);
		System.out.println(a=10);
		
		

	}

}
