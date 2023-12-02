package HMOOP7JAVA.history;
import java.io.*;
public class Reading {
    public  Reading() throws IOException {
        File myFile = new File("text.txt");
        BufferedReader reader = new BufferedReader(new FileReader(myFile));
        String line;
        System.out.println("Просмотр истории: ");
        System.out.println("*".repeat(45));
        while ((line = reader.readLine()) != null) {
            System.out.println(line);
        }
    }
}
