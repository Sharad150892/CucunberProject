Feature: Login


Scenario: Successfull login with valid Credentials
Given User launch browser
And User opens URL "https://admin-demo.nopcommerce.com/login"
When User add Email "admin@yourstore.com" and password "admin"
And Login Page tile captured
And Click on the Login button
Then Home page title captured
And Click on the logout

@SL
Scenario: Successfull login with valid Credentials
Given User launch browser
And User opens URL "https://admin-demo.nopcommerce.com/login"
When User add Email and password
|admin@yourstore.com|
|admin|
And Login Page tile captured
And Click on the Login button
Then Home page title captured
And Click on the logout

