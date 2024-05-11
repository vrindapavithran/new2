package Package;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class amazon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.getProperty("webdriver.edgedriver", "C:\\Users\\vrind\\Downloads\\edgedriver_win64");
WebDriver driver=new EdgeDriver();
driver.get("https://www.amazon.com/");
	}

}
