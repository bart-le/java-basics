Write a method named **`getLargestPrime`** with one parameter of type **int** named **`number`**. 

If the **`number`** **is negative or does not have any prime numbers**, the method should **return** **_-1_** to indicate an invalid value.

The method should **calculate the largest prime factor of a given number** and return it.

**EXAMPLE INPUT/OUTPUT:**

* **`getLargestPrime (21);`** should **return** **_7_** since 7 is the largest prime (3 * 7 = 21)
* **`getLargestPrime (217);`** should **return** **_31_** since 31 is the largest prime (7 * 31 = 217)
* **`getLargestPrime (0);`** should **return** **_-1_** since 0 does not have any prime numbers
* **`getLargestPrime (45);`** should **return** **_5_** since 5 is the largest prime (3 * 3 * 5 = 45)
* **`getLargestPrime (-1);`** should **return** **_-1_** since the parameter is negative

**TIPS:**

* Since the numbers 0 and 1 are not considered prime numbers, they cannot contain prime numbers.

**NOTES:**

* The method **`getLargestPrime`** should be defined as **`public static`** like we have been doing so far in the course.
* Do not add a **`main`** method to the solution code.
