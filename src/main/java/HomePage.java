import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
    WebDriver driver;

    @FindBy(id = "js-link-box-en")
    WebElement labelEnglish;

    //constructeur
    public HomePage(WebDriver driver)
    {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public EnglishHome selectHome()
    {
        labelEnglish.click();
        return new EnglishHome(driver);
    }
}
