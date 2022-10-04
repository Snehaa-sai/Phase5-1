package SignupAndLogin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Testing {
	private static String url = "http://localhost:4200";
	
	public static void main(String[] args) {
		WebDriver webdriver = null;
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SNEHAA\\Documents\\eclipse new workspace\\chromedriver\\chromedriver.exe");
		webdriver = new ChromeDriver();
		
		signupform(webdriver, "signup", "thoufiq", "8523456698", "thoufiq@gmail.com", "123456");
	
		System.out.println();
		System.out.println();
		System.out.println("For login");
		
		Loginform(webdriver, "login", "thoufiq@gmail.com", "123456");
		
		
	}
	
	
	private static void signupform(WebDriver webdriver, String route, String fullname, String number, String email, String password) {
		
		webdriver.get(url + "/" + route);
		
		webdriver.findElement(By.id("fullname")).sendKeys(fullname);		
		System.out.println("fullname Enter successfully");
		
		webdriver.findElement(By.id("number")).sendKeys(number);
		System.out.println("Mobile Number enter successfully");
		
		webdriver.findElement(By.id("email")).sendKeys(email);	
		System.out.println("Email enter successfully");
		
		webdriver.findElement(By.id("password")).sendKeys(password);
		System.out.println("Password enter successfully");
		
		webdriver.findElement(By.name("register")).click();
		System.out.println("Signup successfully");


	}
	
	private static void Loginform(WebDriver webdriver,String route,  String email, String password) {
		
		webdriver.get(url + "/" + route);
		
		webdriver.findElement(By.id("email")).sendKeys(email);
		System.out.println("Email field is filled");
		
		webdriver.findElement(By.id("password")).sendKeys(password);
		System.out.println("Password field is filled");
		
		webdriver.findElement(By.name("login")).click();
		System.out.println("Login successfully");

	}
}
