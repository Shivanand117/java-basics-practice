package OOPS;
 interface MyCamera{
	 void takeSnap();
	 void recordVideo();
	 private void  greeet() {
		 System.out.println("Good evening");
	 }
	 default void record4k() {
		 greeet();
		 System.out.println("Recording video in 4k video");
	 }
 }
 interface MyWifi{
	 String[] getNetwork();
	 void connectToNetwork(String network);
 }
 class MycellPhone{
	 void callNumber(int phoneNumber) {
		 System.out.println("calling...  "+ phoneNumber);
	 }
	 void pickCall() {
		 System.out.println("connecting....");
	 }
 }
 class MysmartPhone extends MycellPhone implements MyWifi,MyCamera{
	 public void takeSnap() {
		 System.out.println("taking snap..");
	 }
//	public void record4k() {
//		System.out.println("MysmartPhone recording in 4k");
//	}
	 public void recordVideo(){
		 System.out.println("Taking video");
	 }
	 public String[] getNetwork() {
		 System.out.println("Getting list of Networks..");
		 String[] networklist= {"Aitm","vikrampg","pentagon"};
		 return networklist;
	 }
	 public void connectToNetwork(String network) {
		 System.out.println("Connecting to "+ network);
		 
	 }
 }

public class Defaultmtd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MysmartPhone m=new MysmartPhone();
		m.record4k();
		m.connectToNetwork("pentagon");
		m.callNumber(74569812);
		String[] ar=m.getNetwork();
		for(String item: ar) {
			System.out.println(item);
		}

	}

}
