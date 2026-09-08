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