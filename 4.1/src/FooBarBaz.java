
public class FooBarBaz {

	public static void main(String[] args) {
		int number;
		for(number=1;number<=50;number++)
		{
			System.out.print(number);
			if(number%3==0)System.out.print(" Foo");
			if(number%5==0)System.out.print(" Bar");
			if(number%7==0)System.out.print(" Baz");
			System.out.println();
		}

	}

}
