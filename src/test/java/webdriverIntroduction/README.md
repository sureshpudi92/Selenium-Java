Day-21
--------
Selenium WebDriver
-----------------

What is selenium webdriver?
------
1) WebDriver is one of the component in selenium.
2) WebDriver is a java interface.
3) WebDriver is an API( Application Programming interface)--java client---webdriver(API)---Browser



WebDriver (I)-- RemoteWebDriver (C)---->ChromeDriver , FirefoxDriver, EdgeDriver etc..

Environment setup
--------------------
1) Downloading jars files and attaching them to Java project.(Manually) - Not recomended
------------
-> created new java project
-> downloaded webdriver jars(.zip) and extracted.
-> attach jars to java project.


2) Creating Maven project   ( Recomended )

-->Created a new Maven project in eclipse
--> addedd webdriver dependecy in pom.xml--> updated



Stable: 4.18.1 (February 19, 2024)


pom.xml ---> dependencies

https://mvnrepository.com/
web driver dependecy link: https://mvnrepository.com/artifact/org.seleniumhq.selenium/selenium-java


Assignment
--------------
1) Launch browser (chrome)
2) Open URL  https://demo.nopcommerce.com/
3) Validate title should be   "nopCommerce demo store"
4) close page

**Note:
Opera browser supported till selenium 4.1.0.
Above 4.1.0 , Opera do not support.













