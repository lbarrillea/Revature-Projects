package banking.tests;


import static org.junit.Assert.assertEquals;

import java.util.Arrays;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import io.javalin.http.*;

import utilities.Enterance;

public class Unittests {
	
	
	@Test
	public void testCustomer() {
		Enterance test = new Enterance();
		String output = test.DisplayAllcustomers("55555555, Daisy Duck");
		assertEquals("55555555, Daisy Duck", output);
		
	}
//	//object under test
//	@InjectMocks
//	private static Enterance enterance;
//	
//	
//	//mocking NOT testing it
//	@Mock
//	private AccountRepository accountRepository;
//	
//	@BeforeClass
//	public static void setup() {
//		enterance = new Enterance();
//		
//		System.out.println(" The following are the tests for the Maven Banking app project.");
//	}
//	
//	//runs before every single test
//	@Before
//	public void testmessage() {
//		enterance = new Enterance();
//		System.out.println("Next test result");
//	}
//	
//	//in the interest of quality testing and avoiding false positives, set this test to false.
//	@Test
//	@Ignore
//	public void simpleTesting() {
//		System.out.println("Basic test running");
//		Assert.fail();
//	}
//	
	//test to assert that Customer information is being received
	
	
	//unit testing test smallest part of code
	//Mockito allows for more layers to return dummy data when methods 
	@Test
	public void testfindallaccounts() {
		
	}
}
		
		//want to return small list of fake data instead of real sensitive data
        
//		Mockito.when(accountRepository.findAll()).thenReturn(
//				)Arrays.asList(
//						new Account(1, "John Doe1"),
//						new Account(2, "John Doe2")
//				)
//		);
//		
//		accounts = Enterance.DisplayAllcustomers();
//        Assert.assertEquals("list should have 4 people", 4, customers.size());
//	}
//	
//	//test to assert that Account Balance is returned
//	@Test
//	public void testAccountBalance() {
//		int actualBalance = enterance.add()
//	}
//	
//	//This runs after each test
//	@After
//	public void endingteststatment() {
//		System.out.println("this concludes current test");
//	}
//	
//	
//	//ending test message stopping the suit of tests
//	@AfterClass
//	public static void endofline() {
//		System.out.println("This concludes the class testing");
//	}
//}
