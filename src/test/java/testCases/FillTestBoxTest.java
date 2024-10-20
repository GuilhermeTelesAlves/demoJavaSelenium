package testCases;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.ElementsPO;
import pages.HomepagePO;

import java.time.Duration;

public class FillTestBoxTest {
    WebDriver driver;
    HomepagePO homePage;
    ElementsPO elementsPage;

    @BeforeEach
    public void setUp() {
        WebDriverManager.chromedriver().setup();  // Linha para usar o chrome do bonigarcia em vez de estar sempre a defenir o caminhodo driver.
        driver = new ChromeDriver();    // Instância do chromedriver

        // Instância da HomepagePO e tráz um param chamado driver do constructor que por sua vez é substitudo pela instância do chromedriver da linha acima
        homePage = new HomepagePO(driver);
        // Instância da ElementsPO e tráz um param chamado driver do constructor que por sua vez é substitudo pela instância do chromedriver da linha acima
        elementsPage = new ElementsPO(driver);

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://demoqa.com");
    }

    @Test
    public void fillForm() {
        homePage.clickElementsMenu();
        elementsPage.clickTextBoxMenu();
        elementsPage.userNameInput("João manel");
    }

    @AfterEach
    public void tearDown() {
        driver.quit();
    }
}
