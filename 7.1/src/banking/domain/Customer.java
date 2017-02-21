package banking.domain;

public class Customer
{
	//私有变量外界访问时要有接口函数get...()
	private String firstname;
	private String lastname;
	private Account[] accounts;
	private int numOfAccount;
	
	public Customer(String f,String l)//之前申请好放两个账户的位置!！不然会出错！
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
	
	public void setAccount(Account acct)//可以直接赋值吗？直接会开始调用account()构造函数
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