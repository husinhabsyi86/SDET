import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;


public class Example  {

    public String baseUrl= "https://demo.midtrans.com";
    public WebDriver driver = new FirefoxDriver();

  public class module-info(){
   
    public void testSimple() throws Exception 
   
    {            
              driver.get("https://demo.midtrans.com/");
             //Let's mark done first two items in the list.
              driver.findElement(By.name("Buy Now")).click();
              driver.findElement(By.name("CHECKOUT")).click();
              driver.findElement(By.name("CONTINUE")).click();
              
              
              public void verifyHomePageTitle() {
            	  driver.get(baseUrl);
              WebElement element = driver.findElement(By.name("Name"));
              element.sendKeys("Husin");
              WebElement element = driver.findElement(By.name("Email"));
              element.sendKeys("Husinhabsyi@gmail.com");
              WebElement element = driver.findElement(By.name("PhoneNo"));
              element.sendKeys("00000000");
              
              driver.findElement(By.name("CHECKOUT")).click();
              
              System.out.println("Page title is: " + driver.getTitle());
              driver.quit();
              
              
              
              
             
    }
  }