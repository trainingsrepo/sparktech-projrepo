import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
/*Copyright to the HDFC application*/


package com.github.hdfcapp.sample.base;
public interface ApplicationHDFC(){
void start();
String toString();
Public static void main("Working on  HDFC Banking Application");

@RunWith(SpringRunner.class)
@SpringBootTest
public class SampleApplicationTests {

	@Test
	public void contextLoads() {
	}

	#feature102 code changes by Vivek in his productCatalog on Jul2022
	public class BankingSystem {
    public static void main(String[] args) {
        Bank bank = new Bank();

        // Adding a few accounts
        bank.addAccount("101", "John Doe", 1000.0);
        bank.addAccount("102", "Jane Smith", 1500.0);

        // Performing transactions
        bank.performTransaction("101", 500.0);
        bank.performTransaction("103", 200.0); // This account doesn't exist

        // Displaying account information
        bank.displayAccountInfo("101");
        bank.displayAccountInfo("102");
    }
	#end of feature102 code changes

	#feature101 code modifications by Ethan in the module paymentGateway on Jul2022
	 public void displayAccountInfo(String accountNumber) {
        if (accounts.containsKey(accountNumber)) {
            Account account = accounts.get(accountNumber);
            System.out.println("Account Number: " + account.getAccountNumber());
            System.out.println("Customer Name: " + account.getCustomerName());
            System.out.println("Balance: $" + account.getBalance());
        } else {
            System.out.println("Account not found!");
        }
    }
	#end of feature101 code


}
}