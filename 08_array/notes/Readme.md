# Java Arrays Notes

## Introduction
An **array** in Java is a data structure that stores multiple values of the same type.  
- Arrays use **index numbers** to access elements.  
- Instead of declaring many variables of the same type, we use an array.  
- Syntax: 
``` java 
   dataType arrayName[] = new dayaType[size];
```

---

## Example
```java
int[] marks = new int[5];    // Declaration with size
int age[] = {20, 19, 18};   // Declaration with values
```

---

## Indexing
Indexing in Java starts with **`0`**.  

```
Index:   0   1   2   3   4
Value:  [ ] [ ] [ ] [ ] [ ]
```

👉 For an array of size 5, indices go from `0` to `4`.

---

## Array Operations
The main operations on an array are:  

1. **Creation**  
2. **Input (Insertion)**  
3. **Output (Access/Display)**  
4. **Update (Modification)**  

---

### 1) Creation
Creation means declaring or creating an array in a program.  

```java
int[] marks = new int[5];   // Declaration with size
int age[] = {20, 19, 18};  // Declaration with values
```

---

### 2) Input (Insertion)
It means inserting elements or data into the array.  

```java
int[] marks = new int[5];

marks[0] = 90;
marks[1] = 85;
marks[2] = 70;
marks[3] = 95;
marks[4] = 88;

System.out.println(marks[2]); // Output: 70
```

---

### 3) Output (Access/Display)
It means showing or printing the elements of the array.  

```java
int[] marks = {90, 85, 70, 95, 88};

// Printing single element
System.out.println(marks[0]); // Output: 90

// Printing all elements using for loop
for(int i = 0; i < marks.length; i++) {
    System.out.println("marks[" + i + "] = " + marks[i]);
}

// Printing all elements using for-each loop
for(int m : marks) {
    System.out.println(m);
}
```

---

### 4) Update (Modification)
It means changing the value of an element in the array.  

```java
int[] age = {20, 19, 18};

System.out.println("Before Update: " + age[1]); // Output: 19

age[1] = 25; // Updating value

System.out.println("After Update: " + age[1]);  // Output: 25
```

---

## Other Important Points

### Array Length
Every array has a fixed size that cannot be changed once declared.  

```java
int[] numbers = new int[10];
System.out.println(numbers.length); // Output: 10
```

---

### Arrays with Other Data Types
```java
String[] fruits = {"Apple", "Mango", "Banana"};
double[] prices = {10.5, 20.99, 30.75};

System.out.println(fruits[1]); // Output: Mango
System.out.println(prices[2]); // Output: 30.75
```

---

## Multi-Dimensional Arrays

### 1) 2D Array Declaration
```java
int[][] matrix = new int[3][3];  // 3x3 matrix
```

### 2) Initialization with Values
```java
int[][] matrix = {
    {1, 2, 3},
    {4, 5, 6},
    {7, 8, 9}
};
```

### 3) Accessing 2D Array Elements
```java
System.out.println(matrix[0][2]); // Output: 3
System.out.println(matrix[2][1]); // Output: 8
```

### 4) Traversing 2D Array
```java
for(int i = 0; i < matrix.length; i++) {
    for(int j = 0; j < matrix[i].length; j++) {
        System.out.print(matrix[i][j] + " ");
    }
    System.out.println();
}
```

**Output:**
```
1 2 3
4 5 6
7 8 9
```

---

## Advantages of Arrays
- Stores multiple values in a single variable.  
- Easy to access elements using index.  
- Useful for iteration with loops.  
- Memory-efficient compared to creating multiple variables.  

---

## Limitations of Arrays
- Fixed size (cannot be changed at runtime).  
- Only stores data of the same type.  
- Insertion and Deletion are costly compared to other data structures.  

---
