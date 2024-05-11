package Package;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Steallogin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.edgedriver", "C:\\Users\\vrind\\Downloads\\edgedriver_win64\\msedgedriver.exe");
WebDriver driver=new EdgeDriver();
driver.get("https://www.stealmylogin.com/demo.html");
driver.findElement(By.xpath("/html/body/form/input[1]")).sendKeys("qwe");
driver.findElement(By.xpath("/html/body/form/input[2]")).sendKeys("asd");
driver.findElement(By.xpath("/html/body/form/input[3]")).click();
	}
}
