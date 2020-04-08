Write a class with the name **`Person`**. The class needs **three fields (instance variables)** with the names **`firstName`**, **`lastName`** of type **String** and **`age`** of type **int**.

Write the following methods (instance methods):

* Method named **`getFirstName`** **without any parameters**, it needs to **return** the value of the **`firstName`** field.
* Method named **`getLastName`** **without any parameters**, it needs to **return** the value of the **`lastName`** field.
* Method named **`getAge`** **without any parameters**, it needs to **return** the value of the **`age`** field.
* Method named **`setFirstName`** **with one parameter** of type **String**, it needs to **set the value** of the **`firstName`** field.
* Method named **`setLastName`** **with one parameter** of type **String**, it needs to **set the value** of the **`lastName`** field.
* Method named **`setAge`** **with one parameter** of type **int**, it needs to **set the value** of the **`age`** field. If the **parameter** is **less than 0 or greater than 100**, it needs to set the **`age`** field value to **0**.
* Method named **`isTeen`** **without any parameters**, it needs to **return** **_true_** if the value of the **`age`** field is **greater than 12 and less than 20**, otherwise, **return** **_false_**.
* Method named **`getFullName`** **without any parameters**, it needs to return the full name of the person.
  * In case both **`firstName`** and **`lastName`** fields are **empty** **`String`**, **return** an **empty** **`String`**.
  * In case **`lastName`** is an **empty** **`String`**, **return** **`firstName`**.
  * In case **`firstName`** is an **empty** **`String`**, **return** **`lastName`**.

To check if **`s`** **`String`** is empty, use the method **`isEmpty`** from the **String** class. For example, **`firstName.isEmpty()`** **returns** **_true_** if the **`String`** is empty or in other words, when the **`String`** does not contain any characters.

**USAGE EXAMPLE:**

```java
Person person = new Person();
// firstName is set to empty string
person.setFirstName("");
// lastName is set to empty string
person.setLastName("");
person.setAge(10);
System.out.println("fullName = " + person.getFullName());
System.out.println("teen = " + person.isTeen());
// firstName is set to John
person.setFirstName("John");
person.setAge(18);
System.out.println("fullName = " + person.getFullName());
System.out.println("teen = " + person.isTeen());
// lastName is set to Smith
person.setLastName("Smith");
System.out.println("fullName = " + person.getFullName());
```

**OUTPUT:**

```
fullName =
teen = false
fullName = John
teen = true
fullName = John Smith
```

**NOTES:**

* All methods should be defined as **`public`**, **not** **`public static`**.
* In total, you have to write **8 methods**.
* Do not add the **`main`** method to the solution code.
