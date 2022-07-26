Feature: Como usuario de la Pet Store
         Quiero crear una cuenta
         Para poder navegar en la tienda

  Scenario Outline: Creacion de usuario
    When Registre un usuario
      |id  |username  |firstname     |lastname    |email  |password  |phone  |
      |<id>|<username>|<firstname>   |<lastname>  |<email>|<password>|<phone>|
    Then Valida que el codigo de status sea ok
    And Valido que la llave "code" contenga 200
    And Valido que la llave type "type" contenga "unknown"
    And Valido que la llave message "message" contenga "<id>"
  Examples:
    |id|username|firstname|lastname|email            |password|phone     |
    | 1|shadow  |sergio   |mendez  |smendez@gmail.com|abc.123 |3123212345|
