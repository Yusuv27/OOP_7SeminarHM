package HMOOP7JAVA.history;
import java.io.*;

public class History {
    public History(String s, String expression, String expression2,String result,String data) throws IOException {
        File myFile = new File("text.txt");
        PrintWriter write = new PrintWriter(new BufferedWriter(new FileWriter(myFile,true)));
        write.println("Время: "+data.toString());
        write.println("Действие: ");
        if(s.equalsIgnoreCase("*")){
            write.print("   Умножение: ("+expression+") * ("+expression2+")");
        } else if (s.equalsIgnoreCase("+")) {
            write.print("   Суммирование: ("+expression+") + ("+expression2+")");
        } else if (s.equalsIgnoreCase("/")) {
            write.print("   Деление: ("+expression+") / ("+expression+")");
        } else {
            write.print(" Ошибка!");
        }
        write.println("\nРезультат: "+result);
        write.println("*".repeat(45));
        write.flush();
        write.close();
    }

}
