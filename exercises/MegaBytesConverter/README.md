Write a method called **`printMegaBytesAndKiloBytes`** that has **1 parameter** of type **int** with the name **`kilobytes`**.

The method should not return anything (**void**) and it needs to calculate the megabytes and remaining kilobytes from the **`kiloBytes`** parameter.

Then it needs to print a message in the format **_XX KB = YY MB and ZZ KB_**.

**XX** represents the original value **`kilobytes`**.

**YY** represents the calculated **megabytes**.

**ZZ** represents the calculated remaining **kilobytes**.

For example, when the parameter **`kiloBytes`** is **2500** it needs to **print** **_2500 KB = 2 MB and 452 KB_**.

If the parameter **`kiloBytes`** is **less than 0** then **print** the text **_Invalid Value_**.

**EXAMPLE INPUT/OUTPUT:**

* **`printMegaBytesAndKiloBytes(2500);`** → should **print** the following text: **_2500 KB = 2 MB and 452 KB_**
* **`printMegaBytesAndKiloBytes(-1024);`** → should **print** the following text: **_Invalid Value_** because parameter is **less than 0**
* **`printMegaBytesAndKiloBytes(5000);`** → should **print** the following text: **_5000 KB = 4 MB and 904 KB_**

**TIPS:**

* **Be extremely careful about spaces in the printed message.**
* Use the remainder operator.
* 1 MB = 1024 KB.

**NOTES:**

* Do not set **`kilobytes`** parameter value inside your method. 
* The solution will not be accepted if there are **extra spaces**.
* The **`printMegaBytesAndKiloBytes`** method needs to be defined as **`public static`** like we have been doing so far in the course.
* Do not add a **`main`** method to solution code.
