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
│   │           ├── JsonReader.java
│   │           └── WindowManager.java
│   └── test/
│       └── java/
│           ├── basetest/             # Base test class
│           │   └── BaseTest.java
│           └── SignIn/               # Test cases for sign-in functionality
│               └── SignInTest.java
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

Tests can be run directly from the IDE or via Maven.

- **Using Maven**:
  ```bash
  mvn test
  ```
- **Using TestNG**:
  Run `SignInTest` or any other test class from the IDE.

### Configuration

- **Test Data**: Located in the `resources/test-data/` directory. You can modify `TestData.json` to include different data sets for testing.
- **Screenshots**: Captured screenshots are stored in the `resources/screenshots/` directory.
- **Test Case Documentation**: Stored in the `resources/Test Case/` directory as an Excel file (`Hello-Again-Test-Script.xlsx`).

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

For questions or support, please contact [phemilegend@yahoo.com](mailto:your.email@example.com).
