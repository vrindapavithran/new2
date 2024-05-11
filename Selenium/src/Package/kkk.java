package Package;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class kkk {


		public static void main(String[] args) {
			// TODO Auto-generated method stub
	System.setProperty("webdriver.edge.driver","C:\\Users\\vrind\\Downloads\\edgedriver_win64\\msedgedriver.exe");
	WebDriver driver=new EdgeDriver();
	driver.get("https://www.google.co.in/");
	driver.findElement(By.xpath("//*[@id=\"APjFqb\"]")).sendKeys("cat");
	driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[4]/center/input[1]")).click();
		}
	}


