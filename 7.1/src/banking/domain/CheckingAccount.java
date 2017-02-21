package banking.domain;

public class CheckingAccount extends Account{
	
		private double overDraftProtection;
		public CheckingAccount(double balance)
		{
			super(balance);
		}
		
		public CheckingAccount(double balance,double protect)
		{
			super(balance);
			this.overDraftProtection=protect;
		}
		
		public boolean withdraw(double amt)
		{
			if(amt<=this.balance)
			{
				this.balance-=amt;
				return true;
			}
			else
			{
				if(this.overDraftProtection >= amt-this.balance)
				{
					this.balance=0.0;
					return true;
				}
				else return false;
			}
		}
	
}
