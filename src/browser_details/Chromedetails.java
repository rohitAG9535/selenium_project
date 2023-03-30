package browser_details;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Chromedetails {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Rohit\\eclipse-workspace\\selenium_project\\all_necessary_files\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
//		driver.get("https://www.ecoders.in");
		//anothtr way to launch browser
		driver.navigate().to("https://www.ecoders.in");
		
		//to get title of the page
		String titleofpage = driver.getTitle();
	    System.out.println(titleofpage);
	    
	    //to get the url of the page
	    String url = driver.getCurrentUrl();
	    System.out.println(url);
	    
	    //to get page source
	    String source = driver.getPageSource();
	    System.out.println(source);
	    
		
		Thread.sleep(5000);
		driver.quit();

	}

}
