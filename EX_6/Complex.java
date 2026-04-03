import java.util.Scanner;

class Complex {
    double real, imag;

    Complex(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }

    Complex add(Complex c) {
        double r = this.real + c.real;
        double i = this.imag + c.imag;
        return new Complex(r, i);
    }

    Complex subtract(Complex c) {
        double r = this.real - c.real;
        double i = this.imag - c.imag;
        return new Complex(r, i);
    }

    void display() {
        System.out.println(this.real + " + " + this.imag + "i");
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Real and Imaginary parts for C1: ");
        Complex c1 = new Complex(sc.nextDouble(), sc.nextDouble());

        System.out.print("Enter Real and Imaginary parts for C2: ");
        Complex c2 = new Complex(sc.nextDouble(), sc.nextDouble());

        Complex sum = c1.add(c2);
        Complex diff = c1.subtract(c2);

        System.out.print("Sum: ");
        sum.display();

        System.out.print("Difference: ");
        diff.display();
    }
}