Feature: loginTest

  Scenario Outline: login to demo site
    Given at web page
    When submit "<username>" and "<password>"
    Then login with "<username>" and "<password>"
    
    Examples:
    |username|password|
    |root    |root    |
    |UN1111  |PW1111  |

 
