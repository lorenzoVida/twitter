package test;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.loginPage;
import pages.welcomeTwitterPage;

public class loginTwitter {

    String URL ="https://twitter.com/?lang=es";
    //Variable usada para validar el correcto
    String WELCOME_MESSAGE;
    private WebDriver driver;
    welcomeTwitterPage welcome;
    loginPage login;



    @BeforeClass
    public void setUp() throws Exception{
        welcome = new welcomeTwitterPage(driver);
        driver = welcome.chromeDriverConnection();
        welcome.visit(URL);
    }

    @Test
    public void confirmLoadPage() throws InterruptedException {
        //Validamos
     //   WELCOME_MESSAGE = welcome.validarCarguePagina();
        //Assert.assertEquals("","");
        welcome.Press_btnLogin();
        Thread.sleep(2000);
    }

    @Test(dependsOnMethods = { "confirmLoadPage" })
    public  void twitterLogin(){
        login = new loginPage(driver);
        login.writeUser();
    }

}
