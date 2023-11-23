# new feature
# Tags: optional

Feature:Online order from Domino's pizza

  Scenario: Ordering pizza'a and beverages from Dominos's Website
    Given User go to domino's website
    When User,First enter the address and pincode
    And User select veg pizza's(Caprese Gourmet pizza, margarita pizza, peppy panner) each 2 quantity
    And User select Beverages pepesi (12 Quantity)
    And User remove products from cart, 1 margarita pizza and 6 pepsi's
    Then User get subtotal value and check out from the website(place order price details)

