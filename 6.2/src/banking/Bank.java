package banking;

public class Bank
{
	Customer[] customers;
    static int  numberOfCustomers;//��Ҫһֱ�仯
	public Bank()//��Ҫ�Ĺ��캯��
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