Feature: Buy a laptop
  As a web user
  I want to login
  To can buy a laptop

  Scenario Outline: Buy a laptop
    Given that i logged in
      | userName   | password   |
      | <userName> | <password> |
    When i buy a laptop
      | safePayUserName   | safePayPassword   |
      | <safePayUserName> | <safePayPassword> |
    Then should show the order number

    Examples:
      | userName  | password | safePayUserName | safePayPassword |
      | User1reto | 1234As#  | safeUserName-2  | 1234As#         |