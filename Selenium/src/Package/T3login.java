package Package;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class T3login {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.edgedriver", "C:\\Users\\vrind\\Downloads\\edgedriver_win64\\msedge.exe");
WebDriver driver=new EdgeDriver();
driver.get("http://demo.t3-framework.org/joomla30/index.php/en/joomla-pages/sample-page-2/login-page");
driver.findElement(By.xpath("//*[@id=\"modlgn-username\"]")).sendKeys("uytrewq");
driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("zxcvbnm");
driver.findElement(By.xpath("//*[@id=\"login-form\"]/fieldset/div[4]/input")).click();
	}
	
}
