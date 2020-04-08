Write a class with the name **`SimpleCalculator`**. The class needs **two fields (instance variables)** with names **`firstNumber`** and **`secondNumber`** both of type **double**.

Write the following methods (instance methods):

* Method named **`getFirstNumber`** **without any parameters**, it needs to **return** the value of **`firstNumber`** field.
* Method named **`getSecondNumber`** **without any parameters**, it needs to **return** the value of **`secondNumber`** field.
* Method named **`setFirstNumber`** with **one parameter** of type **double**, it needs to **set the value** of the **`firstNumber`** field.
* Method named **`setSecondNumber`** with **one parameter** of type **double**, it needs to set the value of the **`secondNumber`** field.
* Method named **`getAdditionResult`** **without any parameters**, it needs to **return** the result of **adding** the field values of **`firstNumber`** and **`secondNumber`**.
* Method named **`getSubtractionResult`** **without any parameters**, it needs to **return** the result of **subtracting** the field values of **`secondNumber`** from the **`firstNumber`**.
* Method named **`getMultiplicationResult`** **without any parameters**, it needs to **return** the result of **multiplying** the field values of **`firstNumber`** and **`secondNumber`**.
* Method named **`getDivisionResult`** **without any parameters** it needs to **return** the result of **dividing** the field values of **`firstNumber`** by the **`secondNumber`**. In case the value of **`secondNumber`** is 0 then **return** **_0_**.

**USAGE EXAMPLE:**

```java
SimpleCalculator calculator = new SimpleCalculator();
calculator.setFirstNumber(5.0);
calculator.setSecondNumber(4);
System.out.println("add = " + calculator.getAdditionResult());
System.out.println("subtract = " + calculator.getSubtractionResult());
calculator.setFirstNumber(5.25);
calculator.setSecondNumber(0);
System.out.println("multiply = " + calculator.getMultiplicationResult());
System.out.println("divide = " + calculator.getDivisionResult());
```

**OUTPUT:**

```
add = 9.0
subtract = 1.0
multiply = 0.0
divide = 0.0
```

**TIPS:**

* **_add = 9.0_** is printed because 5.0 + 4 is 9.0
* **_subtract = 1.0_** is printed because 5.0 - 4 is 1.0
* **_multiply = 0.0_** is printed because 5.25 * 0 is 0.0
* **_divide = 0.0_** is printed because **`secondNumber`** is set to 0

**NOTES:**

* All methods should be defined as **`public`**, **not** **`public static`**.
* In total, you have to write **8 methods**.
* Do not add the **`main`** method to the solution code.