Feature: Gmail mail compose

  Scenario: 
    Given open "firefox"
    And launch site using "http://www.gmail.com"
    When do login using "rajeshwarivanam" and "advika@18"
    Then compose is displayed
   When click on compose
    	Then fields should be displayed
    	When fill fields with "<to>","<subject>,"<body>" and "<attachement>"
    Then send is enabled
    When click on send
    Then "Message sent" should be displayed
    When do logout
    Then login page should be displayed
    When close site

 