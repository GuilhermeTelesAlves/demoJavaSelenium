package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class ElementsPO {

    private WebDriver driver;

    public ElementsPO(WebDriver driver) {  // Constructor que coloca a instância do driver como parâmetro para ser usado na camada Teste
        this.driver = driver;
    }

    public void clickTextBoxMenu() {
        driver.findElement(By.xpath("//span[.='Text Box']")).click();
    }

    public void userNameInput(String userName) {
        driver.findElement(By.xpath("//input[@id='userName']")).sendKeys(userName);
    }

}

