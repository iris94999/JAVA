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
			System.out.println("������"+this.legs+"��֫�ŵأ�����ǰ��");
		}
		if(this.legs==8)
		{
			System.out.println("������"+this.legs+"����������");
		}
		if(this.legs==0)
		{
			System.out.println("����"+this.legs+"û���ȣ�������");
		}
	}
	
	
}
