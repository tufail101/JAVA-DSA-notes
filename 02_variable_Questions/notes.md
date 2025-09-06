# Java Variables

## 📌 Introduction
- A **variable** in Java is a container that holds data during the execution of a program.
- Each variable is assigned a **data type**, which determines the kind of values it can store.
- Java is **statically typed**, meaning variables must be declared before use.

---

## 🛠️ Syntax
`type variableName = value;`

Example:  
`int age = 20;`  
`String name = "Burdy";`

---

## 🔑 Types of Variables

### 1. Local Variables
- Declared inside methods, constructors, or blocks.
- Created when the method is invoked and destroyed after it ends.
- Must be initialized before use.  
Example:  
`void myMethod() { int x = 10; System.out.println(x); }`

---

### 2. Instance Variables (Non-Static Fields)
- Declared inside a class but outside any method, constructor, or block.
- Each object has its own copy.
- Default values are provided (0, null, false, etc.).  
Example:  
`class Student { String name; int age; }`

---

### 3. Static Variables (Class Variables)
- Declared using the `static` keyword.
- Shared among all objects of a class.
- Stored in the method area.  
Example:  
`class Student { static String school = "ABC School"; }`

---

## ⚡ Rules for Naming Variables
- Must start with a letter, `$`, or `_`.
- Cannot start with a digit.
- Cannot be a Java keyword.
- Case-sensitive (`Age` and `age` are different).
- Should follow camelCase convention.

---

## 🎯 Variable Declaration Examples
- `int number = 25;`
- `double price = 19.99;`
- `char grade = 'A';`
- `boolean isJavaFun = true;`
- `String name = "Burdy";`

---

## 🧮 Variable Scope
- **Local Scope** → Accessible only within the block/method.  
- **Instance Scope** → Accessible by all non-static methods of the class.  
- **Class (Static) Scope** → Accessible using class name.  

---

## 📂 Memory Allocation
- Local variables → Stored in stack memory.  
- Instance variables → Stored in heap memory.  
- Static variables → Stored in class area (method area).  

---

## 📊 Comparison Table

| Feature              | Local Variable                  | Instance Variable                  | Static Variable                    |
|----------------------|---------------------------------|-----------------------------------|-----------------------------------|
| Declared Inside      | Method / block / constructor    | Inside class, outside methods      | Inside class, with `static`        |
| Lifetime             | During method execution         | As long as object exists           | As long as class is loaded         |
| Memory Location      | Stack                          | Heap                               | Method Area                        |
| Default Value        | No (must initialize)            | Yes (0, null, false, etc.)         | Yes (0, null, false, etc.)         |
| Shared Across Objects| ❌                              | ❌                                 | ✅                                 |

---
