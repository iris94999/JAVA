 class Cat extends Animal implements Pet
{
	String name;
	
	public Cat(String catName)
	{
		super(4);
		this.name=catName;
	}
	
	public Cat()//û�ж�����
	{
		this(" ");
	}
	
	public String getName()
	{
		return this.name;
	}
	
	public void setName(String catName)
	{
		this.name=catName;
	}
	public void play()
	{
		
	}
	
	public void eat()
	{
		
	}
}
