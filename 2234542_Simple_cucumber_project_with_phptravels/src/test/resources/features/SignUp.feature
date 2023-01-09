#Author: 2234542
Feature: SignUp
  
  Scenario: To signup using given data
    Given User is on homepage
    When  User clicks Account and select CustomerSignup
    And   User fills the form using valid data
    		 	 | Field 			|    Values     |
    		 	 | First Name |     Kunal     |
     		 	 | Last Name  |     Kumar     |
     		 	 | Phone			|  9876543210   |
    		 	 | Email			| kuk@gmail.com |
    		 	 | Password		|  RajKuk@123   |
    And 	User clicks Submit button
    Then  User is redirected to LoginPage
