Day-22
---------
id
name
linkText
partialLinkText

TagName
classname

CSS selector
XPath


<input type="text" name="search" value="" placeholder="Search" class="form-control form-control-lg">

input - tagname
type, name, value, placeholder ---> attributes/properties

name="search"
name--> attribute
search ---> value


findElement(By.name("search")) ----> WebElement

WebElement searchBox=driver.findElement(By.name("search"));


Ctrl +Shift+O  --> importing packages.


String s="welcome";
s.lenght()

"welcome".lenght();



Employee emp=new Employee();
emp.display();

new Employee().display();


<a href="http://www.xyz.com">Click</a>

booklets

By.partialLinkText("lets")


findElement(loc) Vs findElements(loc)
----------------------------

Scenario1: Locator is smatching with single web element

findElement(loc) ----> single web element ---> WebElement
findElements(loc) ---> single web element ----> List<WebElement>

Sceanrio2 : Locator is matching with multiple web elements

findElement(loc) ---> single web element --> WebElement
findElements(loc) ---> multiple web elements ---> List<WebElement>

Scenario3: Locator is not matching with any element.

findElement(loc) ----> NosuchElementException
findElements(loc)----->will not throw any exception. Returns 0


Assignment
---------------
Open application "https://www.demoblaze.com/index.html"

1) Total number of links
2) Total number of images
3) Click on Any product link using linkText /partialLinkText



