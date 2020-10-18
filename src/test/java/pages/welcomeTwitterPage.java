package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class welcomeTwitterPage extends base {


    public welcomeTwitterPage(WebDriver driver) {
        super(driver);
    }

    By menssageWelcome = By.linkText("Únete a Twitter hoy mismo.");
    By btnLogin = By.linkText("Iniciar sesión");

    public void login(){
        click(btnLogin);
    }
    public void validarCarguePagina(){
        getText(menssageWelcome);
    }

}
