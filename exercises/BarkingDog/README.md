We have a dog that likes to bark. We need to wake up if the dog is barking at night!

Write a method **`shouldWakeUp`** that has **2 parameters**.

**First parameter** should be of type **boolean** and be named **`barking`** it represents if our dog is currently barking.

**Second parameter** represents the **hour of the day** and is of type **int** with the name **`hourOfDay`** and has a valid range of 0-23.

We have to wake up if the dog is barking **before 8 or after 22 hours** so in that case **return** **_true_**.

In all other cases **return** **_false_**.

If the **`hourOfDay`** parameter is **less than 0** or **greater than 23** return **_false_**.

**EXAMPLE INPUT/OUTPUT:**

* **`shouldWakeUp(true, 1);`** → should return **_true_**
* **`shouldWakeUp(false, 2);`** → should return **_false_** since the dog is not barking.
* **`shouldWakeUp(true, 8);`** → should return **_false_**, since it's not before 8.
* **`shouldWakeUp(true, -1);`** → should return **_false_** since the **`hourOfDay`** parameter needs to be in a range 0-23.

**TIPS:**

* Use the if else statement with multiple conditions.

**NOTES:**

* The **`shouldWakeUp`** method needs to be defined as **`public static`** like we have been doing so far in the course.
* Do not add a **main** method to solution code.
