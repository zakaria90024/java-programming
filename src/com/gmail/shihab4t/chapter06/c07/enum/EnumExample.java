package com.gmail.shihab4t.chapter06.C07Enum;

public class EnumExample {

    public void displayDay(Day day) {
        if (day == Day.SATURDAY) {
            System.out.println("Its saturday! Weekend!");
        } else if (day == Day.FRIDAY) {
            System.out.println("It's friday!! Weekend!");
        } else {
            System.out.println("Weekday!");
        }
    }

    public void displayDayWithSwitchStatement(Day day) {
        switch (day) {
            case SATURDAY:
                System.out.println("Its saturday! Weekend!");
                break;
            case FRIDAY:
                System.out.println("It's friday!! Weekend!");
                break;
            default:
                System.out.printf("Weekday!");
                break;
        }
    }

    public static void main(String[] args) {
        EnumExample enumExample = new EnumExample();
        Day day = Day.SATURDAY;
        enumExample.displayDay(day);
    }
}
