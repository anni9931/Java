# Install Intellij IDEA

---

### Install JDK

---

### First Class using test editor.

---

```java
import java.lang.*;
public class Hello{
    public static void main(String[] args){
        System.out.print("Hello coders !");
    }
}
```

### Anatomy of a Class

--- 

`public` :- everyone can access it.  
`class` :- Everyone under the class in java.  
`MyFirstApp` :- the name of the class.  
`public` :- public so every can access it.  
`static` :- we will cover this one later.  
`void` :- the return type void means there's no return value.  
`main` :- the name of this method.  
`(String[] args)` :- arguments to the method. This method.  
`{` :- opening brace of the method.  
`System.out.print` :- this says print to standard output.  
`("I Rule!)` :- the String you want to print.   
`;` :- Every statement MUST end in  a semicolon !!.  
`}` :- Closing braces .


### Compile and Run.

---

> Program.java -> JAVA Compiler -> Programming.class -> JVM -> Program.


>.java source file -> javac -> bytecode.class file -> java-> output.

### File Exetentions

---
 
`.Java`   

- contains Java Source Code.
- High Level Human Readable.
- Used for Development.
- File is editable.

`.Class`

- Contains Java Bytecode.
- For consumption of JVM.
- Used for Execution.
- Not meant to be edited.

### JDK vs JVM vs JRE

---

`.JDK`

: it's a (java development kit) is a software pacage used to java developers to write,compile and run java programs.

- it is contains JRE, JVM and Development kit.
- it's mostly used Java develope.
- JDK superset of JRE. 

`.JRE`

: JRE( Java Virtual Machine )is software pacage that is used to run java programs.

- it does not have writing and compiling program.
- it is only for running the program.
- JRE uses to execute Bytecode.
- it's also required libraries (like System.out.println() etc.)


`.JVM`

: JVM stands for Java Virtual Machine. It is a key part of the Java programming language that allows Java programs to be platform-independent (i.e., "write once, run anywhere").

- JVM runs the .class files (compiled Java bytecode) created by the Java compiler (javac).

- Converts Bytecode to Machine Code

- JVM automatically handles memory using a process called Garbage Collection.

### Importance of the main method.

---

### What is IDE ?

- IDE stands for Integrated Development Environment.
- Software suite that consolidates basic tools required for software development.
- Central hub for coding, finding problems, and testing.
- Designed to improve developer efficiency.

### Need of IDE 

1. Streamlines development.
2. Increases productivity.
3. Simplifies complex tasks.
4. Offers a unified workspace.
> IDE Features.    
> - Code Autocomplete
> - Syntax Highlighting
> - Version Control
> - Error Checking






