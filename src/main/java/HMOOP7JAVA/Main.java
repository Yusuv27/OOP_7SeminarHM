import HMOOP7JAVA.history.Reading;
import HMOOP7JAVA.view.View;

import java.io.IOException;
import java.util.Date;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) throws IOException {
        while (true){
            Scanner scanner = new Scanner(System.in);
            Date date = new Date();
            System.out.println("Доступные функции: \n1.Решить пример из комплекстных чисел\n2.Посмотреть историю действий.");
            String menu = scanner.nextLine();
            if(menu.equalsIgnoreCase("1")){
                System.out.println("Суммирование: +\nУмножение: *\nДеление: /\nВведите операцию которую хотите совершить над комплексными числами:");
                String symbol = scanner.nextLine();
                System.out.println("Пример комплексного числа: 10+10*i либо 10-1*i\nВведите первое комплексное число аналогично примеру: ");
                scanner = new Scanner(System.in);
                String expression = scanner.nextLine();
                System.out.println("Введите второе число аналогично примеру: ");
                scanner=new Scanner(System.in);
                String expression2 = scanner.nextLine();
                View view = new View(symbol,expression,expression2, date.toString());
            } else if (menu.equalsIgnoreCase("2")) {
                Reading reading = new Reading();
            }else{
                System.out.println("Такой функции нет!");
            }
            System.out.println("Продолжить работу?");
            scanner= new Scanner(System.in);
            String control = scanner.nextLine();
            if(control.equalsIgnoreCase("нет")){
                break;
            }
        }
    }
}