
//TestNG Todo : Sample App

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import java.net.MalformedURLException;
import java.net.URL;

  public class module-info(){
	  
     
    public void testSimple() throws Exception 
    
    {
      
              //Change it to production page
              driver.get("https://demo.midtrans.com/");
             //Let's mark done first two items in the list.
              driver.findElement(By.name("Buy Now")).click();
              driver.findElement(By.name("CHECKOUT")).click();
              driver.findElement(By.name("CONTINUE")).click();
             
    }
  }