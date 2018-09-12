import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EnglishHome {

    WebDriver driver;

    @FindBy(id = "searchInput")
    WebElement barreRecherche;

    //constructeur
    public EnglishHome(WebDriver driver)
    {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public ArticlePage recherche(String text)
    {
        barreRecherche.sendKeys(text);
        barreRecherche.sendKeys(Keys.ENTER);

        return new ArticlePage(driver);
    }
}
