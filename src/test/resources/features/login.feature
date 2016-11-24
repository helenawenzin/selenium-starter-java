Feature:
    Log in as a <teacher> and have products
    Background:
    Given that I am logged in as a teacher
    Then I am at the product page


    Scenario: Product started
        Given that I have a product with a license that is started
        When I enter my products
        Then I can open my product
