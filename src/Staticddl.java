import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Staticddl {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\hpras\\eclipse-workspace\\DemoTest\\Webdrivers\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
        //driver.findElement(By.cssSelector("#ctl00_mainContent_DropDownListCurrency")).click();
     /*   WebElement ddl= driver.findElement(By.cssSelector("#ctl00_mainContent_DropDownListCurrency"));
        Select s= new Select(ddl);        
        s.selectByIndex(3); */
       
       driver.findElement(By.cssSelector("#ctl00_mainContent_ddl_originStation1_CTXT")).click();
        driver.findElement(By.cssSelector("#ctl00_mainContent_ddl_originStation1_CTXT")).sendKeys("VTZ"); 
        Thread.sleep(3000);
        driver.findElement(By.cssSelector("#ctl00_mainContent_ddl_destinationStation1_CTXT")).sendKeys("HYD");
        driver.findElement(By.cssSelector(".ui-state-highlight")).click();
        driver.findElement(By.cssSelector(".paxinfo")).click();
        Thread.sleep(3000);
        driver.findElement(By.cssSelector("#hrefIncAdt")).click();
        WebElement ddl= driver.findElement(By.cssSelector("#ctl00_mainContent_DropDownListCurrency"));
        Select s= new Select(ddl);        
        s.selectByIndex(3);
        driver.findElement(By.cssSelector("#ctl00_mainContent_chk_StudentDiscount")).click();
        driver.findElement(By.cssSelector("#ctl00_mainContent_btn_FindFlights")).click(); 
        System.out.println("Static ddl test1");
       
	}

}
