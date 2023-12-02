package HMOOP7JAVA.controller;
public class Multiplication {
    protected HMOOP7JAVA.controller.Complex complex;
    protected HMOOP7JAVA.controller.Complex complex2;
    protected double real;
    protected double real2;
    protected Double num;
    protected Double numi;
    protected String str;
    public Multiplication(String expression,String expression2){
        complex = new HMOOP7JAVA.controller.Complex(expression);
        complex2 = new HMOOP7JAVA.controller.Complex(expression2);
        real = complex.real.getReal();
        real2 = complex2.real.getReal();
        HMOOP7JAVA.controller.Adaptr adaptr = new HMOOP7JAVA.controller.Adaptr(complex);
        HMOOP7JAVA.controller.Adaptr adaptr2 = new HMOOP7JAVA.controller.Adaptr(complex2);
        num = (real*real2)+(adaptr.getImaginary().getImagunaryDouble()*adaptr2.imaginary.getImagunaryDouble()*(-1));
        numi=(real*adaptr2.getImaginary().getImagunaryDouble())+(adaptr.getImaginary().getImagunaryDouble()*real2);
        if(numi<0){
            numi=numi*(-1);
            str = num+" - "+numi+"i";
        }else{
            str = num +" + "+numi+"i";
        }
    }
    public String getStr() {
        return str;
    }
    public Double getNum() {
        return num;
    }
    public Double getNumi() {
        return numi;
    }
}
