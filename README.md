# Selenium-Project-OrangeHRM
##  What Are The Steps I Followed While Creating Selenium Framework ?

    1.  Create Maven project.
    2.  Add Maven Dependencies.
    3.  Create a package inside /src/test/java -> com.cs.tests.
    4.  Create LoginTests.
    5.  Create a driver class(Keep right thing at right places).
    6.  Thread Safety issues.
         - Try running test cases in parallel by changing testing.xml.
    7.  Properties File: (.properties file contains environment variables like URL, Username, Password, Browser.  
    8.  Static Block Usage.
         - Verify everything working fine.
    9.  Use of Page Object Model (POM). 
    10. Make use of Enum.
    11. Use DataProvider.
    12. Implement Extent Report.
    13. ExtentLogger class and failed screenshot.
    14. Now make use of Listeners.
    15. Screenshot for failed test method.
    16. Now, run FrameWork to test Extent Report is generated and failed Test Method has captured ScreenShot or not.
   
### I have written Test Cases of OrangeHRM as below - 
    1. Go to the Opensource-demo.orangehrmlive.com
     Verify the login by Valid Username and Password credentials i.e. Admin & admin123.

    2. Verify the login by Valid Username and Invalid Password i.e. Admin & admin123456.

    3. Verify the login by Valid Username and Password credentials i.e. Admin & admin123.
        - Once we Login to the Dashboard click on PIM/ Profile Image/ Logout.

    4. Verify the login by Valid Username and Password credentials i.e. Admin & admin123.  
        - Once we Login to the Dashboard click on PIM/ Add Button/ Fill Valid FirstName, MiddleName, LastName & click on Save Button/ And capture Shadow DOM Element. 
