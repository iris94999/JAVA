abstract class Animal {
	
	protected int legs;
	
	protected Animal(int legs)
	{
		this.legs=legs;
	}
	abstract public void eat();
	public void walk()
	{
		if(this.legs==4)
		{
			System.out.println("腿数："+this.legs+"四肢着地，交叉前行");
		}
		if(this.legs==8)
		{
			System.out.println("腿数："+this.legs+"八条腿爬行");
		}
		if(this.legs==0)
		{
			System.out.println("腿数"+this.legs+"没有腿，不能走");
		}
	}
	
	
}
