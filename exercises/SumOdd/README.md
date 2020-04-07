Write a method called **`isOdd`** with an **int** parameter and call it **`number`**. The method needs to **return a boolean**.

Check that **`number`** **is > 0**, **if it is not** return **_false_**.

If **`number`** **is odd** return **_true_**, **otherwise** return **_false_**.

Write a second method called **`sumOdd`** that has **2 int parameters** **`start`** and **`end`**, which represent a range of numbers.

The method should use a **for loop** to sum all odd numbers in that range **including** the **end** and **return** the **sum**.

It should call the method **`isOdd`** to check if each number is **odd**.

The parameter **`end`** needs to be **greater than or equal to** **`start`** and both **`start`** and **`end`** parameters have to be **greater than 0**.

If those conditions are not satisfied **return** **_-1_** from the method to indicate invalid input. 

**EXAMPLE INPUT/OUTPUT:**

* **`sumOdd(1, 100);`** → should **return** **_2500_**
* **`sumOdd(-1, 100);`** → should **return** **_-1_**
* **`sumOdd(100, 100);`** → should **return** **_0_**
* **`sumOdd(13, 13);`** → should **return** **_13_** (This set contains one number, 13, and it is odd)
* **`sumOdd(100, -100);`** → should **return** **_-1_**
* **`sumOdd(100, 1000);`** → should **return** **_247500_**

**TIPS:**

* Use the remainder operator to check if the number is odd.

**NOTES:**

* **Both methods** needs to be defined as **`public static`** like we have been doing so far in the course.
* Do not add a **`main`** method to solution code.
