 package banking.domain;

public class CheckingAccount extends Account{
	
		private  double overDraftProtection;
		public CheckingAccount(double balance)
		{
			super(balance);
		}
		
		public CheckingAccount(double balance,double protect)
		{
			super(balance);
			this.overDraftProtection=protect;
		}
		
		public void withdraw(double amt)throws OverdraftException
		{
			if(this.balance>=amt)
			{
				this.balance -= amt;
			}
			else//分析账户余额不足的时候
			{
				
				if(this.overDraftProtection< (amt-this.balance))
				{
					if(this.overDraftProtection==0.0)
					{
						double deficit=amt-this.balance;
						throw new OverdraftException("No overdraft protection",deficit);
					}
					else
					{
						double deficit=amt;
						this.balance=0.0;
						throw new OverdraftException("Insufficient funds for overdraft protection",deficit);
					}
				}
				else
				{
					this.overDraftProtection -= amt-this.balance;
					this.balance=0.0;
					
				}
			}
		}
	
}
