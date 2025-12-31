# Java Web Application - Freestyle CI/CD

A demonstration of CI/CD using Jenkins Freestyle Project with Maven and JaCoCo code coverage.

## Features
- ✅ Java Servlet-based Calculator
- ✅ Maven build automation
- ✅ JUnit unit tests
- ✅ JaCoCo code coverage reporting
- ✅ Jenkins Freestyle CI/CD
- ✅ Automated deployment to Tomcat

## Technology Stack
- **Language**: Java 11
- **Build Tool**: Maven
- **Testing**: JUnit 4
- **Coverage**: JaCoCo
- **CI/CD**: Jenkins (Freestyle Project)
- **Server**: Apache Tomcat 9
- **Cloud**: AWS EC2

## Project Structure
```
java-webapp-freestyle/
├── src/
│   ├── main/
│   │   ├── java/com/example/
│   │   │   ├── Calculator.java
│   │   │   └── CalculatorServlet.java
│   │   └── webapp/
│   │       ├── index.jsp
│   │       └── WEB-INF/web.xml
│   └── test/
│       └── java/com/example/
│           └── CalculatorTest.java
├── pom.xml
└── README.md
```

## CI/CD Pipeline
1. Code commit triggers Jenkins build
2. Maven compiles source code
3. JUnit runs unit tests
4. JaCoCo generates coverage report
5. Maven packages WAR file
6. Jenkins deploys to Tomcat server

## Code Coverage
JaCoCo enforces minimum 50% line coverage threshold.

## Author
Built as a DevOps portfolio project demonstrating Jenkins Freestyle automation.
