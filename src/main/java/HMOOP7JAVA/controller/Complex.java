package HMOOP7JAVA.controller;
import HMOOP7JAVA.data.Imaginary;
import HMOOP7JAVA.data.Real;
public class Complex {
    Imaginary imaginary = new Imaginary();
    Real real = new Real();
    public Complex(String complex){
        String[] complex1 = complex.split("\\+");
        if(complex1.length!=2){
            complex1 = complex.split("\\-");
            imaginary.setImaginary("-"+complex1[1]);
        }else {
            imaginary.setImaginary(complex1[1]);
        }
        real.setReal(Double.parseDouble(complex1[0]));
    }

    public Imaginary getImaginary() {
        return imaginary;
    }

    public void setImaginary(Imaginary imaginary) {
        this.imaginary = imaginary;
    }

    public Real getReal() {
        return real;
    }

    public void setReal(Real real) {
        this.real = real;
    }
}