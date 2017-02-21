package banking.domain;

public class Customer
{
	//˽�б���������ʱҪ�нӿں���get...()
	private String firstname;
	private String lastname;
	private Account[] accounts;
	private int numOfAccount;
	
	public Customer(String f,String l)//֮ǰ����÷������˻���λ��!����Ȼ�����
	{
		this.firstname=f;
		this.lastname=l;
		accounts=new Account[2];
	}
	
	
	
	public String getFirstName()
	{
		return this.firstname;
	}
	
	public String getLastName()
	{
		return this.lastname;
	}
	
	public Account getAccount(int accountNum)
	{
		return this.accounts[accountNum];
	}
	
	public void setAccount(Account acct)//����ֱ�Ӹ�ֵ��ֱ�ӻῪʼ����account()���캯��
	{
		this.accounts[this.numOfAccount]=acct;
	}
	
	public void addAccount(Account newAccount)
	{
		accounts[this.numOfAccount]=newAccount;
		this.numOfAccount++;
	}
	
	public int getNumOfAccounts()
	{
		return this.numOfAccount;
		
	}
}