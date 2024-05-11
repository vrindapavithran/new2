package Package;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class restfulbooker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.edgedriver", "C:\\Users\\vrind\\Downloads\\edgedriver_win64");
WebDriver driver=new EdgeDriver();
driver.get("https://automationintesting.online/");
driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[4]/div/div/div[3]/button")).click();
driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[4]/div/div[2]/div[2]/div/div[1]/span[1]/button[3]")).click();
driver.findElement(By.xpath(""));



	}

}
