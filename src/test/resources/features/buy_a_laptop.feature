Feature: Buy a laptop
  As a web user
  I want to login
  To can buy a laptop

  @successfulPurchase
  Scenario Outline: Buy a laptop

    Given that i logged in
      | userName   | password   |
      | <userName> | <password> |

    When i validate the laptop reference
      | safePayUserName   | safePayPassword   | validateText   |
      | <safePayUserName> | <safePayPassword> | <validateText> |

    Then i can buy the laptop

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
      | validateSearch   |
      | <validateSearch> |

    Examples:
      | userName  | password | laptopReference   | validateSearch |
      | User1reto | 1234As#  | Apple Macbook Pro | No results for |