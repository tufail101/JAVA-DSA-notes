# Java Condition Statements

## 📌 Introduction
- The statements used to check some **condition** and perform some task are known as **condition statements**.  
- They are blocks of code which are executed when some condition is true.  

---

## 🔑 Types of Condition Statements
1. if statement  
2. if-else statement  
3. else-if statement  
4. Nested if-else  
5. switch statement  

---

### 1️⃣ if Statement
- Executes a block of code only if the given condition is **true**.  
**Syntax:**  
if (condition) {  
  // code executes when condition is true  
}  

---

### 2️⃣ if-else Statement
- Used to perform tasks when a condition is **true** or **false**.  
- Contains two blocks:  
 - if block → runs when condition is true  
 - else block → runs when condition is false  
**Syntax:**  
if (condition) {  
  // executes when condition is true  
} else {  
  // executes when condition is false  
}  

---

### 3️⃣ else-if Statement
- Used to check **multiple conditions**.  
- Has multiple else-if blocks to test different cases.  
**Syntax:**  
if (condition1) {  
  // executes when condition1 is true  
} else if (condition2) {  
  // executes when condition2 is true  
} else if (condition3) {  
  // executes when condition3 is true  
} else {  
  // executes when all conditions are false  
}  

---

### 4️⃣ Nested if-else
- An if-else statement placed **inside another if-else statement**.  
**Syntax:**  
if (condition1) {  
  if (condition2) {  
    // executes when both condition1 and condition2 are true  
  }  
}  

---

### 5️⃣ switch Statement
- Works like a **multi-way if-else** statement.  
- Executes one block of code among many options, based on the value of a single variable.  
- If no match is found, the default block executes.  
**Syntax:**  
switch (variable) {  
  case value1:  
    // code  
    break;  
  case value2:  
    // code  
    break;  
  default:  
    // code executes when no case matches  
}  

---
