package banking.domain;
import java.util.*;
public class Customer
{
	//˽�б���������ʱҪ�нӿں���get...()
	private String firstname;
	private String lastname;
	
	List<Account> accounts;
	
	public Customer(String f,String l)//֮ǰ����÷������˻���λ��!����Ȼ�����
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
	
	public void setAccount(Account acct)//����ֱ�Ӹ�ֵ��ֱ�ӻῪʼ����account()���캯��
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