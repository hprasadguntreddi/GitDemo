import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    System.setProperty("webdriver.chrome.driver", "C:\\Users\\hpras\\eclipse-workspace\\DemoTest\\Webdrivers\\chromedriver.exe");
    WebDriver driver=new ChromeDriver();
    driver.get("https://rahulshettyacademy.com/locatorspractice/");
    driver.findElement(By.cssSelector("#inputUsername")).sendKeys("hari");
    driver.findElement(By.cssSelector("input[placeholder='Password']")).sendKeys("rahulshettyacademy");
    driver.findElement(By.cssSelector("span input[value='rmbrUsername']")).click();
    driver.findElement(By.cssSelector("input[value='agreeTerms']")).click();
    driver.findElement(By.cssSelector(".submit.signInBtn")).click();
    System.out.println("Test1");
	}

}
