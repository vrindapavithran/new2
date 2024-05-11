package Package;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Parabank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.edgedriver", "C:\\Users\\vrind\\Downloads\\edgedriver_win64");
WebDriver driver=new EdgeDriver();
driver.get("https://parabank.parasoft.com/parabank/index.htm");
driver.findElement(By.xpath("//*[@id=\"headerPanel\"]/ul[1]/li[3]/a")).click();
//driver.findElement(By.xpath("//*[@id=\"headerPanel\"]/ul[1]/li[4]/a")).click();
driver.findElement(By.xpath("//*[@id=\"headerPanel\"]/ul[1]/li[6]/a")).click();
driver.findElement(By.xpath("//*[@id=\"loginPanel\"]/p[2]/a")).click();
driver.findElement(By.xpath("//*[@id=\"customer.firstName\"]")).sendKeys("qwertyu");
driver.findElement(By.xpath("//*[@id=\"customer.lastName\"]")).sendKeys("asdffg");
driver.findElement(By.xpath("//*[@id=\"customer.address.street\"]")).sendKeys("sxdfcghjgfdcvfcvbvgc");
driver.findElement(By.xpath("//*[@id=\"customer.address.city\"]")).sendKeys("calicut");
driver.findElement(By.xpath("//*[@id=\"customer.address.state\"]")).sendKeys("kerala");
driver.findElement(By.xpath("//*[@id=\"customer.address.zipCode\"]")).sendKeys("673305");
driver.findElement(By.xpath("//*[@id=\"customer.ssn\"]")).sendKeys("465678");
driver.findElement(By.xpath("//*[@id=\"customer.username\"]")).sendKeys("asdfghjkl");
driver.findElement(By.xpath("//*[@id=\"customer.password\"]")).sendKeys("zxcvbnm");
driver.findElement(By.xpath("//*[@id=\"repeatedPassword\"]")).sendKeys("zxcvbnm");
driver.findElement(By.xpath("//*[@id=\"customerForm\"]/table/tbody/tr[13]/td[2]/input")).click();
driver.findElement(By.xpath("//*[@id=\"headerPanel\"]/ul[2]/li[1]/a")).click();
driver.findElement(By.xpath("//*[@id=\"loginPanel\"]/form/div[1]/input")).sendKeys("asdfghjkl");
driver.findElement(By.xpath("//*[@id=\"loginPanel\"]/form/div[2]/input")).sendKeys("zxcvbnm");
driver.findElement(By.xpath("//*[@id=\"loginPanel\"]/form/div[3]/input")).click();
//driver.findElement(By.xpath("//*[@id=\"loginPanel\"]/p[1]/a")).click();
//driver.findElement(By.xpath("//*[@id=\"firstName\"]")).sendKeys("qwertyu");
//driver.findElement(By.xpath("//*[@id=\"lastName\"]")).sendKeys("asdffg");
//driver.findElement(By.xpath("//*[@id=\"address.street\"]")).sendKeys("sxdfcghjgfdcvfcvbvgc");
//driver.findElement(By.xpath("//*[@id=\"address.city\"]")).sendKeys("calicut");
//driver.findElement(By.xpath("//*[@id=\"address.state\"]")).sendKeys("kerala");
//driver.findElement(By.xpath("//*[@id=\"address.zipCode\"]")).sendKeys("673305");
//driver.findElement(By.xpath("//*[@id=\"ssn\"]")).sendKeys("465678");
//driver.findElement(By.xpath("//*[@id=\"lookupForm\"]/table/tbody/tr[8]/td[2]/input")).click();
//driver.findElement(By.xpath("//*[@id=\"headerPanel\"]/ul[1]/li[6]/a")).click();
//driver.findElement(By.xpath("//*[@id=\"headerPanel\"]/ul[1]/li[4]/a")).click();
//driver.findElement(By.xpath("//*[@id=\"heading-1\"]")).click();
//driver.findElement(By.xpath("//*[@id=\"collapse-1\"]/li[1]/label")).click();
//driver.findElement(By.xpath("//*[@id=\"heading-2\"]")).click();
//driver.findElement(By.xpath("//*[@id=\"collapse-2\"]/li[1]/label")).click();
//driver.findElement(By.xpath("//*[@id=\"search-filter-form-28131\"]/ul/li[3]/input")).click();
//WebElement element=driver.findElement(By.cssSelector("#leftPanel > ul > li:nth-child(3) > a"));
//element.click();
driver.findElement(By.xpath("//*[@id=\"leftPanel\"]/ul/li[1]/a")).click();
driver.findElement(By.xpath("//*[@id=\"type\"]")).click();
driver.findElement(By.xpath("//*[@id=\"rightPanel\"]/div/div/form/div/input")).click();
driver.findElement(By.xpath("//*[@id=\"leftPanel\"]/ul/li[3]/a")).click();
driver.findElement(By.xpath("//*[@id=\"amount\"]")).sendKeys("500");
driver.findElement(By.xpath("//*[@id=\"fromAccountId\"]")).click();
driver.findElement(By.xpath("//*[@id=\"leftPanel\"]/ul/li[4]/a")).click();
driver.findElement(By.xpath("//*[@id=\"rightPanel\"]/div/div[1]/form/table/tbody/tr[1]/td[2]/input")).sendKeys("asdfg");
driver.findElement(By.xpath("//*[@id=\"rightPanel\"]/div/div[1]/form/table/tbody/tr[2]/td[2]/input")).sendKeys("zxcvbnmnbvcxz");
driver.findElement(By.xpath("//*[@id=\"rightPanel\"]/div/div[1]/form/table/tbody/tr[3]/td[2]/input")).sendKeys("calict");
driver.findElement(By.xpath("//*[@id=\"rightPanel\"]/div/div[1]/form/table/tbody/tr[4]/td[2]/input")).sendKeys("kerala");
driver.findElement(By.xpath("//*[@id=\"rightPanel\"]/div/div[1]/form/table/tbody/tr[5]/td[2]/input")).sendKeys("673305");
//driver.findElement(By.xpath("//*[@id=\"6f6e4625-5085-4708-9eff-8a05076ed9d7\"]")).sendKeys("98765432");
//driver.findElement(By.id("eaf5d0ff-f3bf-4ae6-872c-01285b08cdfd")).sendKeys("98765432");
driver.findElement(By.xpath("//*[@id=\"rightPanel\"]/div/div[1]/form/table/tbody/tr[8]/td[2]/input")).sendKeys("4567899");
driver.findElement(By.xpath("//*[@id=\"rightPanel\"]/div/div[1]/form/table/tbody/tr[9]/td[2]/input")).sendKeys("4567899");
driver.findElement(By.xpath("//*[@id=\"rightPanel\"]/div/div[1]/form/table/tbody/tr[11]/td[2]/input")).sendKeys("788");
driver.findElement(By.xpath("//*[@id=\"rightPanel\"]/div/div[1]/form/table/tbody/tr[13]/td[2]/select")).click();
driver.findElement(By.xpath("//*[@id=\"rightPanel\"]/div/div[1]/form/table/tbody/tr[14]/td[2]/input")).click();


}
}
