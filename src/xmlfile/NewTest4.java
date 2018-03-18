package xmlfile;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class NewTest4 {
	/*@BeforeClass
	  public void login()
	  {
		  System.out.println("login succesful");
	  }
	@AfterClass
	public void logout()
	{
		System.out.println("logout succesful");
	}*/
	@Test (priority = 1)
	public void deleteVendor()
	{
		System.out.println("  delete vendor successfully");
	}

	@Test (priority = 2)
	public void deleteCustomer() 
	{
		System.out.println("  delete Customer successfully");
	}

	@Test (priority = 3)
	public void deletePrice()
	{
		System.out.println(" delete Customer successfully");
	}

}
