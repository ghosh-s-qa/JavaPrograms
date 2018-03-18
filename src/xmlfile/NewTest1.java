package xmlfile;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class NewTest1 {
  @BeforeTest
 public void login()
  {
	  System.out.println("login succesful---->> 1");
  }
@AfterTest
public void logout()
{
	System.out.println("logout succesful");
}
@Test (priority = 1 )
public void addVendor()
{
	System.out.println(" added vendor successfully-------> 1");
}

@Test (priority = 2 )
public void addCustomer() 
{
	System.out.println(" added Customer successfully");
}

@Test (priority = 3 )
public void addPrice()
{
	System.out.println(" added Price successfully");
}

}
