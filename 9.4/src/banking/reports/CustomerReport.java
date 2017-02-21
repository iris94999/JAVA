package banking.reports;
import java.util.*;
import banking.domain.*;
import java.text.NumberFormat;



public class CustomerReport {

  public void generateReport() {
    NumberFormat currency_format = NumberFormat.getCurrencyInstance();

    Bank         bank = Bank.getBank();/*** STEP 1: RETRIEVE BANK SINGLETON OBJECT HERE ***/

    Customer     customer;
    
    bank.sortCustomers();//打印报表前先排序！！
    
    System.out.println("\t\t\tCUSTOMERS REPORT");
    System.out.println("\t\t\t================");
    
    Iterator<Customer> it1= bank.getCustomers();
    
    while(it1.hasNext()) 
    {
      customer=it1.next();
      
      System.out.println();
      System.out.println("Customer: "
			 + customer.getLastName() + ", "
			 + customer.getFirstName());
      
      Iterator<Account> it2=customer.getAccounts();
      while(it2.hasNext()) 
      {	
    	  
    	  Account account =it2.next();
    	  String  account_type = "";

	// Determine the account type
    	  if ( account instanceof SavingsAccount ) 
    	  {
    		  account_type = "Savings Account";
    	  } 
    	  else if ( account instanceof CheckingAccount) 
    	  {
    		  account_type = "Checking Account";
    	  } 
    	  else 
    	  {
    		  account_type = "Unknown Account Type";
    	  }
    	  
	// Print the current balance of the account
    	  System.out.println("    " + account_type + ": current balance is "
			 + currency_format.format(account.getBalance()));
      }
    }
  }
}  
  
