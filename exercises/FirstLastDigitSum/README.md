Write a method named **`sumFirstAndLastDigit`** with **one parameter** of type **int** called **`number`**.

The method needs to find the first and the last digit of the parameter **`number`** passed to the method, using a loop and return the sum of the first and the last digit of that number.

If the **number** is **negative** then the method needs to **return** **_-1_** to indicate an invalid value.

**EXAMPLE INPUT/OUTPUT:**

* **`sumFirstAndLastDigit(252);`** → should **return** **_4_**, the first digit is 2 and the last is 2 which gives us 2+2 and the sum is 4.
* **`sumFirstAndLastDigit(257);`** → should **return** **_9_**, the first digit is 2 and the last is 7 which gives us 2+7 and the sum is 9.
* **`sumFirstAndLastDigit(0);`** → should **return** **_0_**, the first digit and the last digit is 0 since we only have 1 digit, which gives us 0+0 and the sum is 0.
* **`sumFirstAndLastDigit(5);`** → should **return** **_10_**, the first digit and the last digit is 5 since we only have 1 digit, which gives us 5+5 and the sum is 10.
* **`sumFirstAndLastDigit(-10);`** → should **return** **_-1_**, since the parameter is negative and needs to be positive.

**NOTES:**

* The method **`sumFirstAndLastDigit`** needs to be defined as **`public static`** like we have been doing so far in the course.
* Do not add a **`main`** method to solution code.
