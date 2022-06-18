# অধ্যায় ৯ – জেনেরিকস (Generics)

## জাভা জেনেরিকস (Java Generics)

- Generics
- parameterize type
- Java doesn't support Generics for primitive type.
- diamond operator
- verbosity

## জেনেরিকস এবং সাবটাইপিং (Generics and Subtyping)

## বাউন্ডেড টাইপ (Bounded Type)

- `Number` class এর সাবক্লাস: Integer, Double, Float, Long, Short, BigInteger, BigDecimal, Byte

## ওয়াইল্ডকার্ড আরগুমেন্ট (Wildcard argument)

- Upper bounded wildcard
  ```
  public static void proces(List<? extends Foo> list) {
      /*...*/
  }
  ```
- Lower bounded wildcard
  ```
  public static void addNumbers(List<? super Integer> list) {
      /*...*/
  }
  ```

## জেনেরিক মেথড (Generic Method)

## টাইপ ইরেজার (Type Eraser)
