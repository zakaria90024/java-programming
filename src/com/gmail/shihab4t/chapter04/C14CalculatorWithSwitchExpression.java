package com.gmail.shihab4t.chapter04;

import java.util.Scanner;

public class C14CalculatorWithSwitchExpression {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Choose an operator: +, -, * or / : ");
        char operator = input.next().charAt(0);

        System.out.print("Enter first number: ");
        int number1 = input.nextInt();
        System.out.print("Enter second number: ");
        int number2 = input.nextInt();

        int result = switch (operator) {
            case '+' -> number1 + number2;
            case '-' -> number1 - number2;
            case '*' -> number1 * number2;
            case '/' -> number1 / number2;
            default -> {
                System.out.println("Invalid operator!");
                yield 0;
            }
        };

        System.out.println("Result = " + result);
    }
}
