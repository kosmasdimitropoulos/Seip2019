
# Seip2019
A repository for saving all the assignments of the course Software engineering in practice (2019)
## First Assignment
Our first assignment is about evaluating a Java application (.jar file) which gets a text (.txt) file (in our example the grades of some students are given) as an input and produces its histogram. You can learn more about them by visiting the official wikipedia page of [histograms](https://en.wikipedia.org/wiki/Histogram).

## Getting Started
1. Fork this repository to your own profile.
2. Clone the forked repository to your own local machine by typing the commands that are shown below, using git (Make sure you are working in the directory where you want to save the project!) `git clone` and then paste the link from your forked repository.
3. Change to development branch by typing `git checkout development` in git.
4. Make sure JFreeChart is included in pom.xml file as a dependency.
5. Add (if missing) the appropriate plugin in the pom.xml file to create the fat jar file (which you want to run to see the results of your work).
6. Build your project with Maven (In Eclipse go to: --> Run as --> Maven Install).
7. Run the application. 

### Prerequisites
* Install Eclipse IDE 2018‑12 (visit [Eclipse official site](https://www.eclipse.org/downloads/))
* Install Java SE Development Kit 8 (visit [Java official site](https://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html))
* [Download](https://maven.apache.org/download.cgi) and [Install](https://maven.apache.org/install.html) Apache Maven 3.6.0 following the instructions step by step.

## Running the Application
For you to run our application, open the command line, then change your directory to where the .jar document is stored in your local machine, and type the following commands `java -jar gradeshistogram-0.0.1-SNAPSHOT-jar-with-dependencies.jar` and then the absolut path of your `.txt` file.

## Built With
* Eclipse IDE 2018‑12
* Java SE Development Kit 8
* Apache Maven 3.6.0
* [JFreeChart](https://mvnrepository.com/artifact/org.jfree/jfreechart) for generating the histogram.

## Contributing
* We are excited about having new pull requests, for evaluating our project!
* If you wish to contribute raise an issue for us to make the appropriate changes, or submit a pull request!

## Authors
* Kosmas Dimitropoulos - Initial work - Github profile(https://github.com/kosmasdimitropoulos)
