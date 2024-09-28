package ch12.account;

public class AccountClient {
	private Account account;
	
	public AccountClient(Account account) {
		this.account = account;
	}
	
	void withdraw(double amount) {//para çekmek
		double lastBalance = account.getBalance();
		if(amount>lastBalance) {
			System.out.println("insufficient balance! last balance: " + lastBalance);
		}else {
			double newBalance = lastBalance - amount;
			account.setBalance(newBalance);
			System.out.println("money was taken! new balance: " + account.getBalance());
		}
		
	}
	
	void deposit(double amount) {//para yatırma
		account.setBalance(amount + account.getBalance());
		System.out.println("money deposited! new balance: " + account.getBalance());
		}
	void transfer(Account purchaserAccount, double amount) {
		double cost = amount / 100; //%1 cost
		if((account.getBalance() + cost) < amount) {
			System.out.println("transfer failed! insufficient balance! last balance: " + this.account.getBalance() + " (there is %1 cost)");
		}else {
			account.setBalance(account.getBalance() - amount - cost);
			purchaserAccount.setBalance(purchaserAccount.getBalance() + amount);
			System.out.println("transfer successful! your new balance :" + account.getBalance());
		}
	}
	void information() {
		System.out.println("account owners name: " + account.getName());
		System.out.println("account number: " + account.getAccountNumber());
		System.out.println("account balance:" + account.getBalance());
	}
	
}
