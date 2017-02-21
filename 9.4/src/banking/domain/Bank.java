package banking.domain;
import java.util.*;
public class Bank
{
	List<Customer> customers;
    
    
    private static Bank bankInstance = new Bank();//˽�о�̬������ֻҪ������ڣ����ʹ���,��Bank��һ��ʵ��
   
    public static Bank getBank()//�õ����˽�о�̬ʵ��
    {
    	return Bank.bankInstance;
    } 
    
	
    private Bank()//��Ҫ�Ĺ��캯��??Ϊʲô���˽�е�,��ΪҪ��Bank��һ�����ھ͵���getBank()ʵ������Ϊ��ʵ����˽�б���
	{
		customers=new ArrayList<Customer>();
	}
	
	public void addCustomer(String f,String l)
	{
		Customer aNewCustomer;//�����ڲ����ڵ��ù��캯��
		aNewCustomer=new Customer(f,l);//���ù��캯��
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
	
	public void sortCustomers()//����,Ҳ������ð������
	{
		Collections.sort(customers);

	}
	public Iterator<Customer> getCustomers()
	{
		return customers.iterator();
	}
}

