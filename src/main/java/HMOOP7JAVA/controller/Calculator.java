package HMOOP7JAVA.controller;

public class Calculator {
    protected String str;
    public Calculator(String s,String expression,String expression2){
        if(s.equalsIgnoreCase("+")){
            HMOOP7JAVA.controller.Addition addition = new HMOOP7JAVA.controller.Addition(expression,expression2);
            str= addition.getStr();
        } else if (s.equalsIgnoreCase("*")) {
            Multiplication multiplication = new Multiplication(expression,expression2);
            str=multiplication.getStr();
        } else if (s.equalsIgnoreCase("/")) {
            Division division = new Division(expression,expression2);
            str=division.getStr();
        }else {
            str="Не верно указана операция!";
        }
    }

    public String getStr() {
        return str;
    }
}
