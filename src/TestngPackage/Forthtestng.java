package TestngPackage;

import org.testng.annotations.Test;

public class Forthtestng {
	@Test
	public void forthtest1() {
		System.out.println("forthtest1");
	}
	@Test(groups= {"Smoke"})
	public void forthtest2() {
		System.out.println("forthtest2");
	}
	@Test 
	public void forthtest3() {
		System.out.println("forthtest4");
	}

}
