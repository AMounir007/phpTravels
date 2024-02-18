package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestChrome {

	@Test
	
	public void name() {
			int n =0;
			while( n < 10)
			{	
				int a =n+2;
				int b =a+n;
				System.out.println("a = "+a);	

			System.out.println("a = "+a);
			System.out.println("b = "+b);
			System.out.println("n = "+n);
			n++;
			}
	}

}
