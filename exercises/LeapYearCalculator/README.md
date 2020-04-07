Write a method **`isLeapYear`** with a parameter of type int named **`year`**.

The parameter needs to be **greater than or equal to 1** and **less than or equal to 9999**.

If the parameter is not in that range return **_false_**.

Otherwise, if it is in the valid range, calculate if the year is a leap year and return **_true_** if it is a leap year, otherwise return **_false_**.

To determine whether a year is a leap year, follow these steps:

1. If the year is **evenly divisible by 4**, go to step 2. Otherwise, go to step 5.
2. If the year is **evenly divisible by 100**, go to step 3. Otherwise, go to step 4.
3. If the year is **evenly divisible by 400**, go to step 4. Otherwise, go to step 5.
4. The year is a leap year (it has 366 days). The method **`isLeapYear`** needs to return **_true_**.
5. The year is not a leap year (it has 365 days). The method **`isLeapYear`** needs to return **_false_**.

The following years **are not leap years**:

1700, 1800, 1900, 2100, 2200, 2300, 2500, 2600

This is because they are evenly divisible by 100 but not by 400.

The following years **are leap years**:

1600, 2000, 2400

This is because they are **evenly divisible by both 100 and 400**.

**EXAMPLE INPUT/OUTPUT:**

* **`isLeapYear(-1600);`** → should **return** **_false_** since the parameter is **not in range (1-9999)**
* **`isLeapYear(1600);`** → should **return** **_true_** since 1600 is a leap year
* **`isLeapYear(2017);`** → should **return** **_false_** since 2017 is **not** a leap year
* **`isLeapYear(2000);`** → should **return** **_true_** because 2000 is a leap year 

**NOTES:**

* The method **`isLeapYear`** needs to be defined as **`public static`** like we have been doing so far in the course.
* Do not add a **`main`** method to solution code.