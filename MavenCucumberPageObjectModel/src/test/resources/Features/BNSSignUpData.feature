@BNSPOMData
Feature: BNS signup functionality
  User wants to create new account on BNS webpage

  
  Scenario Outline: Creating new account on BNS webpage
    Given User is on BNS signup webpage
    When User will enter "<FirstName>" in firstname textbox, "<LastName>" in lastname textbox, "<Email>" in email textbox,"<Password>" in password textbox,"<Phone>" in phonenumber textbox
    And User will select "<Month>" from month dropdownbox , "<Day>" from day dropdownbox, "<Year>" from year dropdownbox
    And User will select  "<Gender>" from gender radio button
    And User will click on Submit button
    Then User should get meaasge "<Message>"

    Examples: 
      | FirstName | LastName  | Email             | Password | Phone        | Month | Day | Year | Gender | Message             |
      | Ataur     | Tarafder  | ata@yahoo.com     | der45    | 347-444-2890 | Jun   |  20 | 2001 | Male   | Submitted Form Data |
      | Parveen   | Sultana   | parveen@gmail.com | par4532  | 356-453-9099 | May   |  10 | 2002 | Female | Submitted Form Data |
      | Anwar     | Hossain   | anwar@yahoo.com   | anw3456  | 769-266-5221 | Feb   |   9 | 2003 | Male   | Submitted Form Data |
      | Ataur     | Tarafder  | ata@yahoo.com     | der45    | 347-444-2890 | Jun   |  20 | 2001 | Male   | Submitted Form Data |
      | Farhana   | Zaman     | farhana@gmail.com | far4532  | 356-453-9098 | May   |  30 | 2003 | Female | Submitted Form Data |
      | Jamal     | Chowdhury | jamal@yahoo.com   | jaml456  | 769-266-5224 | Feb   |  19 | 2001 | Male   | Submitted Form Data |
