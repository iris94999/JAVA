package banking.domain;
import java.util.*;
public class Bank
{
	List<Customer> customers;
    
    
    private static Bank bankInstance = new Bank();//私有静态变量，只要该类存在，它就存在,是Bank的一个实例
   
    public static Bank getBank()//得到这个私有静态实例
    {
    	return Bank.bankInstance;
    } 
    
	
    private Bank()//必要的构造函数??为什么变成私有的,因为要让Bank类一旦存在就调用getBank()实例化，为了实例化私有变量
	{
		customers=new ArrayList<Customer>();
	}
	
	public void addCustomer(String f,String l)
	{
		Customer aNewCustomer;//方法内部用于调用构造函数
		aNewCustomer=new Customer(f,l);//调用构造函数
		customers.add(aNewCustomer);
		
	}
	
	public int getNumOfCustomers()
	{
		return customers.size();
	}
	
	public Customer getCustomer(int index)
	{
		return customers.get(index);
	}
	
	public void sortCustomers()//排序,也可以用冒泡排序法
	{
		Collections.sort(customers);

	}
	public Iterator<Customer> getCustomers()
	{
		return customers.iterator();
	}
}

