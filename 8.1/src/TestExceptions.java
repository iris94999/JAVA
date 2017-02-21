public class TestExceptions {
  public static void main(String[] args) {
	  for ( int i = 0; true; i++ ) 
	  {
		  try
		  {
			  System.out.println("args[" + i + "] is '" + args[i] + "'");
		  }
		  catch(ArrayIndexOutOfBoundsException e)
		  {
			  System.out.println("Exception caught: "+ e);
			  System.out.println("Quiting...");
			  System.exit(0);
			  
		  }
		  
	  }
    
  }
}
