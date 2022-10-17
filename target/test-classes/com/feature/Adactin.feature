Feature: Checking the hotel booking functionality of an adactin application
@SmokeTest
Scenario: Login Functionality
Given user Must Launch The Url
When user Enter The Username In The Username Field
And user Enter The Password In The Password Field
Then user Click The LoginButton It Navigate To The Search Hotel

@SmokeTest
Scenario: Search Hotel Functionality
When User The Location In The Location Field
And user Select The Hotel In The Hotel Field
And user Select The RoomType In The RoomType Field 
And user Enter The CheckInDate In The CheckInDate Field
And user Enter The CheckOutDate In The CheckOutDate Field
And user Select The AdultPerRoom In The AdultPerRoom Field 
And user Select The ChildRoom In The ChildRoom Field 
Then user Click The SearchButton And It Navigate To The Select Hotel

@SmokeTest
Scenario: Select Hotel Functionality
When user Select The RadioButton In The RadioButton Field
Then user Click The ContinueButton And It Navigate To The Book Hotel

@SmokeTest
Scenario: Book Hotel Functionality
When user Enter The FirstName In The FirstName Field
And user Enter The LastName In The LastName Field
And user Enter The Adress In The Adress Field
And user Enter The CardNo In The CardNo Field
And user Select The CardType In The CardType Field
And user Select The Month In The Month Field
And user Select The Year In The Year Field
And user Select The Cvv In The Cvv Field
Then user Click The BookButton And It Navigate To The Logout 
When user Enter The Logout In The Logout Field
