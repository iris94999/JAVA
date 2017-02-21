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
		Customer aNewCustomer;
		aNewCustomer=new Customer(f,l);//���ù��캯��
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