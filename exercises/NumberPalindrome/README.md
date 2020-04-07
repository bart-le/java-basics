Write a method called **`isPalindrome`** with one **int** parameter called **`number`**.

The method needs to **return a boolean**.

It should return **_true_** if the number is a palindrome number otherwise it should return **_false_**.

Check the tips below for more info about palindromes.

**EXAMPLE INPUT/OUTPUT:**

* **`isPalindrome(-1221);`** → should **return** **_true_**
* **`isPalindrome(707);`** → should **return** **_true_**
* **`isPalindrome(11212);`** → should **return** **_false_** because **`reverse`** is 21211 and that is not equal to 11212.

**TIPS:**

* A palindrome number is a number which when **reversed** is equal to the **original number**. For example: 121, 12321, 1001 etc.
* **Logic to check a palindrome number:**
  * Find the the reverse of the given number. Store it in some variable say **`reverse`**. Compare the **`number`** with **`reverse`**.
  * If both are the the same then the **`number`** **is a palindrome** otherwise **it is not**.
* **Logic to reverse a number:**
  * Declare and initialize another variable to store the reverse of a number, for example **`reverse = 0`**.
  * Extract the last digit of the given number by performing the modulo division (remainder).
  * Store the last digit to some variable say **`lastDigit = num % 10`**.
  * Increase the place value of **`reverse`** by one.
  * To increase place value **multiply** the **`reverse`** variable **by 10** e.g. **`reverse = reverse * 10`**.
  * **Add** **`lastDigit`** to **`reverse`**.
  * Since the last digit of the **`number`** is processed, remove the last digit of **`num`**. To remove the last digit **divide** **`number`** **by 10**.
  * Repeat steps until **`number`** **is not equal to (or greater than) zero**. 
* A while loop would be good for this coding exercise.
* **Be careful with negative numbers**. They can also be palindrome numbers.
* **Be careful with reversing a number**, you will need a parameter for comparing a reversed number with the starting number (parameter).

**NOTES:**

* The method **`isPalindrome`** needs to be defined as **`public static`** like we have been doing.
