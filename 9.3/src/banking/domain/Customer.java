package banking.domain;
import java.util.*;
public class Customer
{
	//私有变量外界访问时要有接口函数get...()
	private String firstname;
	private String lastname;
	
	List<Account> accounts;
	
	public Customer(String f,String l)//之前申请好放两个账户的位置!！不然会出错！
	{
		this.firstname=f;
		this.lastname=l;
		accounts=new ArrayList<Account>();
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
		return accounts.get(accountNum);
	}
	
	public void setAccount(Account acct)//可以直接赋值吗？直接会开始调用account()构造函数
	{
		int num=accounts.size();
		Account theSet=accounts.get(num);
		theSet=acct;
	}
	
	public void addAccount(Account newAccount)
	{
		accounts.add(newAccount);
	}
	
	public int getNumOfAccounts()
	{
		return accounts.size();
		
	}
	
	public Iterator<Account> getAccounts()
	{
		return accounts.iterator();
	}
}