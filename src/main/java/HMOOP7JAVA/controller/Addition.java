package HMOOP7JAVA.controller;
public class Addition{
    protected Complex complex;
    protected Complex complex2;
    protected double real;
    protected double real2;
    protected Double imagenaryDouble;
    protected String str;
    protected Double num;
    public Addition(String expression,String expression2){
        complex = new Complex(expression);
        complex2 = new Complex(expression2);
        real = complex.real.getReal();
        real2 = complex2.real.getReal();
        HMOOP7JAVA.controller.Adaptr adaptr = new HMOOP7JAVA.controller.Adaptr(complex);
        HMOOP7JAVA.controller.Adaptr adaptr2 = new HMOOP7JAVA.controller.Adaptr(complex2);
        real = real + real2;
        imagenaryDouble = adaptr.getImaginary().getImagunaryDouble()+adaptr2.getImaginary().getImagunaryDouble();
        if(imagenaryDouble<0){
            imagenaryDouble=imagenaryDouble*(-1);
            str = (real+" - "+imagenaryDouble+"i");
        }else {
            str = (real+" + "+imagenaryDouble+"i");
        }
    }
    public String getStr() {
        return str;
    }
    public double getReal() {
        return real;
    }
    public Double getImagenaryDouble() {
        return imagenaryDouble;
    }
}
