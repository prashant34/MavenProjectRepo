package sampleMavenProject.sampleProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class SampleTest {
  @Test
  public void f() {
	  WebDriver driver1=new FirefoxDriver();
		driver1.get("http://www.guru99.com/");
		WebElement wb12=driver1.findElement(By.xpath("//a[text()='Learn Software Testing']"));
		wb12.click();
  }
}
