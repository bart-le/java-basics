Write a method called **`numberToWords`** with one **int** parameter named **`number`**.

The method should print out the passed number using words for the digits.

If the number is negative, print **_Invalid Value_**.

To print the number as words, follow these steps:

1. Extract the last digit of the given number using the remainder operator. 
2. Convert the value of the digit found in Step 1 into a word. There are 10 possible values for that digit, those being 0, 1, 2, 3, 4, 5, 6, 7, 8, 9. Print the corresponding word for each digit, e.g. print **_Zero_** if the digit is 0, **_One_** if the digit is 1, and so on.
3. Remove the last digit from the number.
4. Repeat Steps 2 through 4 until the number is 0.

The logic above is correct, but in its current state, the words will be printed in reverse order. For example, if the number is 234, the logic above will produce the output **_Four Three Two_** instead of **_Two Three Four_**. To overcome this problem, write a second method called **`reverse`**.

The method **`reverse`** should have one **int** parameter and **return** **the reversed number (int)**. For example, if the number passed is **234**, then the reversed number would be **432**. The method reverse should also reverse negative numbers.

Use the method **`reverse`** within the method **`numberToWords`** in order to print the words in the correct order.

Another thing to keep in mind is any reversed number with leading zeroes (e.g. the reversed number for **100** is **001**). The logic above for the method **`numberToWords`** will print **_One_**, but that is **incorrect**. It should print **_One Zero Zero_**. To solve this problem, write a third method called **`getDigitCount`**.

The method **`getDigitCount`** should have one **int** parameter called **`number`** and **return** **the count of the digits in that number**. If the number is **negative**, return **-1** to indicate an invalid value.

For example, if the number has a value of 100, the method **`getDigitCount`** should **`return 3`** since the number 100 has 3 digits (1, 0, 0).

**EXAMPLE INPUT/OUTPUT:**

* **`getDigitCount(0);`** should **return** **_1_** since there is only 1 digit
* **`getDigitCount(123);`** should **return** **_3_**
* **`getDigitCount(-12);`** should **return** **_-1_** since the parameter is negative
* **`getDigitCount(5200);`** should **return** **_4_** since there are 4 digits in the number


* **`reverse(-121);`** should **return** **_-121_**
* **`reverse(1212);`** should **return** **_2121_**
* **`reverse(1234);`** should **return** **_4321_**
* **`reverse(100);`** should **return** **_1_**


* **`numberToWords(123);`** should print **_One Two Three_**.
* **`numberToWords(1010);`** should print **_One Zero One Zero_**.
* **`numberToWords(1000);`** should print **_One Zero Zero Zero_**.
* **`numberToWords(-12);`** should print **_Invalid Value_** since the parameter is negative.

**TIPS:**

* Use a for loop to print zeroes after reversing the number. As seen in a previous example, 100 reversed becomes 1, but the method **`numberToWords`** should print "One Zero Zero". To get the number of zeroes, check the difference between the digit count from the original number and the reversed number.

When printing words, each word can be in its own line.

For example, **`numberToWords(123);`** can be:

```
One
Two
Three
```

They don't have to be separated by a space.

**NOTES:**

* The methods **`numberToWords`**, **`getDigitCount`**, **`reverse`** should be defined as **`public static`** like we have been doing so far in the course.
* In total, you have to write **3 methods**.
* Do not add a **`main`** method to the solution code.
