Write a method named **`hasSameLastDigit`** with three parameters of type **int**. 

Each number should be within the range of **10 (inclusive) - 1000 (inclusive)**. If one of the numbers is **not within the range**, the method should **return** **_false_**.

The method should **return** **_true_** if **at least two of the numbers share the same rightmost digit**; **otherwise**, it should **return** **_false_**.

**EXAMPLE INPUT/OUTPUT:**

* **`hasSameLastDigit(41, 22, 71);`** → should **return** **_true_** since 1 is the rightmost digit in numbers 41 and 71
* **`hasSameLastDigit(23, 32, 42);`** → should **return** **_true_** since 2 is the rightmost digit in numbers 32 and 42
* **`hasSameLastDigit(9, 99, 999);`** → should **return** **_false_** since 9 is not within the range of 10-1000

Write another method named **`isValid`** with one parameter of type **int**.

The method needs to **return** **_true_** if the number parameter is in range of 10 (inclusive) - 1000 (inclusive), otherwise **return** **_false_**.

**EXAMPLE INPUT/OUTPUT:**

* **`isValid(10);`** → should **return** **_true_** since 10 is within the range of 10-1000
* **`isValid(468);`** → should **return** **_true_** since 468 is within the range of 10-1000
* **`isValid(1051);`** → should **return** **_false_** since 1051 is not within the range of 10-1000

**NOTES:**

* All methods need to be defined as **`public static`** as we have been doing so far in the course.
* Do not add a **`main`** method to the solution code.
