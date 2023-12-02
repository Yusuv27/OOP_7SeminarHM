package HMOOP7JAVA.data;

public class Imaginary {
    protected String imaginary;
    protected Double imagunaryDouble;
    protected String imaginaryString;

    public Double getImagunaryDouble() {
        return imagunaryDouble;
    }

    public void setImagunaryDouble(Double imagunaryDouble) {
        this.imagunaryDouble = imagunaryDouble;
    }

    public String getImaginaryString() {
        return imaginaryString;
    }

    public void setImaginaryString(String imaginaryString) {
        this.imaginaryString = imaginaryString;
    }

    public String getImaginary() {
        return imaginary;
    }

    public void setImaginary(String imaginary) {
        this.imaginary = imaginary;
    }


    @Override
    public String toString() {
        return " "+imaginary+" " ;
    }
}