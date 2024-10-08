# Hello-Again-Demo-App

## Overview

The **Hello-Again-Demo-App** is a Selenium WebDriver-based framework designed for testing web applications. This framework is built using Java and TestNG, following best practices such as the Page Object Model (POM) design pattern. The framework supports cross-browser testing and is easily extendable for different test scenarios.

## Features

- **Cross-Browser Compatibility**: Supports multiple browsers like Chrome, Firefox, etc.
- **Page Object Model (POM)**: Ensures easy maintenance and reusability of test code.
- **Data-Driven Testing**: Integrates JSON data for flexible test case execution.
- **Custom Event Reporting**: Monitors WebDriver events for better insights.
- **Parallel Test Execution**: Configured with TestNG for parallel execution.
- **Screenshot Capture**: Automatically captures screenshots on test failures.

## Project Structure

```
Hello-Again-Demo-App/
│
├── .idea/                            # IntelliJ IDEA project settings
│
├── resources/
│   ├── Reporter/                     # Directory for generated reports
│   │   └── extent-report.html        # ExtentReports HTML report
│   ├── screenshots/                  # Stores screenshots captured during tests
│   │   └── testSignIn.png            # Example screenshot file
│   ├── Test Case/                    # Stores test case documentation
│   │   └── Hello-Again-Test-Script.xlsx  # Test script in Excel format
│   └── test-data/                    # Test data files
│       └── TestData.json             # JSON file for test data
│
├── src/
│   ├── main/
│   │   └── java/
│   │       ├── pages/                # Page Object classes
│   │       │   ├── HelloAgainDashboardPage.java
│   │       │   └── HomePage.java
│   │       └── utils/                # Utility classes
│   │           ├── CookieManager.java
│   │           ├── EventReporter.java
│   │           ├── ExtentManager.java
│   │           ├── ITestResult.java
│   │           ├── JsonReader.java
│   │           └── WindowManager.java
│   └── test/
│       └── java/
│           ├── basetest/             # Base test class
│           │   └── BaseTest.java
│           └── SignIn/               # Test cases for sign-in functionality
│               └── SignInTest.java
│           └── UnitTest/             # Unit tests
│               └── unitTest.xml
│
├── target/                           # Output directory for compiled code and reports
│
├── .gitignore                        # Specifies files to ignore in version control
├── pom.xml                           # Maven configuration file
└── README.md                         # Project documentation
```

## Getting Started

### Prerequisites

- **Java 8 or higher**: Ensure Java is installed.
- **Maven**: For dependency management and build automation.
- **WebDriver Binaries**: Managed automatically using WebDriverManager.

### Installation

1. Clone the repository:
   ```bash
   git clone https://github.com/oluwafemiadeoye/Hello-Again-Demo-App.git
   ```
2. Navigate to the project directory:
   ```bash
   cd Hello-Again-Demo-App
   ```
3. Install dependencies using Maven:
   ```bash
   mvn clean install
   ```

### Running Tests

Tests can be run directly from the IDE, via Maven, or directly from the terminal using TestNG.

#### **Using Maven:**
  ```bash
  mvn test
  ```

#### **Using TestNG in the IDE:**

1. **Run TestNG Suite:** You can execute tests by right-clicking on the `unitTest.xml` file located in the `src/test/java/UnitTest/` directory and selecting `Run 'unitTest.xml'`. This will run all the tests configured in that TestNG suite file.

2. **Run Individual Test Class:** You can also run individual test classes (like `SignInTest.java`) by right-clicking on the test class file and selecting `Run 'SignInTest'`.

#### **Running TestNG Tests from the Terminal:**

1. **Navigate to the Project Directory:**
   ```bash
   cd /path/to/your/project
   ```

2. **Run TestNG Suite Using Maven:**
   ```bash
   mvn test -Dsurefire.suiteXmlFiles=src/test/java/UnitTest/unitTest.xml
   ```

    - **Explanation:**
        - `mvn test`: Tells Maven to run the tests.
        - `-Dsurefire.suiteXmlFiles`: Specifies the path to the TestNG XML suite file that you want Maven to run.
        - `src/test/java/UnitTest/unitTest.xml`: The path to your TestNG suite file.

3. **Run a Specific Test Class Using TestNG:**
   ```bash
   mvn -Dtest=SignInTest test
   ```

    - **Explanation:**
        - `-Dtest=SignInTest`: This tells Maven to run only the `SignInTest` class.
        - `test`: The Maven goal to execute the tests.

### Configuration

- **Test Data**: Located in the `resources/test-data/` directory. You can modify `TestData.json` to include different data sets for testing. This file should include the email and password, and you can change the `firstName` to any name of your choice.
- **Screenshots**: Captured screenshots are stored in the `resources/screenshots/` directory.
- **Test Case Documentation**: Stored in the `resources/Test Case/` directory as an Excel file (`Hello-Again-Test-Script.xlsx`).

### Customization

- **Windows-Specific Customization**: On line 39 of HelloAgainDashboardPage.java, you may need to update the code to use Keys.CONTROL + "e" instead of the Keys.COMMAND + "a" method if running on a Windows laptop. This is necessary because the .clear() method did not effectively clear the existing text field.

### Reporting

Test results are generated in the `resources/Reporter/extent-report.html` directory. Screenshots of failures are stored in `resources/screenshots/`.

### CI/CD Integration

The project can be integrated into a CI/CD pipeline with tools like Jenkins, GitLab CI, etc. A typical Jenkins pipeline configuration might look like this:

```groovy
pipeline {
    agent any
    stages {
        stage('Checkout') {
            steps {
                git 'https://github.com/oluwafemiadeoye/Hello-Again-Demo-App.git'
            }
        }
        stage('Build') {
            steps {
                sh 'mvn clean install'
            }
        }
        stage('Test') {
            steps {
                sh 'mvn test'
            }
        }
    }
}
```

## Contributing

Feel free to fork this project and submit a pull request if you have any improvements or bug fixes.

### How to Contribute:

1. Fork the repository.
2. Create a new branch (`git checkout -b feature-branch`).
3. Make your changes and commit them (`git commit -am 'Add new feature'`).
4. Push to the branch (`git push origin feature-branch`).
5. Create a pull request.

## License

This project is licensed under the MIT License. See the [LICENSE](LICENSE) file for details.

## Contact

For questions or support, please contact [phemilegend@yahoo.com](mailto:phemilegend@yahoo.com).