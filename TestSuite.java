import TinyTestJ.Test;
import static TinyTestJ.Assert.*;

public class TestSuite {

	/*Initialize*/
	//Test owner
//	@Test public static void InitTest1() {
//		//define
//		Person owner = new Person("John Doe");
//		BankAccount account = new BankAccount(owner, 1000.00);
//		//test
//		assertEquals(owner.name,account.getOwner().name,0.001);
//	}
	//Test 
	@Test public static void test1() {
		//define
		Person owner = new Person("John Doe");
		BankAccount account = new BankAccount(owner, 1000.00);
		account.deposit(1200.0, 1234567);
		double result = 1000.0;
		//test
		assertEquals(result,account.getBalance(), 0.001);
	}
	
	@Test public static void test2() {
		//define
		Person owner = new Person("John Doe");
		BankAccount account = new BankAccount(owner, 1000.00,500.00);
		account.deposit(500.0, account.getSecurityNumber());
		double result = 1000.0+500.0;
		//test
		assertEquals(result,account.getBalance(), 0.001);
	}

	@Test public static void test3() {
		//define
		Person owner = new Person("John Doe");
		BankAccount account = new BankAccount(owner, 2000.00,500.00);
		account.withdraw(500.0, account.getSecurityNumber());
		double result = 1500;
		//test
		assertEquals(result,account.getBalance(), 0.001);
	}

	@Test public static void test4() {
		Person owner = new Person("John Doe");
		Person newOwn=new Person("Anna");
		BankAccount account = new BankAccount(owner, 1000.00,500.00);
		BankAccount remote=new BankAccount(newOwn,1500.00);
		account.transfer(remote,300.00,account.getSecurityNumber());
		assertEquals(700.00,account.getBalance(),0.001);
	}
	@Test public static void test5() {
		Person owner = new Person("John Doe");
		Person anotherowner=new Person("Anna");
		BankAccount account = new BankAccount(owner, 1000.00,500.00);
		BankAccount remote=new BankAccount(anotherowner,1500.00);
		account.transfer(remote,300.00,account.getSecurityNumber());
		assertEquals(1800.00,remote.getBalance(),0.001);
	}
	@Test public static void test6() {
		Person owner = new Person("John Doe");
		BankAccount account = new BankAccount(owner, 1000.00,2000.00);
		assertEquals(2000.00,account.getLimit(),0.001);
	}
	@Test public static void test7() {
		Person owner = new Person("John Doe");
		BankAccount account = new BankAccount(owner, 1000.00,2000.00);
		account.withdraw(2500.00,account.getSecurityNumber());
		assertEquals(-1500,account.getBalance(),0.001);
	}
	@Test public static void test8() {
		Person owner = new Person("John Doe");
		BankAccount account = new BankAccount(owner, 1000.00);
		System.out.println(account.getIban());
		//test
		assertEquals(22.0,account.getIban().length(),0.001);
	}
	@Test public static void test9() {
		Person owner = new Person("John Doe");
		BankAccount account = new BankAccount(owner, 1000.00);
		double result = (account.getSecurityNumber());
		assertEquals(123456,result,0.001);
	}
	@Test public static void test10() {
		Person owner = new Person("John Doe");
		BankAccount account = new BankAccount(owner, 1000.00);	    
		assertEquals(0.00,account.getLimit(),0.001);
	}
	@Test public static void test11() {
		Person owner = new Person("John Doe");
		BankAccount account = new BankAccount(owner, 1000.00,5000.00);
		assertEquals(5000.00,account.getLimit(),0.001);
	}
	@Test public static void test12() {	 
		Person owner = new Person("John Doe");
		Person holder= new Person("Abdul");
		BankAccount account = new BankAccount(owner, 1000.00,2000.00);
		BankAccount studentAccount= new BankAccount(holder,5000.00,1000.00);	    
		account.transfer(studentAccount,600.00,account.getSecurityNumber());
		account.deposit(800.00,account.getSecurityNumber());
		assertEquals(1200.00,account.getBalance(),0.001);
	}
	@Test public static void test13() {
		Person owner = new Person("John Doe");
		Person holder= new Person("Abdul");
		BankAccount account = new BankAccount(owner, 1000.00,2000.00);
		BankAccount studentAccount= new BankAccount(holder,5000.00,1000.00);	    
		account.transfer(studentAccount,600.00,account.getSecurityNumber());
		account.deposit(800.00,account.getSecurityNumber());	    
		assertEquals(5600.00,studentAccount.getBalance(),0.001);
	}
	@Test public static void test14() {
		Person owner = new Person("John Doe");
		BankAccount account = new BankAccount(owner, 2000.00);
		account.deposit(700.00,account.getSecurityNumber());
		account.withdraw(1200.00,account.getSecurityNumber());
		account.deposit(500.00,account.getSecurityNumber());
		account.deposit(2100.00,account.getSecurityNumber());
		assertEquals(4100.00,account.getBalance(),0.001);

	}
	@Test public static void test15() {
		Person owner = new Person("John Doe");
		BankAccount account = new BankAccount(owner, 2000.00);
		account.deposit(700.00,account.getSecurityNumber());
		account.withdraw(1200.00,account.getSecurityNumber());

		assertEquals(1500.00,account.getBalance(),0.001);

	}
	@Test public static void test16() {
		Person owner = new Person("Paul");
		BankAccount account = new BankAccount(owner, 2000.00);
		account.deposit(100.00,account.getSecurityNumber());
		account.withdraw(100.00,account.getSecurityNumber());

		assertEquals(2000.00,account.getBalance(),0.001);

	}

}
