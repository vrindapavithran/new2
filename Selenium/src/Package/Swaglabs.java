package Package;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Swaglabs {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.edgedriver", "C:\\Users\\vrind\\Downloads\\edgedriver_win64\\msedgedriver.exe");
WebDriver driver=new EdgeDriver();
driver.get("https://www.saucedemo.com/v1/");
driver.findElement(By.xpath("//*[@id=\"user-name\"]")).sendKeys("standard_user");
driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("secret_sauce");
driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
driver.findElement(By.xpath("//*[@id=\"inventory_container\"]/div/div[1]/div[3]/button")).click();
driver.findElement(By.id("shopping_cart_container")).click();
driver.findElement(By.xpath("//*[@id=\"cart_contents_container\"]/div/div[1]/div[3]/div[2]/div[2]/button")).click();
driver.findElement(By.xpath("//*[@id=\"cart_contents_container\"]/div/div[2]/a[1]")).click();
driver.findElement(By.xpath("//*[@id=\"item_4_title_link\"]/div")).click();
//driver.findElement(By.xpath("//*[@id=\"inventory_container\"]/div/div[1]/div[3]/button")).click();
driver.findElement(By.xpath("//*[@id=\"inventory_item_container\"]/div/div/div/button")).click();
//driver.findElement(By.xpath("//*[@id=\"shopping_cart_container\"]/a/svg/path")).click();
driver.findElement(By.cssSelector("#shopping_cart_container > a > svg > path")).click();
Thread.sleep(2000);
//driver.findElement(By.xpath("//*[@id=\"cart_contents_container\"]/div/div[2]/a[1]")).click();
//driver.findElement(By.xpath("//*[@id=\"inventory_filter_container\"]/select")).sendKeys("Name(A to Z)");
//driver.findElement(By.xpath("//*[@id=\"inventory_filter_container\"]/select")).sendKeys("Name(Z to A)");
//driver.findElement(By.cssSelector("//*[@id=\"inventory_filter_container\"]/select")).sendKeys("Price(low to high)");
//driver.findElement(By.xpath("//*[@id=\"inventory_filter_container\"]/select")).sendKeys("Price(high to low)");
//driver.findElement(By.xpath("//*[@id=\"shopping_cart_container\"]/a/svg/path")).click();
//driver.findElement(By.xpath("//*[@id=\"shopping_cart_container\"]/a/svg")).click();
//driver.findElement(By.xpath("//*[@id=\"cart_contents_container\"]/div/div[2]/a[2]")).click();
//driver.findElement(By.xpath("//*[@id=\"inventory_container\"]/div/div[1]/div[3]/button")).click();
//driver.findElement(By.cssSelector("#shopping_cart_container > a > span")).click();
//driver.findElement(By.id("menu_button_container")).click();
//driver.findElement(By.xpath("//*[@id=\"inventory_sidebar_link\"]")).click();
driver.findElement(By.xpath("//*[@id=\"cart_contents_container\"]/div/div[2]/a[2]")).click();
Thread.sleep(2000);
driver.findElement(By.xpath("//*[@id=\"first-name\"]")).sendKeys("asdfgh");
driver.findElement(By.xpath("//*[@id=\"last-name\"]")).sendKeys("zxcvbn");
driver.findElement(By.xpath("//*[@id=\"postal-code\"]")).sendKeys("673305");
driver.findElement(By.xpath("//*[@id=\"checkout_info_container\"]/div/form/div[2]/input")).click();
Thread.sleep(3000);
driver.findElement(By.xpath("//*[@id=\"checkout_summary_container\"]/div/div[2]/div[8]/a[2]")).click();
Thread.sleep(4000);
driver.findElement(By.xpath("//*[@id=\"menu_button_container\"]/div/div[3]/div/button")).click();
driver.findElement(By.xpath("//*[@id=\"inventory_sidebar_link\"]")).click();
Thread.sleep(4000);
driver.quit();

	}

}