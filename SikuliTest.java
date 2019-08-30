import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

/*--File Upload using Sikuli--*/

public class SikuliTest 
{

	public static void main(String[] args) throws FindFailed, Exception
{
		try
		{
		       //setting the driver executable path for chrome
			   System.setProperty("webdriver.chrome.driver", "E:/Komal/myworkspace/seleniumjava/chromedriver.exe");
		       String filepath ="C:/Users/lenovo/Downloads/";
		       String inputFilePath ="C:\\Users\\lenovo\\Downloads\\";
		       
		       //creation of objects for Screen and Pattern classes.
		       Screen s = new Screen();
		       Pattern fileInputTextBox = new Pattern(filepath+"Filename.PNG");
		       Pattern openButton = new Pattern(filepath+"Openbutton1.PNG");
		       
		      WebDriver driver;
				//Open Chrome browser
		      driver = new ChromeDriver();
		      driver.get("http://demo.guru99.com/test/image_upload/index.php");
		      driver.manage().window().maximize();
		      
		      //Click on browse  button and handle windows pop up using sikuli
		     // choose file button
		      driver.findElement(By.xpath(".//*[@id='photoimg']")).click();
		      
		      //Wait method is used to handle the delay associated with opening windows pop up after clicking on the browse button.
		      s.wait(fileInputTextBox, 20);
		      
		      //Type the file path onto input file text box and click on Open button
		      s.type(fileInputTextBox, inputFilePath+"File1.txt");
		      s.click(openButton);
	 }
	catch(Exception e)
	{
			e.printStackTrace();
	}
  }

}
