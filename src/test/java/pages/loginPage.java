package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class loginPage extends base{

    public loginPage(WebDriver driver){
        super(driver);

    }

        By txtUserLogin = By.xpath("//body/div[@id='react-root']/div[1]/div[1]/div[2]/main[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/label[1]/div[1]/div[2]/div[1]/input[1]");
        By txyPasswordLogin = By.xpath("//body/div[@id='react-root']/div[1]/div[1]/div[2]/main[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[2]/label[1]/div[1]/div[2]/div[1]/input[1]");
        By btnLogin = By.xpath("//body/div[@id='react-root']/div[1]/div[1]/div[2]/main[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[3]/div[1]/div[1]");

        public void writeUser(){
            type("USER",txtUserLogin);
        }

        public void writePassword(){
            type("PASS",txyPasswordLogin);
        }

        public void PressbtnLogin(){
            click(btnLogin);
        }

}
