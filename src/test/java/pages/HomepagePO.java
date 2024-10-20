package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class HomepagePO {
    private WebDriver driver;

    public HomepagePO(WebDriver driver) {  // Constructor que coloca a instância do driver como parâmetro para ser usado na camada Teste
        this.driver = driver;
    }

    public void clickElementsMenu() {
        driver.findElement(By.xpath("//div[@class='category-cards']/div[1]//div[@class='card-up']")).click();
    }


}
