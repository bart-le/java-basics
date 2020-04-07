Write a method **`printEqual`** with **3 parameters** of type **int**. The method should not return anything (**void**).

If **one of** the parameters is **less than 0**, print text **_Invalid Value_**.

If **all numbers are equal** print text **_All numbers are equal_**.

If **all numbers are different** print text **_All numbers are different_**.

Otherwise, print **_Neither all are equal or different_**.

**EXAMPLE INPUT/OUTPUT:**

* **`printEqual(1, 1, 1);`** should **print** text **_All numbers are equal_**
* **`printEqual(1, 1, 2);`** should **print** text **_Neither all are equal or different_**
* **`printEqual(-1, -1, -1);`** should **print** text **_Invalid Value_**
* **`printEqual(1, 2, 3);`** should **print** text **_All numbers are different_**

**TIP: Be extremely careful about spaces in the printed message.** 

**NOTES:**

* The solution will not be accepted if there are **extra spaces**.
* The method **`printEqual`** needs to be defined as **`public static`** like we have been doing so far in the course.
* Do not add **`main`** method to solution code.
