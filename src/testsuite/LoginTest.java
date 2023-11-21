package testsuite;

import browserfactory.BaseTest;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

public class LoginTest extends BaseTest {
    String baseUrl = "https://opensource-demo.orangehrmlive.com/";

    @Before
    public void setUp(){
        openBrowser(baseUrl);
    }

    @Test
    public void userShouldLoginSuccessfullyWithValidCredentials() {
        //Enter Username :Admin
        driver.findElement(By.xpath("//input[@name='username' and @placeholder='Username']")).sendKeys("Admin");

        //Enter Password :admin123
        driver.findElement(By.xpath("//input[@name='password' and @placeholder='Password']")).sendKeys("admin123");

        //Click on 'Login' button
        driver.findElement(By.xpath("//button[@type='submit']")).click();

    }

}
