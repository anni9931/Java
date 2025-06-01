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
| --------- | ---------- |----------------| ------------- | ------------------- |
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



