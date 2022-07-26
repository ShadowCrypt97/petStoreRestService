Feature: Como usuario de la Pet Store
  Quiero crear una cuenta
  Para poder navegar en la tienda

  Scenario Outline: Creacion de usuario
    When Registre una orden
      |id  |petId  |quantity     |shipDate    |status  |complete  |
      |<id>|<petId>|<quantity>   |<shipDate>  |<status>|<complete>|
    Then Valida que el codigo de status sea ok
    And Valido que la llave id "id" contenga <id>
    And Valido que la llave petId "petId" contenga <petId>
    And Valido que la llave quantity "quantity" contenga <quantity>
    And Valido que la llave shipDate "shipDate" contenga "<shipDate>"
    And Valido que la llave status "status" contenga "<status>"
    And Valido que la llave complete "complete" contenga "<complete>"

    Examples:
      |id  |petId  |quantity     |shipDate                |status  |complete  |
      | 1  |5      |10           |2022-07-21T14:50:03.273+0000|placed  |true      |