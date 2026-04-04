
# 🔐 SafeLog - Password Validator (Core Java)

A simple yet powerful **password strength checker** built using Core Java.
This project simulates a real-world **cybersecurity policy validator** used in employee portals.

---

## 🚀 Features

* ✅ Enforces strong password rules
* 🔁 Retry system until valid password is entered
* 📢 Clear feedback for each failure
* 🔍 Uses loops & character validation (no shortcuts)

---

## 🧠 Problem Statement

A cybersecurity firm requires a system that ensures employees create **strong passwords**.

The password must satisfy the following rules:

* Minimum **8 characters**
* At least **one uppercase letter**
* At least **one digit (0-9)**

Instead of simply rejecting weak passwords, the system should:

* Identify missing conditions
* Provide **specific feedback**
* Allow retry until a valid password is entered

---

## 🛠️ Tech Stack

* Java (Core Java)
* Scanner (User Input)
* Loops & Conditionals

---

## 📂 Project Structure

```
SafeLog-Password-Validator/
│
├── PasswordValidator.java
└── README.md
```

---

## ▶️ How to Run

1. Compile the program:

```
javac PasswordValidator.java
```

2. Run the program:

```
java PasswordValidator
```

---

## 💡 Example Output

```
Enter password: hello
Too short
Missing uppercase letter
Missing digit

Enter password: Hello123
Password is strong 
```

---

## 🎯 Learning Outcomes

* String handling in Java
* Looping (for + while)
* Character validation
* Writing user-friendly programs

---

## 📌 Author

**Jakku Harshavardhan**
[Portfolio](https://harshavardhanjakku.github.io/MyPortfolio/)

---

## 💻 Complete Java Code (clean + correct)

```java
import java.util.*;

class PasswordValidator {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        boolean isValid = false;

        while (!isValid) {
            boolean length_flag = false;
            boolean uppercase_flag = false;
            boolean digit_flag = false;

            System.out.print("Enter the password: ");
            String password = sc.nextLine();
 
            if (password.length() >= 8) {
                length_flag = true;
            }
 
            for (int i = 0; i < password.length(); i++) {
                char ch = password.charAt(i);

                if (Character.isUpperCase(ch)) {
                    uppercase_flag = true;
                }

                if (Character.isDigit(ch)) {
                    digit_flag = true;
                }
            }
 
            if (!length_flag) {
                System.out.println("Too short");
            }

            if (!uppercase_flag) {
                System.out.println("Missing uppercase letter");
            }

            if (!digit_flag) {
                System.out.println("Missing digit");
            }
 
            if (length_flag && uppercase_flag && digit_flag) {
                System.out.println("Password is strong ");
                isValid = true;
            } else {
                System.out.println("Try again...\n");
            }
        }

        sc.close();
    }
}
```
