Feature: Buy a laptop
  As a web user
  I want to login
  To can buy a laptop

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