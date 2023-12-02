package HMOOP7JAVA.controller;
import HMOOP7JAVA.data.Imaginary;
import java.util.ArrayList;
import java.util.List;
public class Adaptr {
    protected Imaginary imaginary = new Imaginary();
    protected String NewStringComplex;
    public Adaptr(Complex complex){
        this.imaginary = complex.getImaginary();
        String[] num = imaginary.toString().split("\\*");
        imaginary.setImagunaryDouble(Double.parseDouble(num[0]));
        imaginary.setImaginaryString(num[1]);
    }
    public Adaptr(String complex){
        String[] str = complex.split("");
        int count = 0;
        ArrayList arrayList = new ArrayList(List.of(str));
        for (int i = 0; i < arrayList.size(); i++) {
            if ("+".equalsIgnoreCase((String) arrayList.get(i))){
                complex=complex.replace("+","-");
                count=1;
            }
        }
        if(count==0){
            complex=complex.replace("-","+");
        }
        this.NewStringComplex=complex;
    }
    public String getNewStringComplex() {
        return NewStringComplex;
    }
    public void setNewStringComplex(String newStringComplex) {
        NewStringComplex = newStringComplex;
    }
    public Imaginary getImaginary() {
        return imaginary;
    }
    public void setImaginary(Imaginary imaginary) {
        this.imaginary = imaginary;
    }
}
