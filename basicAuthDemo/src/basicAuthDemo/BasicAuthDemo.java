package basicAuthDemo;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BasicAuthDemo {

	public static void main(String[] args) {

		String username = "admin";
		String password = "admin";
		System.setProperty("webdriver.gecko.driver", "D:\\Selenium\\geckodriver-v0.29.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		String url = "http://" + username + ":" + password + "@the-internet.herokuapp.com/basic_auth";
		driver.get(url);
		String message = driver.findElement(By.xpath("//*[@id=\"content\"]/div/p")).getText();
		//String expected_message = "Congratulations! You must have the proper credentials.";
		System.out.println(message);

	}

}
