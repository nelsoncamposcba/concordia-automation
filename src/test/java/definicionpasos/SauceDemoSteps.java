package definicionpasos;

import driver.DriverManager;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pom.services.HomeService;
import pom.services.InventoryService;

public class SauceDemoSteps {

    HomeService homeService = new HomeService();

    @Given("El usuario esta en la pagina de inicio de sesion")
    public void el_usuario_esta_en_la_pagina_de_inicio_de_sesion() {
        DriverManager.create("chrome");
        DriverManager.goSite("https://www.saucedemo.com/");
    }

    @When("El usuario ingresa el nombre de usuario {string} y la contrasena {string}")
    public void el_usuario_ingresa_el_nombre_de_usuario_y_la_contrasena(String userName, String userPassword) {
        homeService.insertUserName(userName);
        homeService.insertUserPassword(userPassword);
    }

    @When("El usuario hace clic en el boton de inicio de sesion")
    public void el_usuario_hace_clic_en_el_boton_de_inicio_de_sesion() {
        homeService.goLogin();
    }

    @Then("El usuario deberia ver la pagina de productos")
    public void el_usuario_deberia_ver_la_pagina_de_productos() {
        InventoryService inventoryService = new InventoryService();
        Assert.assertTrue(inventoryService.existsProducts(), "No se visualizan los productos");
    }
}