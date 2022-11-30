import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (true) {
            System.out.println("Choose the mode:\n \t[1] - Ordinary\n \t[2] - Advanced\n \t[3] - Exit");
            int mode = in.nextInt();// обработку
            if (mode == 1) {
                new OrdinaryCalc(mode);
            } else if (mode == 2) {
                new AdvancedCalc(mode);
            }else if (mode == 3) {
                System.out.println("Exit . . .");
                break;
            } else {
                System.out.println("Mode error!");
            }
        }
    }

}