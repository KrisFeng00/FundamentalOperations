package company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("program on ,code 0 to exit");
        String str = scanner.nextLine();
        while (!str.equals("0")){
            Controller controller = new Controller();
            controller.textCon(str);
            str = scanner.nextLine();
        }
        System.out.println("program off");
    }
}
