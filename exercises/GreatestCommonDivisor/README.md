Write a method named **`getGreatestCommonDivisor`** with two parameters of type **int** named **`first`** and **`second`**. 

If **one of the parameters is < 10**, the method should **return** **_-1_** to indicate an invalid value.

The method should return the greatest common divisor of the two numbers (int).

The greatest common divisor is the largest positive integer that can **fully divide each of the integers (i.e. without leaving a remainder)**.

**For example 12 and 30:**

* 12 can be divided : 1, 2, 3, 4, **6**, 12

* 30 can be divided by: 1, 2, 3, 5, **6**, 10, 15, 30

The greatest common divisor is 6 since both 12 and 30 can be divided by 6, and there is no resulting remainder.

**EXAMPLE INPUT/OUTPUT:**

* **`getGreatestCommonDivisor(25, 15);`** should **return** **_5_** since both can be divided by 5 without a remainder
* **`getGreatestCommonDivisor(12, 30);`** should **return** **_6_** since both can be divided by 6 without a remainder
* **`getGreatestCommonDivisor(9, 18);`** should **return** **_-1_** since the **first parameter is < 10**
* **`getGreatestCommonDivisor(81, 153);`** should **return** **_9_** since both can be divided by 9 without a remainder

**TIPS:**

* **Use a while or a for loop** and check if both numbers can be divided without a remainder.
* Find the minimum of the two numbers.

**NOTES:**

* The method **`getGreatestCommonDivisor`** should be defined as **`public static`** like we have been doing so far in the course.
* Do not add a **`main`** method to the solution code.
