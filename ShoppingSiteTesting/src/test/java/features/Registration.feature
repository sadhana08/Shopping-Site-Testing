Feature: Register the details in Demo Web Shop Website

Scenario: Create an account with positive credentials
#Given Launch the browser with the provided url
When click on the Register Tab
When enter the first name as "Narutoo"
And enter the last name as "Uzumakii"
And enter the email as "naruuzuu@gmail.com"
And enter the password as "Naru@2001"
And click Register
Then registration should be successful