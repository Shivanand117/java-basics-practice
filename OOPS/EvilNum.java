package OOPS;

public class EvilNum {
	static void  checkevil(int num) {
	    String s=" ";
	   
		//int result=0;
		while(num!=0) {
			int bin=num%2;
		//	result=result+bin;
			s=bin+s;
			num=num/2;
		}
		 int count=0;
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)=='1') {
				count++;
			}
		}
		if(count%2==0) {
			System.out.println("Evil Number");
		}else {
			System.out.println("Not Evil Number");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		checkevil(3);
	

	}

}
