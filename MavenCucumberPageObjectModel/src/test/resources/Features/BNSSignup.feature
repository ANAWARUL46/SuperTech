Feature: BNS signup form
  user wants to create new account in BNS webpage

  @BNSPOM
  Scenario: Creating account in BNS webpage
    Given User on BNS signup webpage
    When User enter "Ataur" in firstname textbox, "Tarafder" in lastname textbox, "ata@yahoo.com" in email textbox,"ggtt23" in password textbox,"347-433-2390" in phonenumber textbox
    And User select "May" from month dropdownbox , "10" from day dropdownbox, "2001" from year dropdownbox
    And User select  "Male" from gender radio button
    And User click on Submit button
    Then User should see meaasge "Submitted Form Data"

