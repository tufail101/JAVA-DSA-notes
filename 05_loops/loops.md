# 🔁 Loops in Java

## 📌 Introduction
- Loops are **control flow statements** that repeatedly execute a block of code until a certain condition becomes false.  
- They help **reduce repetition** and make programs more efficient.  

---

## ✨ Types of Loops in Java

---

### 1️⃣ For Loop
- Used when the number of iterations is **known in advance**.  
- Contains **initialization, condition, and increment/decrement** in one line.  

**Syntax:**  
for(initialization; condition; update) {  
  // code block  
}  

**Example:**  
for(int i = 1; i <= 5; i++) {  
  System.out.print(i + " ");  
}  
// Output: 1 2 3 4 5  

---

### 2️⃣ While Loop
- Used when the number of iterations is **not known in advance**.  
- Condition is checked **before executing** the block.  

**Syntax:**  
while(condition) {  
  // code block  
}  

**Example:**  
int i = 1;  
while(i <= 5) {  
  System.out.print(i + " ");  
  i++;  
}  
// Output: 1 2 3 4 5  

---

### 3️⃣ Do-While Loop
- Similar to while loop but executes the block **at least once**.  
- Condition is checked **after executing** the block.  

**Syntax:**  
do {  
  // code block  
} while(condition);  

**Example:**  
int i = 1;  
do {  
  System.out.print(i + " ");  
  i++;  
} while(i <= 5);  
// Output: 1 2 3 4 5  

---

## ⚡ Summary
- **For loop** → When you know how many times to repeat.  
- **While loop** → When repetitions depend on a condition.  
- **Do-While loop** → When block must execute at least once.  

---
