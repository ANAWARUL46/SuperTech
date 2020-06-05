Feature: BNS signup functionality by data table
  User wants to create new account on BNS webpage by data table

  @BNSPOMDataTable
  Scenario: Creating new account on BNS webpage
    Given User is on BNS signup Webpage
    When User will Enter following data
      | FirstName | LastName | Email         | Password | Phone        |
      | Ataur     | Tarafder | ata@yahoo.com | der45    | 347-444-2890 |
    And User will Select below
      | Month | May  |
      | Day   |   10 |
      | Year  | 2002 |
    And User will Select  below
      | Gender |
      | Male   |
    And User will click on Submit Button
    Then User should get Meaasge below
      | Message             |
      | Submitted Form Data |
