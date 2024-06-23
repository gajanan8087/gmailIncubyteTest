Feature: sendMail

Scenario Outline: Login to gmail and Send Mail
When User launch the browser
Given User enter the URL as "https://gmail.com/"
And User enter emailID as "<email>"
And User click on Next button
And user enter password as "<password>"
And User click on Next button
Then User click on compose option
And User enter emaiID in TO section as "pawar.gajananm@gmail.com"
And User confirm the entered emailID
And User enter the subject of mail as "Incubyte"
And User enter the mail body as "Automation QA test for Incubyte"
Then User click on send button

Examples:
|email|password|
|abc286@gmail.com | abc@123|
