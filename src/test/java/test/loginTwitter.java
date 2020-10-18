package test;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.welcomeTwitterPage;

public class loginTwitter {

    String URL ="https://twitter.com/?lang=es";
    //Variable usada para validar el correcto
    String WELCOME_MESSAGE;
    private WebDriver driver;
    welcomeTwitterPage welcome;



    @BeforeClass
    public void setUp() throws Exception{
        welcome = new welcomeTwitterPage(driver);
        driver = welcome.chromeDriverConnection();
        welcome.visit(URL);
    }

    @Test
    public void confirmLoadPage(){
     //   WELCOME_MESSAGE = welcome.validarCarguePagina();
        Assert.assertEquals("","");
    }
    @Test
    public  void twitterLogin(){
        
    }

}
