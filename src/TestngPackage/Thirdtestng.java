package TestngPackage;

import org.testng.annotations.Test;

public class Thirdtestng {
	@Test
	public void Thirdtestng1() {
		System.out.println("Thirdtestng1");
	}
	 @Test(groups= {"Smoke"})
	 public void Thirdtestng2() {
		 System.out.println("Thirdtestng2");
	 }
	 @Test
	 public void Thirdtestng3() {
		 System.out.println("Thirdtestng3");
	 }
    @Test
    public void Thirdtestng4() {
    	System.out.println("Thirdtestng4");
    }
    @Test (groups= {"Smoke"})
    public void different1() {
    	System.out.println("different1");
    	
    }
    @Test
    public void different2() {
    	System.out.println("different2");
    	
    }

    @Test
    public void different3() {
    	System.out.println("different3");
    }
    
}


