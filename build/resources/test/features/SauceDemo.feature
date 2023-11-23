
  Feature: Casos de Prueba FE para Sauce Demo


    Scenario: Iniciar sesión con credenciales válidas
      Given El usuario esta en la pagina de inicio de sesion
      When El usuario ingresa el nombre de usuario "standard_user" y la contrasena "secret_sauce"
      And El usuario hace clic en el boton de inicio de sesion
      Then El usuario deberia ver la pagina de productos