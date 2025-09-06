# 📘 Java Functions / Methods

## 📌 Introduction
- **Functions/Methods** are blocks of code that perform a **specific task**.  
- A method can be used **multiple times** in a program.  
- They help to **reduce code size** and improve **readability**.  
- Methods can be written **with or without input parameters**.  

---

## 🛠️ Syntax

**Without Parameters:**  
returnType functionName() {  
  // body  
  return value;  
}  

// Function Calling  
functionName();  

---

**With Parameters:**  
returnType functionName(type param1, type param2) {   // Parameters / Formal Parameters  
  // body  
  return value;  
}  

// Function Calling with arguments (Actual Parameters)  
functionName(arg1, arg2);  

---

## ✨ Important Points
1. Every Java program must have at least one method: **`main()`**.  
2. **Return Type:**  
 - If a method returns nothing → use **`void`**.  
 - Otherwise → specify the type (`int`, `String`, `double`, etc.).  
3. Java is **pass-by-value**, meaning copies of variables are passed, not the originals (for primitives).  

---

## 🎯 Example

```java
class Demo {
    // Method without parameters
    void greet() {
        System.out.println("Hello Burdy!");
    }

    // Method with parameters
    int add(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        Demo obj = new Demo();

        // Calling methods
        obj.greet(); // Output: Hello Burdy!
        System.out.println("Sum: " + obj.add(5, 10)); // Output: Sum: 15
    }
}
