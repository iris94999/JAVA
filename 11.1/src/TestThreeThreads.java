
public class TestThreeThreads {
	public static void main(String[] args) {
		PrintMe printMeOne=new PrintMe();
		PrintMe printMeTwo=new PrintMe();
		PrintMe printMeThree=new PrintMe();
		
		Thread printMe1=new Thread(printMeOne,"�߳�1");
		Thread printMe2=new Thread(printMeTwo,"�߳�2");
		Thread printMe3=new Thread(printMeThree,"�߳�3");
		
		/*printMe1.setName("�߳�1");
		printMe2.setName("�߳�2");
		printMe3.setName("�߳�3");*/
		
		printMe1.start();
		printMe2.start();
		printMe3.start();
	
		
		
	
	}

}
