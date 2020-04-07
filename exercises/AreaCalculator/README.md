Write a method named **`area`** with one **double** parameter named **`radius`**.

The method needs to **return** a **double** value that represents the **area** of a circle.

If the parameter **`radius`** is **negative** then **return** **_-1.0_** to represent an invalid value.

Write another overloaded method with **2 parameters **`x`** and **`y`** (both doubles)**, where **`x`** and **`y`** represent the sides of a rectangle.

The method needs to **return an area** of a rectangle.

If either or both parameters is/are a **negative return** **_-1.0_** to indicate an invalid value.

For formulas and PI value please check the tips below.

**EXAMPLE INPUT/OUTPUT:**

* **`area(5.0);`** should **return** **_78.53975_**
* **`area(-1);`** should **return** **_-1.0_** since the parameter is **negative**
* **`area(5.0, 4.0);`** should **return** **_20.0_** (5 * 4 = 20)
* **`area(-1.0, 4.0);`** should **return** **_-1.0_** since first the parameter is **negative**

**TIPS:**

* The formula for calculating the area of a rectangle is **x * y**.
* The formula for calculating a circle area is **radius * radius * π**.
* For π use a constant from **`Math`** class e.g. **`Math.PI`**.

**NOTES:** 

* All methods need to be defined as **`public static`** like we have been doing so far in the course.
* Do not add a **`main`** method to your solution code.
