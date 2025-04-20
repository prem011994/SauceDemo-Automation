# SauceDemo – Selenium Automation Framework

This is a UI test automation framework developed for [SauceDemo](https://www.saucedemo.com/) using Java, Selenium WebDriver, and TestNG.  
It is built as part of a practical assessment for **Calidad Infotech** and follows the Page Object Model design pattern.

---

## ✅ Features

- 🧩 Page Object Model (POM) structure
- 🔐 Environment-based credentials and base URL (`.env` file)
- 📸 Automatic screenshots on test failure
- ⚡ WebDriverWait used instead of hardcoded waits
- 🎯 Parameterized item names for flexibility
- ✅ Full end-to-end test flow from login → purchase → logout

---

## 🔧 Technologies Used

- Java 17.0.11 (JDK 11+ compatible)
- Maven
- Selenium WebDriver
- TestNG
- dotenv-java (`io.github.cdimascio:dotenv-java`) – for config
- Apache Commons IO – for screenshot handling
- ChromeDriver

---

## 📁 Project Structure
SauceDemo/
├── src/
│   ├── main/
│   │   └── java/
│   │       ├── pages/         # Page classes (LoginPage, ProductPage, etc.)
│   │       └── utils/         # Config loader, WebDriver factory, screenshot util
│   └── test/
│       └── java/
│           └── tests/         # Test classes
├── screenshots/               # Saved on test failure
├── testng.xml                 # TestNG suite file
├── .env                       # Environment variables
├── pom.xml                    # Maven project file
└── README.md                  # This file

## ⚙️ Setup Instructions

**1.** Clone the repository  

```bash
git clone https://github.com/prem011994/SauceDemo-Automation.git
cd SauceDemo-Automation

2. Create `.env` file in the root directory  
BASE_URL=https://www.saucedemo.com/
APP_USERNAME=standard_user
APP_PASSWORD=secret_sauce
📝 Make sure .env is excluded from Git using .gitignore.

3. Install dependencies 
Ensure you have the following installed:

Java JDK (11+)

Maven

Google Chrome

ChromeDriver (added to system PATH)

To install dependencies:
mvn clean install

4. Run the tests
Run All Tests
mvn test

Run a Specific Test Class
mvn -Dtest=CartTest test

📸 Screenshot Handling
On test failure, a screenshot is automatically saved in the screenshots/ folder.

The filename is based on the test method and timestamp.


🔐 GitHub Repository Access
This project is hosted on a private GitHub repository.
Access has been granted to:

samay.thakkar@calidadinfotech.com

abdul.siyamwala@calidadinfotech.com

🎥 Video Recording
A complete screen recording of the automation setup, explanation, and test execution has been attached in the submission email, as per instructions.

✍️ Author
👨‍💻 Prem Shanker Singh
📧 premshanker011994@gmail.com

📄 License
This project is created exclusively for interview purposes and is not intended for commercial use.







