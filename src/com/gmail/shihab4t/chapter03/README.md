# অধ্যায় ০৩ - ডেটা টাইপ, অপারেটর ও এক্সপ্রেশন

## ডেটা টাইপ (Data Types)

- জাভাতে এই টাইপগুলো দুই রকমের -
  1. Primitive type
  2. Reference type
- জাভাতে ৮ রকমের Primitive type রয়েছে। এগুলো হলো: `byte`, `boolean`, `char`, `short`, `int`, `long`, `float` ও `double`
- জাভা একটি Statically Typed Language
- Statically Typed Language(C, C++, Java) vs Dynamically Typed Language (Python, JavaScript, Ruby)
- Type Stored data and memory size:
  - Integer Number: Most Used -> `int`
    1. `byte`<- 8 bit/1 byte
    2. `short` <- 16 bit/2 byte
    3. `int` <- 32 bit/4 byte
    4. `long` <- 64 bit/8 byte
  - Floating Point Number: Most Used -> `double`
    1. `float` <- 32 bit/4 byte with up to 7 decimal point
    2. `double` <- 64 bit/ 8 byte with up to 15 decimal point
  - Unicode's characters:
    1. `char` <- 16 bit/2 byte
  - Boolean:
    1. `boolean`
- https://en.wikipedia.org/wiki/List_of_Unicode_characters
- https://docs.oracle.com/javase/specs/jvms/se16/html/jvms-2.html
- Number rounding
  1. Rounding Up: 23.447 -> 23.45
  2. Rounding Down: 10.234 -> 10.23
- Wrapper type: `Byte`, `Boolean`, `Character`, `Short`, `Integer`, `Long`, `Float` and `Double`
- Primitive type and Reference type conversion called **Automatic Conversion**.
  - Primitive type to Reference type conversion called **Autoboxing**
  - Reference type to Primitive type conversion called **unboxing**
- Primitive type গুলোর default মান থাকে:
  1. `byte`, `short`, `int` -> 0
  2. `long` -> 0L;
  3. `float` -> 0.0fলিটারেল (Literal)
  4. `double` -> 0.0d
  5. `char` -> '\u0000'
  6. `boolean` -> false
- Variable কয়েক রকমের হয়: Local variable, Field, Parameter;
- Primitive type এর default মান গুলো শুধু Field এর ক্ষেত্রেই কাজ করে।

## লিটারেল (Literal)

- Integer Literal
  - long variable value will be ended with `L` or `l`
  - Hex Decimal value Start with `0x`;
  - Binary Value Start with `0b`
  - Octal Value Start with `0`
- Floating-point Literal
  - Floating-point with Scientific notation: `6.67408E-11` or `6.67408e-11`;
  - float variable value will be ended with `F` or `f`
- Character and String Literal
  - char wrapped with `''` (Single quote)
  - String wrapped with `""` (Double quote)
  - char and String support unicode character
- Use Underscore in Numeric Literal
  - `int number = 1_000_00; // 1 million`
- Escape Sequence
  - Control character called Escape Sequence
  - Some Escape Sequence: `\n`, `\r`, `\t`, `\"`, `\'`, `\\`
- Text Block in Java15

## অপারেটর (Operator)

- Assignment Operator: `=`
- Arithmetic Operator: `+`, `-`, `*`, `/`, `%`
- Conditional Statement: `if`, `else`
- Integer and Floating Point Division
- Rounding Error
- Overflow Underflow
- Data type Minimum and Maximum Values
- Representation of Real numbers in Computer
  - There are meanly two-way storing the real numbers
    1. Fixed-point Representation
    2. Floating-point Representation
  - Floating-point storing in java follows the `IEEE Standard 754`
  - IEEE Standard 754 says, a number should have 3 part
    1. sign bit
    2. exponent
    3. mantissa
  - Some IEEE Standard 754 values
    1. Zero (0): -0, +0
    2. Infinity
    3. Not a Number (NaN)
- Java String Operation
  - String Concatenation (with `+` concatenation operator)
- Equality and Relational Operators
  1. `==`: equal to
  2. `!=`: not equal to
  3. `>`: greater than
  4. `>=`: greater than or equal to
  5. `<`: less than
  6. `<=`: less than or equal to
  - Boolean Expression
- Logical Operators
  1. `!`: not
  2. `&&`: and
  3. `||`: or
  4. `^`: Exclusive or
  - Swap Two variable with Exclusive or operator (`^`)
- Unary Operators
  1. `++`
  2. `--`
  3. `+`
  4. `-`
  5. `!`
  6. `*=`
  7. `-=`
  - post increment `a++`
  - pre-increment `++a`
- Type Conversion / Type Casting
  - Widening primitive conversion
    1. `byte` -> `short`, `int`, `long`, `float`, `double`
    2. `short` -> `int`, `long`, `float`, `double`
    3. `int` -> `long`, `float`, `double`
    4. `long` -> `float`, `double`
    5. `float` -> `double`
  - Narrowing primitive Conversion
    1. `short` -> `byte`, `char`
    2. `char` -> `byte`, `short`
    3. `int` -> `byte`, `short`, `char`
    4. `long` -> `byte`, `short`, `char`, `int`
    5. `float` -> `byte`, `short`, `char`, `int`, `long`
    6. `double` -> `byte`, `short`, `char`, `int`, `long`, `float`

## এক্সপ্রেশন (Expression)

- Expression
- Compound Expression
- Use parenthesis clearing the Compound Expression

## অপারেটর অগ্রাধিকার (Operator Precedence)

- Operator Precedence
  | Operators | Precedence | Associativity |
  | :---------------------------------------- | :----------------------------------------------------------- | :------------ |
  | parenthesis | `()` | left to right |
  | postfix increment and decrement | `expr++` `expr--` | left to right |
  | prefix increment and decrement, and unary | `++expr` `--expr` `+expr` `-expr` `~` `!` | right to left |
  | multiplicative | `*` `/` `%` | left to right |
  | additive | `+` `-` | left to right |
  | shift | `<<` `>>` `>>>` | left to right |
  | relational | `<` `>` `<=` `>=` `instanceof` | left to right |
  | equality | `==` `!=` | left to right |
  | bitwise AND | `&` | left to right |
  | bitwise exclusive OR | `^` | left to right |
  | bitwise inclusive OR | `|` | left to right |
  | logical AND | `&&` | left to right |
  | logical OR | `||` | left to right |
  | ternary | `? :` | right to left |
  | assignment | `=` `+=` `-=` `*=` `/=` `%=` `&=` `^=` `|=` `<<=` `>>=` `>>>=` | right to left |

## স্টেটমেন্ট, ব্লক ও ভ্যারিয়েবল স্কোপ (Statement, Block and Scope of Variable)

- Statement
  - "unit of code" which end with semicolon
  - Expressional statement
- Block
  - 0 or more statement rape up with a Curly braces
- Scope of a Variable

## অনুশীলনী (Exercise)

- DecimalFormat Class

1. All Equal
2. Average
3. BMI (Body Mass Index)
4. Area Of Triangle with Given Coordinate Point
5. Prediction
6. Speed Calculator
7. Triangle
8. Sum of Digits
9. Exchange To Dollar
10. Bkash CashOut System
11. Sum, Average, Percentage
12. Character Identifier
13. Print Last Digit of a number
14. Postpaid Charge Calculator `not solved`
15. Is a number divisible by 5 and 6
16. Calculate time need buying car
17. Second to Hour, Minutes and Second
18. Is possible split the pizza fairly
19. Is the rectangle can fit inside the circle
