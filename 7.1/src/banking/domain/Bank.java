package banking.domain;

public class Bank
{
	Customer[] customers;
    static int  numberOfCustomers;//��Ҫһֱ�仯
    
    private static Bank bankInstance = new Bank();//˽�о�̬������ֻҪ������ڣ����ʹ���,��Bank��һ��ʵ��
   
    public static Bank getBank()//�õ����˽�о�̬ʵ��
    {
    	return Bank.bankInstance;
    } 
    
	
    private Bank()//��Ҫ�Ĺ��캯��??Ϊʲô���˽�е�,��ΪҪ��Bank��һ�����ھ͵���getBank()ʵ������Ϊ��ʵ����˽�б���
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