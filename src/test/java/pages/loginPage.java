package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class loginPage extends base{

    String USER="lorenkaya@hotmail.com";
    String PASSWORD="KayaNow86";

    public loginPage(WebDriver driver){
        super(driver);

    }

    By txtUserLogin = By.cssSelector("input[name*='session[username_or_email]']");
    By txyPasswordLogin = By.cssSelector("input[name*='session[password]']");
    By btnLogin = By.cssSelector("div[data-testid='LoginForm_Login_Button']");


        public void writeUser(){
            type(USER,txtUserLogin);
        }

        public void writePassword(){
            type(PASSWORD,txyPasswordLogin);
        }

        public void PressbtnLogin(){
            click(btnLogin);
        }

}
