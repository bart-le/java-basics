We'll say that a number is "teen" if it is in the range **13 - 19 (inclusive)**.

Write a method named **`hasTeen`** with **3 parameters** of type **int**.

The method **should return boolean** and it needs to **return** **_true_** if one of the parameters is in range **13 (inclusive) - 19 (inclusive)**. Otherwise **return** **_false_**.

**EXAMPLE INPUT/OUTPUT:**

* **`hasTeen(9, 99, 19);`** should **return** **_true_** since 19 is **in range 13 - 19**
* **`hasTeen(23, 15, 42);`** should **return** **_true_** since 15 is **in range 13 - 19**
* **`hasTeen(22, 23, 34);`** should **return** **_false_** since numbers 22, 23, 34 are **not in range 13 - 19**

Write another method named **`isTeen`** with **1 parameter** of type **int**.

The method **should return boolean** and it needs to **return** **_true_** if the parameter is in **range 13 (inclusive) - 19 (inclusive)**. Otherwise **return** **_false_**.

**EXAMPLE INPUT/OUTPUT:**

* **`isTeen(9);`** should **return** **_false_** since 9 is **not in range 13 - 19**
* **`isTeen(13);`** should **return** **_true_** since 13 is **in range 13 - 19**

**NOTES:**

* All methods need to be defined as **`public static`** like we have been doing so far in the course.
* Do not add a **`main`** method to solution code.
