package pom.services;


import driver.DriverActions;
import pom.pages.HomePage;

public class HomeService {
    private HomePage homePage;

    public HomeService(){
        this.homePage = new HomePage();
    }

    public void login(String userName, String userPassword){
        DriverActions.insertText(this.homePage.getTxt_user_name(), userName);
        DriverActions.insertText(this.homePage.getTxt_user_password(), userPassword);
        DriverActions.click(this.homePage.getBtn_login());
    }

    public void insertUserName(String userName){
        DriverActions.insertText(this.homePage.getTxt_user_name(), userName);
    }

    public void insertUserPassword(String userPassword){
        DriverActions.insertText(this.homePage.getTxt_user_password(), userPassword);
    }

    public void goLogin(){
        DriverActions.click(this.homePage.getBtn_login());
    }
}
