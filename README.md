# TestNG-Selenium

## Setup
* Download maven "http://maven.apache.org/download.cgi"
  Add path to System environment variable
* Download JAVA JDK "http://www.oracle.com/technetwork/java/javase/downloads/index.html"
  Add path to System environment variable
* Clone the repo
* Install dependencies `mvn compile`
* Update `*.conf.json` files inside the `src/test/resources/conf` directory with your [BrowserStack Username and Access Key] and [other capabilities]

## Running tests

- To run parallel tests, run `mvn test -P desktopTest`
  

