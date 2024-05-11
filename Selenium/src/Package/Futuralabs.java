package Package;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Futuralabs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.edgedriver", "C:\\Users\\vrind\\Downloads\\edgedriver_win64");
WebDriver driver=new EdgeDriver();
//driver.get("https://www.amazon.com/");
//driver.findElement(By.xpath("//*[@id=\"post-5\"]/section[1]/div/div/div/div/div/a[1]")).click();
//driver.findElement(By.xpath("//*[@id=\"mega-menu-item-8\"]/a")).click();
//driver.findElement(By.xpath("//*[@id=\"post-5\"]/section[5]/div/div[1]/div/div[1]/div/div[4]/a")).click();
//driver.findElement(By.xpath("//*[@id=\"post-5\"]/section[5]/div/div[1]/div/div[2]/div/div[4]/a")).click();
//driver.findElement(By.xpath("//*[@id=\"post-5\"]/section[5]/div/div[1]/div/div[3]/div/div[4]/a")).click();
//driver.findElement(By.xpath("//*[@id=\"post-5\"]/section[5]/div/div[1]/div/div[4]/div/div[4]/a")).click();
//driver.findElement(By.xpath("//*[@id=\"post-5\"]/section[5]/div/div[1]/div/div[5]/div/div[4]/a")).click();
//driver.findElement(By.xpath("//*[@id=\"post-5\"]/section[5]/div/div[1]/div/div[6]/div/div[4]/a")).click();
//driver.findElement(By.xpath("//*[@id=\"post-5\"]/section[5]/div/div[1]/div/div[7]/div/div[4]/a")).click();
//driver.findElement(By.xpath("//*[@id=\"post-5\"]/section[5]/div/div[1]/div/div[8]/div/div[4]/a")).click();
//driver.findElement(By.xpath("//*[@id=\"mega-menu-item-34\"]/a")).click();
//driver.findElement(By.xpath("//*[@id=\"mega-menu-item-33\"]/a")).click();
//driver.findElement(By.xpath("//*[@id=\"mega-menu-item-212\"]/a/span")).click();
//driver.findElement(By.xpath("//*[@id=\"mega-menu-item-33\"]/a")).click();
//driver.findElement(By.xpath("//*[@id=\\\"mega-menu-item-211\\\"]/a/span")).click();
//driver.findElement(By.xpath("//*[@id=\"mega-menu-item-211\"]/a/span")).click();
driver.findElement(By.xpath("//*[@id=\"mega-menu-item-32\"]/a")).click();
driver.findElement(By.xpath("//*[@id=\"mega-menu-item-31\"]/a")).click();
driver.findElement(By.xpath("//*[@id=\"mega-menu-item-30\"]/a")).click();
driver.findElement(By.xpath("//*[@id=\"wpcf7-f19-p28-o1\"]/form/div[2]/div[1]/div/p/span/input")).sendKeys("asdfg");
driver.findElement(By.xpath("//*[@id=\"wpcf7-f19-p28-o1\"]/form/div[2]/div[2]/div/p/span/input")).sendKeys("1234567890");
driver.findElement(By.xpath("//*[@id=\"wpcf7-f19-p28-o1\"]/form/div[3]/div[1]/div/p/span/input")).sendKeys("zxcvbnm@gmail.com");
driver.findElement(By.xpath("//*[@id=\"wpcf7-f19-p28-o1\"]/form/div[3]/div[2]/div/p/span/input")).sendKeys("try");
driver.findElement(By.xpath("//*[@id=\"wpcf7-f19-p28-o1\"]/form/div[4]/div/div/p/span/textarea")).sendKeys("just for testing");
driver.findElement(By.xpath("//*[@id=\"wpcf7-f19-p28-o1\"]/form/p/input")).click();
driver.findElement(By.xpath("//*[@id=\"mega-menu-item-8\"]/a")).click();
driver.findElement(By.xpath("//*[@id=\"wpcf7-f19-p5-o1\"]/form/div[2]/div[1]/div/p/span/input")).sendKeys("asddfg");
driver.findElement(By.xpath("//*[@id=\"wpcf7-f19-p5-o1\"]/form/div[2]/div[2]/div/p/span/input")).sendKeys("1234567890");
driver.findElement(By.xpath("//*[@id=\"wpcf7-f19-p5-o1\"]/form/div[3]/div[1]/div/p/span/input")).sendKeys("sadfghj@gmail.com");
driver.findElement(By.xpath("//*[@id=\"wpcf7-f19-p5-o1\"]/form/div[3]/div[2]/div/p/span/input")).sendKeys("adsf");
driver.findElement(By.xpath("//*[@id=\"wpcf7-f19-p5-o1\"]/form/div[4]/div/div/p/span/textarea")).sendKeys("just for testing");
driver.findElement(By.xpath("//*[@id=\"wpcf7-f19-p5-o1\"]/form/p/input")).click();

	}

}

