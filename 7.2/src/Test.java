
public class Test {

	public static void main(String[] args) {
		Fish d = new Fish();
		Cat c = new Cat("Fluffy");
		Animal a = new Fish();//上转型
		Animal e = new Spider();//上转型
		Pet p = new Cat();
		a.walk();
		e.walk();
		System.out.println("猫1的名字："+c.getName()+"  猫2的名字："+p.getName());
		
		
		d.walk();
		c.walk();
	}

}
