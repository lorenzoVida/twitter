package test;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.dashboardPage;
import pages.loginPage;
import pages.welcomeTwitterPage;

public class loginTwitter {

    String URL ="https://twitter.com/?lang=es";
    //Variable usada para validar el correcto
    String WELCOME_MESSAGE;
    private WebDriver driver;
    welcomeTwitterPage welcome;
    loginPage login;
    dashboardPage dashboard;



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
    public  void loginEnterUser(){
        login = new loginPage(driver);
        login.writeUser();
    }

    @Test(dependsOnMethods = { "loginEnterUser" })
    public  void loginEnterPassword() throws InterruptedException {
        login.writePassword();
        Thread.sleep(2000);
    }

    @Test(dependsOnMethods = { "loginEnterPassword" })
    public  void loginPressEnterSession(){
        login.PressbtnLogin();
    }

    @Test(dependsOnMethods = { "loginPressEnterSession" })
    public  void buscarUsuario(){
        dashboard = new dashboardPage(driver);
        dashboard.searchUser();
    }

}
