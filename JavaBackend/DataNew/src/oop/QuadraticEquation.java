package oop;

public class QuadraticEquation {

    private double a;
    private double b;
    private double c;


    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    private double getDiscriminant() {
        return (b * b - 4 * a * c);
    }

    public double getRoot1() {
        return(-b + Math.sqrt(getDiscriminant()))/(2*a);
    }

    public double getRoot2() {
        return(-b - Math.sqrt(getDiscriminant()))/(2*a);
    }
    public  void  calculate() {
        double delta = getDiscriminant();
        if(delta > 0) {
            System.out.println("x1 =" + getRoot1() + ";x2 =" + getRoot2());
        }
        if(delta == 0) {
            System.out.println("x1=x2 = " + getRoot1());
        }
        if(delta < 0) {
            System.out.println("The equation has no roots");
        }
    }
    public static void main(String[] args) {
        QuadraticEquation quadraticEquation = new QuadraticEquation(1, 2, 1);
        quadraticEquation.calculate();
    }
}



