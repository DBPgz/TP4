import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

import static org.hamcrest.core.Is.is;

public class TestWiki {

    WebDriver driver ;

    @Before
    public void setup()
    {
        driver = new ChromeDriver();
        driver.get("https://www.wikipedia.org");
        //on ouvre le navigateur en grand
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
    }

    @After
    public void teardown()
    {
        driver.quit();
    }

    @Test
    public void testEnter()
    {
        //Arrange
        String expResult = "France";
        String result ;
        HomePage homepage = new HomePage(driver);

        //Act
        result = homepage.selectHome().recherche("France").getTitleArticle();

        //Assert
        Assert.assertThat(result, is(expResult));
    }
}
