package pom.services;


import driver.DriverActions;
import pom.pages.CartPage;

public class CartService {
    private CartPage cartPage;

    public CartService() {
        this.cartPage = new CartPage();
    }

    public void goCheckout(){
        DriverActions.click(this.cartPage.getBtn_checkout());
    }
}
