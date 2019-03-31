import java.util.Random;

public class BankAccount {
	final String bic="ABCDDEFFXXX";
	String iban ="DE00123456780000000000";
	int securityNumber;
	Person owner;
	double limit;
	double balance ;

	public BankAccount (Person owner,double balance,double limit) {
		this.owner=owner;
		this.balance=balance;
		this.limit=limit;

		String temp ="";
		for (int i =0;i<6;i++) {
			temp+=new Random().nextInt(10);
		}
		this.securityNumber=Integer.parseInt(temp);

		this.iban=iban.substring(0, 12);
		for (int j =0;j<10;j++) {
			this.iban+=new Random().nextInt(10);
		}
	}
	public BankAccount (Person owner,double balance) {
		this.owner=owner;
		this.balance=balance;
		this.limit=0.0;
		String temp ="";
		for (int i =0;i<6;i++) {
			temp+=new Random().nextInt(10);
		}
		this.securityNumber=Integer.parseInt(temp);

		this.iban=iban.substring(0, 12);
		for (int j =0;j<10;j++) {
			this.iban+=new Random().nextInt(10);
		}
	}

	public double getBalance() {
		return this.balance;
	}
	public void setBalance(double newBal) {
		this.balance=newBal;
	}
	public String getIban() {
		return this.iban;
	}

	public int getSecurityNumber() {
		return securityNumber;
	}

	public Person getOwner() {
		return this.owner;
	}	
	public double getLimit() {
		return this.limit;

	}
	public double deposit (double amount , int securityNumber) {
		if(securityNumber==this.securityNumber) {
			return this.balance += amount;
		}
		else {
			return 0.0;
		}

	}
	public double  withdraw(double amount , int securityNumber) {
		if(securityNumber==this.securityNumber && amount<=this.balance + this.limit) {
			this.balance -= amount;
		}
		return balance;
	}
	public double transfer(BankAccount remoteAccount,double amount,int securityNumber) {
		if(securityNumber == this.securityNumber && amount <= this.limit + this.balance) {
			this.balance -= amount;
			remoteAccount.balance += amount;
		}
		return balance;

	}
}