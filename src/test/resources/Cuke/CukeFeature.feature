Feature: GoogleTest
  I want to use this template for my feature file

  Scenario Outline: find animal images on google
    Given I want to go to www.google.com
    When We search for "<Animals>"
    Then google will return images of "<Animals>"

    Examples: 
      | Animals |
      | Cats    |
      | Tigers  |
      | Fish    |
      | Horses  |
      | Birds   |
