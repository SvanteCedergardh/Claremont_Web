#Documentation for testing Claremont website

##13/02/2019
* Added README-fil, .gitignore, Junit-and Selenium dependencies
* Set up "Before" and "After" methods
* Added ChromeDriver
* Added test case to verifying page
* Added test cases for search with-and without input
---
* Bug1: When you search without entering anything in the input field, a new blank page opens with the text: "500 oops! Ett tekniskt fel har uppstått!". Looks broken
---

##14/02/2019
* Removed class "SocialMediaLinks"
* Added test cases to check all links in footer
---
* Bug2: When the window is downscaled in the chrome web browser, elements such as text, pictures and buttons overlap each other. Seems like the website is not responsive
---

##15/02/2019
* Added test cases to check all links in top menu ("Hamburger menu")
* Renamed all "verifyPage"-methods to "getPageTitle" and "getPageUrl"
---

