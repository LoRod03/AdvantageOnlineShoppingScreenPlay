Feature: Buy a laptop
  As a web user
  I want to login
  To can buy a laptop

  @successfulPurchase
  Scenario Outline: Buy a laptop

    Given that i logged in
      | userName   | password   |
      | <userName> | <password> |

    When I do all the process required to make the purchase
      | safePayUserName   | safePayPassword   |
      | <safePayUserName> | <safePayPassword> |

    Then i validate the laptop reference
      | validateText   |
      | <validateText> |

    And I can pay for the laptop

    Examples:
      | userName  | password | safePayUserName | safePayPassword | validateText            |
      | User1reto | 1234As#  | safeUserName-2  | 1234As#         | HP CHROMEBOOK 14 G1(ES) |

  @failedPurchase
  Scenario Outline: looking for a laptop that is not in stock

    Given that i logged in
      | userName   | password   |
      | <userName> | <password> |

    When I look for a computer that is not in stock
      | laptopReference   |
      | <laptopReference> |

    Then it should show a text that describes that there is no result for the search

    Examples:
      | userName  | password | laptopReference   |
      | User1reto | 1234As#  | Apple Macbook Pro |