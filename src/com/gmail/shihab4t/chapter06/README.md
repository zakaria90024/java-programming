# অধ্যায় ৬ – অবজেক্ট ও ক্লাস (Object & Class)

## অবজেক্ট (Object)

## ক্লাস (Class)

- নীলনকশা (blueprint)
- A Class is reference type. It also called user defined type.

## অবজেক্ট ওরিয়েন্টেড প্রোগ্রামিংয়ের উপাদানসমূহ (Elements of Object Oriented Programming)

- A Java file with methods and data contains the following parts.
  1. package declaration
  2. import statement
  3. type declaration
  4. fields
  5. methods
- The Library of Congress Classification System (LCC)
- The role of declaring package
  1. First write `package` keyword
  2. Package name should be lowercase letter.
  3. Package name should be this format `com.bazlur` if the internet domain is bazlur.com
- Import a Class
  1. First write `import` keyword then write the class name with that package name
- Type Declaration
  1. In java type is: Class or Interface or enum
- Field declaration
- Method
- A program with start one the `main` method

## জাভা মেথড (Java Methods)

- Access Modifier (public, protected, private)
- Return Type
- Method name
- list of parameters
- list of exceptions
- Method body
- parameters vs arguments

## অবজেক্ট ইনস্ট্যানশিয়েশন (Object instances)

- 3 step to create an object
  1. declaration
  2. instantiation
  3. initialization
- Rule of creating objects
  ```
  ClassName objectName = new Constructor();
  ```

## মেথড ওভারলোডিং (Method overloading)

- The parameters can be different in three ways -
  1. There may be differences in the number of parameters in the methods.
  2. If the number of parameters in the methods is the same then there must be a difference between the data types.
  3. Although the number of parameters and the data type are the same, their order must be different.

## কনস্ট্রাক্টর (Constructor)

- Constructor method
- `this` keyword
- Constructor overloading
- method Invoke
- Constructor changing
- Code duplication is not good
- Char Stack implementation
- StringJoiner class
- Bracket Balanced problem solve

## অবজেক্ট রেফারেন্স (Object Reference)

## এনাম (enum)

## নাল (null)

- https://en.wikipedia.org/wiki/Playing_cards_in_Unicode
- Deck Game

## স্ট্যাটিক ভেরিয়েবল, কনস্ট্যান্ট ও মেথড (Static Variables, Constants and Methods)

- `static` keyword
- `final` keyword make constant (like: `const` in c/c++)
- Field or properties can be two types:
  1. Field or properties of Object or class instances
  2. Class field or properties
- Method can be two types:
  1. Static method
  2. non-Static method
- The static method can only read or modify the static field
- The non-static method can read or modify two types of static, non-static field
- Call method:
  ```
  <object>.<non-static-method>();
  <class-name>.<static-method>();
  ```

## অনুশীলনী (Exercise)
