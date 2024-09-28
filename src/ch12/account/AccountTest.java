package ch12.account;

public class AccountTest {

	public static void main(String[] args) {
		Account account1 = new Account("Melih Emre Guler", 1);
		Account account2 = new Account("Fehmi Tahsin Demirkan", 2);
		AccountClient accountClient1 = new AccountClient(account1);
		AccountClient accountClient2 = new AccountClient(account2);
		
		accountClient1.deposit(100);
		System.out.println("********************");
		accountClient1.information();
		System.out.println("********************");
		accountClient1.withdraw(20);
		System.out.println("********************");
		accountClient2.information();
		System.out.println("********************");
		accountClient1.transfer(account2, 30);
		System.out.println("********************");
		accountClient2.information();
		System.out.println("********************");
		accountClient2.transfer(account1, 30.3);
		
		
		
	}

}
