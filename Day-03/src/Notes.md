# What is Variables ?

---

: Variable is used to Store Data.

- Variables are like containers used for storing data values.

`Example :`

```java
int age = 20;
// int is Datatypes.
// age is Variable_name.
// 20 is stored value.
```

# Data Types

---

### Primitive Data types

---

:-Primitive data types are the most basic data types provided by Java to store simple values like numbers, characters, or true/false.

`Example`

| Data Type | Type       | Size           | Default Value | Example             |
| --------- | ---------- | -------------- | ------------- | ------------------- |
| `byte`    | Integer    | 8-bit = 1 byte | `0`           | `byte a = 10;`      |
| `short`   | Integer    | 16-bit         | `0`           | `short b = 100;`    |
| `int`     | Integer    | 32-bit         | `0`           | `int c = 500;`      |
| `long`    | Integer    | 64-bit         | `0L`          | `long d = 10000L;`  |
| `float`   | Decimal    | 32-bit         | `0.0f`        | `float e = 5.5f;`   |
| `double`  | Decimal    | 64-bit         | `0.0d`        | `double f = 10.99;` |
| `char`    | Character  | 16-bit         | `'\u0000'`    | `char g = 'A';`     |
| `boolean` | True/False | 1-bit\*        | `false`       | `boolean h = true;` |

### Non-primitive Data types

---

:- Non-primitive data types are data types in Java that refer to objects, not raw values. They are created using classes, arrays, or interfaces, and they store memory addresses (references) to the actual data.

| Non-Primitive Data Type | What it Stores      | Default Value | Example                      |
| ----------------------- | ------------------- | ------------- | ---------------------------- |
| `String`                | Reference to text   | `null`        | `String name = "Aniket";`    |
| `Array`                 | Reference to list   | `null`        | `int[] nums = {1, 2, 3};`    |
| `Class`                 | Reference to object | `null`        | `Student s = new Student();` |
| `Object`                | Reference to object | `null`        | `Object obj = new Object();` |
| `Interface`             | Reference to object | `null`        | `Runnable r = new Thread();` |
| `Enum`                  | Reference to object | `null`        | `Day d = Day.MONDAY;`        |

### Naming Conventions.

---

`CamelCase`

- Start with a lowercase letter.Capitalize the first letter of each subsequent word.

> Example
> : _myVariableName._

`Snake_Case`
-start with an lower letter.Separate words with underscore.

> Example : _my_variable_name_

`Kebab-case`
-All lowercase letters.Separate words with **hyphens**.

> Example : _my-variable-name_

### Java Identifier Rules

---

1. The only allowed characters for identifiers are all alphanumeric characters ([A-Z],[a-z],[0-9]),'$' (dollar sign) and '\_'(underscore).

2. can't use **keywords** or reserved words.

3. Identifiers should not start with digits([0,9]).

4. Java is no limit on the length of the identifier but it is advisable to use an optimum length of **4 - 15 letters** only.

5. Java identifiers are **case - sensitive**.

### Literals

---

- `Integer literals` : 10, 5, -8 etc ...
- `Floting-point literals` : 1.2, 0.25, -1.999, etc...
- `Boolean literals` : true, false
- `characters literals` : 'a', 'A', 'N', etc...
- `String literals` : "hi", "hello", "what's", etc...

### User input
---
```java
import java.util.Scanner;
// Here "Import" is keyword to bring in existing class or package

// java.util → it is package that contains utility classes like Scanner, ArrayList, Random, etc.

// Here Scanner is a tool that is used for user inputs.


public class UserInput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println(input);
        System.out.println("Now, please enter the first number");
        int firstNum = input.nextInt();
        System.out.println(" Now, Enter second number");
        int secondNum = input.nextInt();
        System.out.println(firstNum + secondNum);

    }
}



```

### Type conversion or casting.
---

```java
import java.util.Scanner;

public class Typecastion {
    public static void main(String[] args) {
        float myFloat = 5;
        System.out.println(myFloat); // here change int to float.

        int myInt = (int) 4.55;
        System.out.println(myInt); // here convert float to int.

        

    }
}

```
