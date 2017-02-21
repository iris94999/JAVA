package banking;

public class Bank
{
	Customer[] customers;
    static int  numberOfCustomers;
	public Bank()
	{
		customers=new Customer[5];
		
	}
	
	public void addCustomer(String f,String l)
	{
		Customer newcustomer;
		newcustomer=new Customer(f,l);//调用构造函数
		Bank.numberOfCustomers++;
		customers[numberOfCustomers-1]=newcustomer;
		
		
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