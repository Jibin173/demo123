package testcase;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.ferno.qa.base.TestBase;
import com.ferno.qa.page.facebook;

public class facebooktest extends TestBase {
	
	facebook fb;
	
	public facebooktest() {
		super();
	}
	@BeforeMethod
	public void setUp() throws InterruptedException{
		System.out.println("*****Initialising the precondition*********");
		initialization();
		fb=new facebook();
		
			
	}
	
	@Test
	public void fb1() {
		fb.login();
	}

}
