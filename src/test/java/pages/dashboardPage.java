package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class dashboardPage extends base {

    String nombreBuscarTwitter ="Biden";
    public dashboardPage(WebDriver driver) {
        super(driver);
    }

    By txtSearchUser = By.cssSelector("input[placeholder*='Buscar en Twitter']");
    By btnFollowUser = By.cssSelector("div[class='css-1dbjc4n.r-1n0xq6e']");



    public void searchUser(){
        type(nombreBuscarTwitter, txtSearchUser);
        enter(txtSearchUser);
    }


}
