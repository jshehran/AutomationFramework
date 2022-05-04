@full
Feature: Clarity Test Page Feature

  @scenario1
  Scenario: Button Click Scenario
    Given Navigate to the page: "https://testingwithclarity.com/ClarityTestPage/ClarityTestPage.html"
    When Click on the button "Button Click"
    Then Validate that the message "Click Done" is displayed for Button Click
    
  @scenario2
  Scenario: Button Double Click Scenario
    Given Navigate to the page: "https://testingwithclarity.com/ClarityTestPage/ClarityTestPage.html"
    When Double Click on the button "Button DblClick"
    Then Validate that the message "DblClick Done" is displayed for Double Button Click

  @scenario3
  Scenario: Mouse Over Scenario
    Given Navigate to the page: "https://testingwithclarity.com/ClarityTestPage/ClarityTestPage.html"
    When Move the mouse over the button "Button MouseOver"
    Then Validate that the message "MouseOver Done" is displayed for Mouse Over
    
  @scenario4
  Scenario: Overlay Scenario
    Given Navigate to the page: "https://testingwithclarity.com/ClarityTestPage/ClarityTestPage.html?withOverlay"
    When Insert "Test text" value in the Input1 text field
    And click on the button "Propagate"
    Then Validate that all other input fields contain the "Test text" inserted initially
    When Click on the button "Clear All"
    And Validate that all the four input fields are empty
