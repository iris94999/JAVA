package banking;

public class Account{
	private double balance;
	public Account(double init_balance)
	{
		this.balance=init_balance;
	}
	
	public double getBalance()
	{
		return this.balance;
	}
	
	public void deposit(double amt)
	{
		this.balance += amt;
	}
	
	public void withdraw(double amt)
	{
		this.balance -= amt;
	}
}