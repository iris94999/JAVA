
public class Test {

	public static void main(String[] args) {
		Fish d = new Fish();
		Cat c = new Cat("Fluffy");
		Animal a = new Fish();//��ת��
		Animal e = new Spider();//��ת��
		Pet p = new Cat();
		a.walk();
		e.walk();
		System.out.println("è1�����֣�"+c.getName()+"  è2�����֣�"+p.getName());
		
		
		d.walk();
		c.walk();
	}

}
