package banking.domain;

public class Bank
{
	Customer[] customers;
    static int  numberOfCustomers;//需要一直变化
    
    private static Bank bankInstance = new Bank();//私有静态变量，只要该类存在，它就存在,是Bank的一个实例
   
    public static Bank getBank()//得到这个私有静态实例
    {
    	return Bank.bankInstance;
    } 
    
	
    private Bank()//必要的构造函数??为什么变成私有的,因为要让Bank类一旦存在就调用getBank()实例化，为了实例化私有变量
	{
		customers=new Customer[5];
	}
	
	public void addCustomer(String f,String l)
	{
		Customer aNewCustomer;
		aNewCustomer=new Customer(f,l);//调用构造函数
		Bank.numberOfCustomers++;
		customers[numberOfCustomers-1]=aNewCustomer;
		
	}
	
	public int getNumOfCustomers()
	{
		return Bank.numberOfCustomers;
	}
	
	public Customer getCustomer(int index)
	{
		return this.customers[index];
	}
}