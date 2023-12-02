package HMOOP7JAVA.view;
import HMOOP7JAVA.controller.Calculator;
import HMOOP7JAVA.history.History;
import java.io.IOException;
public class View {
    protected  String str;
    public View(String s, String expression, String expression2,String data) throws IOException {
        Calculator calculator = new Calculator(s,expression,expression2);
        str=calculator.getStr();
        str=str.replace(".0","").replace(" + 0i","").replace(" - 0i","");
        System.out.println("Действие:("+expression+") "+s+" ("+expression2+")");
        System.out.println("Результат:" + str);
        try {
            History history = new History(s,expression,expression2,str,data);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public String getStr() {
        return str;
    }
}