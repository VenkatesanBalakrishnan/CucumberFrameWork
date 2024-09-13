package SeleniumJava;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class UploadFileRobotClassDemo {
	
	public static void main(String[] args) throws AWTException, InterruptedException {
		
		WebDriverManager.edgedriver().setup();
		
		WebDriver driver = new EdgeDriver();
		driver.get("https://resume.naukri.com/resume-quality-score");
		
		driver.manage().window().maximize();
		
		Robot robot = new Robot();
		
		StringSelection Filepath = new StringSelection("C:\\Users\\612387094\\OneDrive - BT Plc\\Desktop\\Test Document.docx");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(Filepath, Filepath);
		
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		Thread.sleep(2000);
		
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_V);
		Thread.sleep(2000);
		
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		
		System.out.println("End of the upload");
	}

}
