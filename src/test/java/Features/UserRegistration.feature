Feature: User Registration
  I want to check that the user can register in our e-commerce website.
  
  Scenario Outline: User Registration 
  Given the user in the home page 
  When I click on Register link 
  And I entered "<firstname>","<lastname>","<email>","<password>"
  And the registration page displayed successfully 
  Then logout

  Examples:
  | firstname | lastname | email | password 
  | ahmed | mohamed | ahmeed@tst1.com | 12345678
  | ghada | mohamed | aheed@tst1.com | 12345678
  