# অধ্যায় ০৪ – কনট্রোল ফ্লো (Control flow)

- জাভাতে তিন রকম কনট্রোল ফ্লো স্টেটমেন্ট রয়েছে। এগুলো হলো-
  1. Decision Making statement: if, if-else, switch
  2. Looping statement: for, while, do-while
  3. Branching statement: break, continue, return

## ডিসিশন মেকিং স্টেটমেন্ট (Decision Making Statement)

- if statement
  ```
  if (boolean-expression) {
    // statement
  }
  ```
- if else statement
  ```
  if (boolean-expression) {
    // statement
  } else {
    // statement
  }
  ```
- Nested If statement
  ```
  if (boolean-expression) {
    // statement
  } else if (boolean-expression) {
    // statement
  }
  ```
- Compare Floating Point number with Threshold, acceptable margin of error or epsilon
- Incremental development and testing
- Switch Statement
  ```
  switch (expression) {
    case value1:
      statement(s) 1;
      break;
    case value2:
      statement(s) 2;
      break;
    ..............
    case valueN;
      statement(s) n;
    default:
      statement(s)
  }
  ```
  - Free Fall
  - Switch Expression
    ```
    Type result = swtich(arg) {
      case L1 -> e1;
      case L2 -> e2;
      case L3 -> {
        statement;
        yield e3;
      }
      default -> e3;
    }
    ```

## লুপ (Loops)

- জাভাতে তিন প্রকার লুপ রয়েছে। এগুলো হলো: while লুপ, for লুপ, do while লুপ
- While loop
  - loop variable
  - infinite loop
  ```
  int i = 0; //loop variable
  while (i < 10 /*boolean-expression*/) {
    //body
    i++; // increment
  }
  ```
- For loop
  ```jshellla<nguage
  for (int i = 0; i < 10; i++) {
    // statement
  }
  ```
  - Nested For Loop
- Do-While loop
  - for and while loop called pre-test loop
  - do-while loop called post-test loop
  ```
  do {
    // loop body
  } while (boolean-expression);
  ```
- Break and Continue
  - break leaves a loop, continue jumps to the next iteration.

## অনুশীলনী (Exercise)
