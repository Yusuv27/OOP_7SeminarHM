package HMOOP7JAVA.controller;
public class Division {
    protected HMOOP7JAVA.controller.Complex complex;
    protected HMOOP7JAVA.controller.Complex complex2;
    protected HMOOP7JAVA.controller.Complex complex3;
    protected double real;
    protected double real2;
    protected String numerator;
    protected Double denominator;
    protected String str;
    protected Double num;
    protected Double numi;
    public Division(String expression,String expression2){
        complex = new HMOOP7JAVA.controller.Complex(expression);
        complex2 = new HMOOP7JAVA.controller.Complex(expression2);
        HMOOP7JAVA.controller.Adaptr adaptr = new HMOOP7JAVA.controller.Adaptr(complex);
        HMOOP7JAVA.controller.Adaptr adaptr2 = new HMOOP7JAVA.controller.Adaptr(complex2);
        HMOOP7JAVA.controller.Adaptr adaptr3 = new HMOOP7JAVA.controller.Adaptr(expression2);
        complex3= new HMOOP7JAVA.controller.Complex(adaptr3.getNewStringComplex());
        real = complex.real.getReal();
        real2 = complex2.real.getReal();
        Multiplication multiplication = new Multiplication(expression,adaptr3.getNewStringComplex());
        numerator=multiplication.getStr();
        denominator= real2*real2+(adaptr2.imaginary.getImagunaryDouble()*(-1));
        num = multiplication.getNum();
        numi = multiplication.getNumi();
        num = num/denominator;
        numi = numi/denominator;
        str = num+" + "+numi+"i";
    }
    public String getStr() {
        return str;
    }
    public String getNumerator() {
        return numerator;
    }
    public Double getDenominator() {
        return denominator;
    }
}
