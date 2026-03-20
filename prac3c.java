class BankAccount 
{
    	String accountHolderName, accountNumber;   
    	double balance;
    	BankAccount(String name, String accNo, double bal) 
	{
        	accountHolderName = name;   
        	accountNumber = accNo;
        	balance = bal;
    	}

    	void displayDetails() 
	{
        	System.out.println("Account Holder Name: " + accountHolderName);
        	System.out.println("Account Number: " + accountNumber);
        	System.out.println("Account Balance: Rs." + balance+"/-");
    	}
}
class P3c 
{
    	public static void main(String[] args) 
	{
        	BankAccount acc = new BankAccount("Sumeet M. Rathod", "SMR1811", 500000);
        	acc.displayDetails();
    	}
} 