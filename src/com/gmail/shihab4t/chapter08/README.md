# অধ্যায় ৮ – এক্সেপশন হ্যান্ডেলিং (Exception Handling)

- Exception Object
- Exception Throwing
- Exception Handling

## Try ব্লক (Try Block)

```
try {
    // code that may cause exceptions
} catch (Throwable ex) {
}
```

## Catch ব্লক (Catch Block)

```
try {
    // code that may throw exceptions
} catch (ExceptionType e) {
}
```

```
try {
    // some code
} catch (IndexOutOfBoundsException e) {
    System.out.println("Caught IndexOutOfBoundsException ");
} catch (IOException e) {
    System.out.println("Caught IOException");
}
```

```
// After java 7

try {
    // some code
}
catch (IndexOutOfBoundsException | IOException e) {
    System.out.println("Caught an exceptions");
}
```

## Finally ব্লক (Finally Block)

```
try {
    // Code block that may throw Exception
} catch (ExceptionType1 e1) {
    // Handle ExceptionType1 exceptions
} catch (ExceptionType2 e2) {
    // Handle ExceptionType2 exceptions
} finally {
    // Code always executed after the
    // try and any catch block doesn't matter
    // whether an exception is thrown or not.
}
```

```
try {
    // Code block
} finally {
    // Code Always executed after the
    // try and any catch block doesn't matter
    // if an exception is thrown or not
}
```

- checked exception

## জাভা এক্সেপশন টাইপ (Java Exception Type)

- Java Exception Class hierarchy
  - Throwable (checked)
    - Error (unchecked)
      - OutOfMemoryError
      - NoClassDefFoundError
    - Exception (checked)
      - Runtime Exception (unchecked)
        - NullPointerException
        - IllegalArgumentException
        - ArithmeticException
      - IOException
      - SQLException
      - NoSuchMethodException
- Unchecked Exception
- Checked Exception
  - catch-or-declare-requirement
  - Two-way to handle Checked Exception
    1. try-catch
    2. add Method signature

## এক্সেপশন ডিক্লারেশন ও থ্রোয়িং (Exception declaration and throwing)

- Get Information about Exception
  - getMessage()
  - toString()
  - printStackTrace()

## স্ট্যাক ট্রেস (Stack trace)

- abruptly

## সাধারণ এক্সেপশন ক্লাস (General Exception Class)

- General Exceptions Class
  1. ArithmeticException
  2. NumberFormatException
  3. ClassNotFoundException
  4. SQLException
  5. MalformedURLException
  6. NullPointerException
  7. ArrayIndexOutOfBoundsException
  8. IllegalStateException
  9. ClassCastException
  10. StackOverFlowError
  11. NoClassDefFoundError
  12. CloneNotSupportedException
  13. FileNotFoundException
  14. IOException

## ইউজার ডিফাইন্‌ড এক্সেপশন (User defined exceptions)

- Fault Tolerant System

## অনুশীলনী (Exercises)
