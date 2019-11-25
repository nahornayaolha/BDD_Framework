
Scenario: 1. Verify header on the main page
Given I navigated to the base page via url = 'http://ahealth.zzz.com.ua/'
Then Actual header is 'КЛІНІКА "АГАПІТ"'

Scenario: 2. Check all navigation tabs onthe main page
Given I navigated to the base page via url = 'http://ahealth.zzz.com.ua/'
Then navigation panel contains 'Main page' tab
And navigation panel contains 'About Us' tab
And navigation panel contains 'Doctors' tab
And navigation panel contains 'Pricies' tab
And navigation panel contains 'Contacts' tab
And navigation panel contains 'News' tab
And navigation panel contains 'Sign In' tab

Scenario: 3. Send message
Given I navigated to the base page via url = 'http://ahealth.zzz.com.ua/'
When I navigated to the 'Contacts' page
And set 'Olha' into the name field
And set 'onahorna@kneu.ua' into the email field
And set 'Test' into the subject field
And set 'This message is created by autotest :)' into the message textarea
And I click on send button
Then message with the following text appears: 'Дякуємо за Ваше повідомлення. Воно було надіслано на опрацювання.'

Scenario: 4. Login
Given I navigated to the base page via url = 'http://ahealth.zzz.com.ua/'
When I navigated to the 'Log In' page
And set 'leomitchell41@gmail.com' into the username/email field
And set 'leomitchell41' into the password field
And I click on log in button
Then navigation panel contains 'Check In' tab