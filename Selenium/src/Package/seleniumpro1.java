package Package;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class seleniumpro1 {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.edge.driver","C:\\Users\\vrind\\Downloads\\edgedriver_win64");
WebDriver driver=new EdgeDriver();
driver.get("https://www.google.co.in/");
	}

}
