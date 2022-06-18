# অধ্যায় ০২ - সাধারণ প্রোগ্রামিং সমস্যা

## কনসোলে প্রিন্ট করা (Print to console)

- `System.out.println();`
- `System.out.print();`
- Basic Math Calculation: Summation `+`, Subtraction `-`, Multiplication `*`, Division `/`

## ইউজারের কাছ থেকে ইনপুট নেওয়া (Taking input from the user)

- `Scanner` class
  - `Scanner.nextInt()`
  - `Scanner.nextDouble()`
  - `Scanner.next()`

## আইডেন্টিফায়ার (Identifier)

- Identifier লেখার নিয়ম:
  1. Identifier এ বর্ণ (character), সংখ্যা (digit), আন্ডারস্কোর (\_) ও ডলার ($) চিহ্ন থাকতে পারে।
  2. একটি Identifier সাধারনত শুরু হয় বর্ণ (character), আন্ডারস্কোর (\_) বা ডলার ($) সাইন দিয়ে। তবে কোনোভাবেই সংখ্যা দিয়ে শুরু হতে পারে না।
  3. এগুলো কোন সংরক্ষিত (reserved) জাভা কিওয়ার্ড (Keyword) হতে পারে না।
  4. Identifier যেকোনো দৈর্ঘ্যের হতে পারে।
- জাভা একটি কেস সেনসিটিভ (case sensitive) প্রোগ্রামিং ভাষা। এর অর্থ Main, main অথবা MAIN আলাদা Identifier।

## ভেরিয়েবল (Variable)

- Data type
  1. byte, short, int, long
  2. float, double
  3. char
  4. boolean
- ভেরিয়েবলের নাম নির্ধারণের আরো কয়েকটি নিয়ম:
  1. ভেরিয়েবলের নামগুলোতে সাধারণত camelCase ব্যবহার করা হয়।
  2. নামগুলো অর্থপূর্ণ হতে হয়।
  3. এগুলো সাধারণত বিশেষ্য (noun) পদের হয়।
- Identifier Name Casing
  1. `theVariableName` -> camelCase (Allowed in Java)
  2. `TheVariableName` -> PascalCase or UpperCamelCase
  3. `the_variable_name` -> snake_case
  - `THE_VARIABLE_NAME` -> CONSTANT (Allowed in Java)
- কোডিং কনভেনশন (Coding Convention)

## অ্যাসাইনমেন্ট (Assignment)

- Assignment operator: `=`

## কমেন্ট (Comments)

- জাভায় তিন ভাবে কমেন্ট করা যায়:
  1. Single-line Comments `//`
  2. Multiline Comments `/* ... */`
  3. Javadoc Comments

## অনুশীলনী (Exercise)

1. Summation, Subtraction, Multiplication, Division
2. Printing Ascii
3. Print Ascii Pattern
4. Java Ascii art
5. Area of Rectangle, Range of Rectangle
6. Area of Hexagon
7. Distance Between Two Point
8. Sum of point in Game
9. Area of Cube
10. Radians to Degrees
