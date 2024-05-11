package Package;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class T3blank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.edgedriver", "C:\\Users\\vrind\\Downloads\\edgedriver_win64\\msedge.exe");
WebDriver driver=new EdgeDriver();
driver.get("http://demo.t3-framework.org/joomla30/index.php/en/joomla-pages/sample-page-2/registration-form");
driver.findElement(By.xpath("//*[@id=\"jform_name\"]")).sendKeys("qwertyu");
driver.findElement(By.xpath("//*[@id=\"jform_username\"]")).sendKeys("uytrewq");
driver.findElement(By.xpath("//*[@id=\"jform_password1\"]")).sendKeys("zxcvbnm");
driver.findElement(By.xpath("//*[@id=\"jform_password2\"]")).sendKeys("zxcvbnm");
driver.findElement(By.xpath("//*[@id=\"jform_email1\"]")).sendKeys("asdfg@gmail.com");
driver.findElement(By.xpath("//*[@id=\"jform_email2\"]")).sendKeys("asdfg@gmail.com");
driver.findElement(By.xpath("//*[@id=\"member-registration\"]/div/div/button")).click();
	}

}
