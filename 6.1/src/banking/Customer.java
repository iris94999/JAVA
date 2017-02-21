package banking;

public class Customer
{
	//私有变量外界访问时要有接口函数get...()
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
	
	public void setAccount(Account acct)//可以直接赋值吗？直接会开始调用account()构造函数
	{
		this.account=acct;
	}
}