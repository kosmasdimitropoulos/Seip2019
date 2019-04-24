
## Testing Suite
Our third assignment is about evaluating a number of Junit tests for some given .java files. The files given are:

* FileIO.java which gets as an input a path of a .txt file with integers and stores it's values into an array.
* ArrayOperations.java which has two methods, one for finding the max value in an integer array, and another one which reverses the signs of the values stored in the array.
* IntegerOperations.java which has three methods, one for reversing the sign of an integer, another one for adding two integers and a last one which finds the power of two for some given numbers.

Testing suite, is about evaluating unit tests for all of the functions of the aforementioned .java files.  

## Getting Started
1. Fork this repository to your own profile.
2. Clone the forked repository to your own local machine by typing the commands that are shown below, using git (Make sure you are working in the directory where you want to save the project!) `git clone` and then paste the link from your forked repository.
3. Change to development branch by typing `git checkout development` in git.
4. Make sure JUnit 4.12 is included in pom.xml file as a dependency.
5. Make sure Mockito Core 2.25.1 is included in pom.xml file as a dependency.
6. Follow the instructions that are shown in the - Getting Started - module of each project.

### Prerequisites
* Install Eclipse IDE 2018‑12 (visit [Eclipse official site](https://www.eclipse.org/downloads/))
* Install Java SE Development Kit 8 (visit [Java official site](https://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html))
* [Download](https://maven.apache.org/download.cgi) and [Install](https://maven.apache.org/install.html) Apache Maven 3.6.0 following the instructions step by step.

## Running the Application
For you to run our application, open the eclipse IDE where you have imported the project and follow the steps: Run as -> Maven Install.. (The project will then be built and you will see the number of tests who where successfully completed and the ones who failed). You can either run each test independently, by just right-clicking on the preferred test and then Run as -> Junit Test..

## Built With
* Eclipse IDE 2018‑12
* Java SE Development Kit 8
* Apache Maven 3.6.0
* [JUnit 4.12](https://mvnrepository.com/artifact/junit/junit/4.12) for being able to run your test classes.
* [Mockito Core 2.25.1](https://mvnrepository.com/artifact/org.mockito/mockito-core/2.25.1) for being able to mock all the classes needed, when testing.

## Contributing
* We are excited about having new pull requests, for evaluating our project!
* If you wish to contribute raise an issue for us to make the appropriate changes, or submit a pull request!

## Authors
* Kosmas Dimitropoulos - Initial work - Github profile(https://github.com/kosmasdimitropoulos)
