package Package;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class udemy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.getProperty("webdriver.edgedriver\", \"C:\\\\Users\\\\vrind\\\\Downloads\\\\edgedriver_win64");
WebDriver driver=new EdgeDriver();
driver.get("https://www.google.com/");
driver.findElement(By.xpath("//*[@id=\"APjFqb\"]")).sendKeys("Test Automation learning");
//inputElement.sendKeys(Keys.ENTER);
driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[4]/center/input[1]")).click();
driver.findElement(By.xpath("//*[@id=\"rso\"]/div[1]/div/div/div/div[1]/div/div/span/a/div/div/div/div[2]/cite")).click();
driver.findElement(By.xpath("//*[@id=\"search-form-autocomplete--273034\"]")).sendKeys("BDD with Cucumber");
driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div/div[4]/div[2]/form/button/svg")).click();
//searchInput.sendKeys(Keys.ENTER);
//inputElement.sendKeys(Keys.ENTER);
	}

}
