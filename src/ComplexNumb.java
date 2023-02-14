import java.util.InputMismatchException;
import java.util.Scanner;

import static java.lang.Math.*;

public class ComplexNumb {
    private double real, imag;

    public ComplexNumb(){
        this.real=0;
        this.imag=0;
    }
    public ComplexNumb(double a, double b){
        this.real=a;
        this.imag=b;
    }
    public ComplexNumb(double x){
        this.real=x;
        this.imag=0;
    }

    public void setReal(double x){
        this.real=x;
    }
    public void setImag(double x){
        this.imag=x;
    }
    public double getReal() {
        return real;
    }
    public double getImag() {
        return imag;
    }
    public void setComlexNumber(){
        try {
            System.out.print("Enter real and imaginary part of complex number: ");
            Scanner console = new Scanner(System.in);
            this.setReal(console.nextDouble());
            this.setImag(console.nextDouble());
        }catch (InputMismatchException e){
            System.out.println("You have entered a non numeric field value.\nWrong values do not set");
        }
    }
    public void Print(){
        System.out.print(this.real+"+"+this.imag+"i");
    }
    public ComplexNumb add(ComplexNumb a){
        return (new ComplexNumb(this.real+a.real, this.imag+a.imag));
    }
    public ComplexNumb multiply(ComplexNumb a){
        return (new ComplexNumb(this.real*a.real-this.imag*a.imag, this.real*a.imag+this.imag*a.real));
    }
    public void PrintTrig(){
        double z=sqrt(pow(this.real, 2)+pow(this.imag, 2));
        double a=acos(this.real/abs(z));
        System.out.format("%.3f(cos(%.3f)+i*sin(%.3f))", z, a, a);
    }
}
