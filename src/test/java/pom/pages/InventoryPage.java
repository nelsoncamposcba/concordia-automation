package pom.pages;

import org.openqa.selenium.By;

public class InventoryPage {

    private By btn_add_to_cart_sauce_labs_backpack = By.id("add-to-cart-sauce-labs-backpack");
    private By btn_cart = By.className("shopping_cart_link");

    private By products = By.className("inventory_item");

    public By getBtn_add_to_cart_sauce_labs_backpack() {
        return btn_add_to_cart_sauce_labs_backpack;
    }

    public By getBtn_cart() {
        return btn_cart;
    }

    public By getProducts() {
        return products;
    }
}
