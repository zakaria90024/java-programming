package com.gmail.shihab4t.chapter06;

class Bicycle {
    private int cadence = 0;
    private int speed = 0;
    private int gear = 1;

    public void changeCadence(int newValue) {
        cadence = newValue;
    }

    public void changeGear(int newValue) {
        gear = newValue;
    }

    public void speedUp(int increment) {
        speed += increment;
    }

    public void applyBrakes(int decrement) {
        speed -= decrement;
    }

    public void printStatus() {
        System.out.println("cadence: " + cadence +
                " speed: " + speed + " gear: "
                + gear);
    }
}

class BicycleDemo {
    public static void main(String[] args) {
        // Create two different Bicycle objects
        Bicycle bike1 = new Bicycle();
        Bicycle bike2 = new Bicycle();

        // call methods on those objects
        bike1.changeCadence(50);
        bike1.speedUp(10);
        bike1.changeGear(2);
        bike1.printStatus();

        bike2.changeCadence(50);
        bike2.speedUp(10);
        bike2.changeGear(2);
        bike2.changeCadence(40);
        bike2.speedUp(10);
        bike2.changeGear(3);
        bike2.printStatus();
    }
}


class ComplexNumber {
    private final double re; // the real part
    private final double im; // the imaginary parts

    public ComplexNumber(double re, double im) {
        this.re = re;
        this.im = im;
    }

    public ComplexNumber plus(ComplexNumber b) {
        double real = this.re + b.re;
        double imag = this.im + b.im;

        return new ComplexNumber(real, imag);
    }

    public ComplexNumber minus(ComplexNumber b) {
        double real = this.re - b.re;
        double imag = this.im - b.im;

        return new ComplexNumber(real, imag);
    }

    public String toString() {
        if (im == 0) return re + "";
        if (re == 0) return im + "i";
        if (!(im < 0)) return re + " + " + im + "i";
        return re + " - " + (-im) + "i";
    }
}

class ComplexNumberDemo {
    public static void main(String[] args) {
        ComplexNumber a = new ComplexNumber(5.0, 6.0);
        ComplexNumber b = new ComplexNumber(-3.0, 4.0);

        System.out.println("a            = " + a);
        System.out.println("b            = " + b);
        System.out.println("b + a        = " + b.plus(a));
        System.out.println("a - b        = " + a.minus(b));
    }
}


