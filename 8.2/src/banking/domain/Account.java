package banking.domain;//ÖØÒªÐÞ¸Ä


public class Account{
	protected double balance;
	public Account(double init_balance)
	{
		this.balance=init_balance;
	}
	
	public double getBalance()
	{
		return this.balance;
	}
	
	public boolean deposit(double amt)
	{
		double pre_balance=this.balance;
		this.balance += amt;
		
		if(this.balance==pre_balance+amt) return true;
		else return false;
	}
	
	public void withdraw (double amt) throws Exception
	{
		if(amt<=this.balance)
		{
			this.balance -= amt;
		}
		else
		{	
			double deficit=amt-this.balance;
			throw new Exception("Insufficient funds"+ deficit);
		}
	}
}

 

