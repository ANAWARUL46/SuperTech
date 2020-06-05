
@MBIcalculator
Feature: BMI calculate functionality
  as a user he wants to calculate BMI

  Scenario: No value in height field
    Given User is on BMI calculator webpage
    When User enter in " " in height textbox
    And User enter "170" in weight textbox
    And User click on calculate button
    Then User should see warning message "Please enter Height"

  Scenario: No value in weight field
    Given User is on BMI calculator webpage
    When User enter in "170 " in height textbox
    And User enter " " in weight textbox
    And User click on calculate button
    Then User should see warning message "Please enter Weight"

  Scenario: Category Underweight
    Given User is on BMI calculator webpage
    When User enter in "170 " in height textbox
    And User enter "50" in weight textbox
    And User click on calculate button
    Then User should see BMI "17.3" and category "Underweight"

  Scenario: Category normal
    Given User is on BMI calculator webpage
    When User enter in "170 " in height textbox
    And User enter "70" in weight textbox
    And User click on calculate button
    Then User should see BMI "24.2" and category "Normal"

  Scenario: Category obisity
    Given User is on BMI calculator webpage
    When User enter in "170 " in height textbox
    And User enter "250" in weight textbox
    And User click on calculate button
    Then User should see BMI "86.5" and category "Obesity"

  Scenario: Category Overweight
    Given User is on BMI calculator webpage
    When User enter in "170 " in height textbox
    And User enter "80" in weight textbox
    And User click on calculate button
    Then User should see BMI "27.7" and category "Overweight"
