Write a method **`isLeapYear`** with a parameter of type int named **`year`**. 

The parameter needs to be **greater than or equal to 1** and **less than or equal to 9999**.

If the parameter is not in that range return **_false_**. 

Otherwise, if it is in the valid range, calculate if the year is a leap year and return **_true_** if it is, otherwise return **_false_**. 

A year is a leap year if it is divisible by 4 but not by 100, or it is divisible by 400.

**EXAMPLE INPUT/OUTPUT:**

* **`isLeapYear(-1600);`** → should **return** **_false_** since the parameter is **not in the range (1-9999)**
* **`isLeapYear(1600);`** → should **return** **_true_** since 1600 is a **leap year**
* **`isLeapYear(2017);`** → should **return** **_false_** since 2017 is **not a leap year**
* **`isLeapYear(2000);`** → should **return** **_true_** because 2000 is a **leap year** 

**​NOTE:** The solution to the Leap Year coding exercise earlier in the course created the **`isLeapYear`** method. You can use that solution if you wish.

Write another method **`getDaysInMonth`** with two parameters **`month`** and **`year`**. ​Both of type **int**.

If parameter month is **< 1** or **> 12** return **_-1_**.

If parameter year is **< 1** or **> 9999** then return **_-1_**.

This method needs to return the number of days in the month. Be careful about leap years they have 29 days in month 2 (February).

You should check if the year is a leap year using the method **`isLeapYear`** described above.

**EXAMPLE INPUT/OUTPUT:**

* **`getDaysInMonth(1, 2020);`** → should **return** **_31_** since January has **31 days**.
* **`getDaysInMonth(2, 2020);`** → should **return** **_29_** since February has **29 days in a leap year** and 2020 is a **leap year**.
* **`getDaysInMonth(2, 2018);`** → should **return** **_28_** since February has **28 days if it's not a leap year** and 2018 is **not a leap year**.
* **`getDaysInMonth(-1, 2020);`** → should **return** **_-1_** since the parameter **`month`** is **invalid**.
* **`getDaysInMonth(1, -2020);`** → should **return** **_-1_** since the parameter **`year`** is **outside the range of 1 to 9999**.

**TIPS:**

* Use the switch statement.

**NOTES:**

* Methods **`isLeapYear`** and **`getDaysInMonth`** need to be **`public static`** like we have been doing so far in the course.
* Do not add a **`main`** method to solution code.
