## Operators

: it is a `symbol` that is used for value ( like : `+`,`-`,`*`, `/`).

### Assignment Operator

: Assigns the right- hand oprend's value to the left-hand operand.

`Example`:

```java
int a = 5;
```

```Java
public class Assignme {
    public static void main(String[] args) {
        System.out.println("Hello world !");
        int myInt = 89;
        System.out.println(myInt);
        int newInt = myInt;
        System.out.println(newInt);
        int a = 240;
        int b = 20;
        System.out.println(a + b); // 260
        System.out.println(a / b); // 12
        System.out.println(a * b); // 2400
        System.out.println(a - b); // 220
        System.out.println(a % b); // 0
    }
}
```

## Order of Operation. 


| Precedence Level | Operator(s)          | Description                       |    |            |
| ---------------- | -------------------- | --------------------------------- | -- | ---------- |
| 1 (Highest)      | `()`                 | Parentheses (brackets)            |    |            |
| 2                | `++`, `--`           | Unary operators                   |    |            |
| 3                | `*`, `/`, `%`        | Multiplication, Division, Modulus |    |            |
| 4                | `+`, `-`             | Addition, Subtraction             |    |            |
| 5                | `<`, `>`, `<=`, `>=` | Relational operators              |    |            |
| 6                | `==`, `!=`           | Equality check                    |    |            |
| 7                | `&&`                 | Logical AND                       |    |            |
| 8                | \`                   |                                   | \` | Logical OR |
| 9 (Lowest)       | `=`, `+=`, `-=` etc. | Assignment operators              |    |            |

## Java program

```java
public class Operation {
    public static void main(String[] args) {
        System.out.println(8 - 3 % 3); // 8
        System.out.println(9 / 4 / 3); // 0 
        // because this expression is move left to right.
    }
}

 ```

 