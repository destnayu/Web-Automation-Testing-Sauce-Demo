@Purchase

Feature: Purchase
  As user want to purchase item

Scenario: User want purchase item to cart
  Given User open the web page
  When User input "standard_user" as userName and "secret_sauce" as password
  Then User sort product list by "Name (Z to A)"
  When User can select item Test.allTheThings T-Shirt Red and Sauce Labs Onesie on landing page
  Then User click icon cart on landing page
  And User remove 1 item on Your Cart page
  Then User can click checkout button on Your Cart page
  When User input "Na", "Yu" and "1234" on Checkout Information page and click continue button
  And  User get checkout information
  Then User can be click Finish button
  And User success order product and a message will appear "THANK YOU FOR YOUR ORDER" on Checkout Complete page


