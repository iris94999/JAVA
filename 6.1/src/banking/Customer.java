package banking;

public class Customer
{
	//˽�б���������ʱҪ�нӿں���get...()
	private String firstname;
	private String lastname;
	private Account account;
	
	public Customer(String f,String l)
	{
		this.firstname=f;
		this.lastname=l;
	}
	
	public String getFirstName()
	{
		return this.firstname;
	}
	
	public String getLastName()
	{
		return this.lastname;
	}
	
	public Account getAccount()
	{
		return this.account;
	}
	
	public void setAccount(Account acct)//����ֱ�Ӹ�ֵ��ֱ�ӻῪʼ����account()���캯��
	{
		this.account=acct;
	}
}