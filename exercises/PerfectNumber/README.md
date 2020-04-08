Write a method named **`isPerfectNumber`** with one parameter of type **int** named number. 

**If number is < 1**, the method should **return** **_false_**.

The method must calculate if the number **is perfect**. If the number is perfect, the method should **return** **_true_**; otherwise, it should **return** **_false_**.

**EXAMPLE INPUT/OUTPUT:**

* **`isPerfectNumber(6);`** should **return** **_true_** since its proper divisors are **1, 2, 3 and the sum is 1 + 2 + 3 = 6**
* **`isPerfectNumber(28);`** should **return** **_true_** since its proper divisors are **1, 2, 4, 7, 14 and the sum is 1 + 2 + 4 + 7 + 14 = 28**
* **`isPerfectNumber(5);`** should **return** **_false_** since its only proper divisor is **1 and the sum is 1 not 5**
* **`isPerfectNumber(-1);`** should **return** **_false_** since the number **is < 1**

**What is the perfect number?**

A perfect number is a positive integer which is equal to the sum of its proper positive divisors.

Proper positive divisors are positive integers that fully divide the perfect number without leaving a remainder **and** exclude the perfect number itself.

For example, take the number 6.
Its proper divisors are **1**, **2**, and **3** (since **6** is the value of the perfect number, it is excluded), and the sum of its proper divisors is **1 + 2 + 3 = 6**. 

Therefore, **6 is a perfect number** (as well as the first perfect number).

**TIPS:**

* Use a **while** or **for** loop.
* Use the remainder operator.

**NOTES:**

* The method **`isPerfectNumber`** should be defined as **`public static`** like we have been doing so far in the course.
* Do not add a **`main`** method to the solution code.
