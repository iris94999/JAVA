
public class TestThreeThreads {
	public static void main(String[] args) {
		PrintMe printMeOne=new PrintMe();
		PrintMe printMeTwo=new PrintMe();
		PrintMe printMeThree=new PrintMe();
		
		Thread printMe1=new Thread(printMeOne,"线程1");
		Thread printMe2=new Thread(printMeTwo,"线程2");
		Thread printMe3=new Thread(printMeThree,"线程3");
		
		/*printMe1.setName("线程1");
		printMe2.setName("线程2");
		printMe3.setName("线程3");*/
		
		printMe1.start();
		printMe2.start();
		printMe3.start();
	
		
		
	
	}

}
