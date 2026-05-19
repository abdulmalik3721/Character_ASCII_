# Character_ASCII_
public class Main {     public void ascii(Character ch){         System.out.println("ASCII value of is: " + ch);         int ASCII_VALUE=(int) ch;     } }

# Character to ASCII Value in Java

## 📌 Introduction
This project demonstrates how to convert a character into its ASCII value in Java using type casting.

## 🚀 Features
- Takes character input from the user
- Converts character to ASCII value
- Demonstrates type casting in Java
- Beginner-friendly Java program

## 🛠 Technologies Used
- Java
- Scanner Class
- Type Casting

## 📂 Program Explanation
The program accepts a character from the user and converts it into its ASCII value by casting the `char` data type into an `int`.

### Conversion Used
char → int

## 💻 Source Code

```java
import java.util.Scanner;

public class ASCIIValue {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a character: ");
        char ch = sc.next().charAt(0);

        int ascii = (int) ch;

        System.out.println("ASCII value of " + ch + " is: " + ascii);

        sc.close();
    }
}
```

## ▶ Example Output

```text
Enter a character: A
ASCII value of A is: 65
```

## 📖 Concepts Used
- Java Basics
- User Input
- Type Casting
- ASCII Values

## 👨‍💻 Author
Abdul Malik

- Email: malik.kasganj@gmail.com
- LinkedIn: https://www.linkedin.com/in/abdul-malik3721/
- GitHub: https://github.com/abdulmalik3721



<img width="1536" height="1024" alt="ChatGPT Image May 20, 2026, 01_43_39 AM" src="https://github.com/user-attachments/assets/8304a447-4178-482c-97a7-9b4373db69b9" />

