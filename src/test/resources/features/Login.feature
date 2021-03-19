Feature: Login
  As a user
  Chung want to Buy some thing
  So that he need to Login

  Scenario: login with locked out user
    Given User open SwagLabs Home Page
    When He login with "locked_out_user" and "secret_sauce"
    Then He should see "Tai khoan bi khoa" message

#  Scenario: login with blank UserName
#    Given Chung open SwagLabs Home Page
#    When He login with "" and "secret_sauce"
#    Then He should see "Epic sadface: Username is required" message
#
#  Scenario: login with blank PassWord
#    Given Chung open SwagLabs Home Page
#    When He login with "standard_user" and ""
#    Then He should see "Epic sadface: Password is required" message
#
#  Scenario: login with wrong UserName
#    Given Chung open SwagLabs Home Page
#    When He login with "taikhoansai" and "secret_sauce"
#    Then He should see "Epic sadface: Username and password do not match any user in this service" message
#  Scenario: login with wrong PassWord
#    Given Chung open SwagLabs Home Page
#    When He login with "standard_user" and "passwordsai"
#    Then He should see "password khong chinh xac" message