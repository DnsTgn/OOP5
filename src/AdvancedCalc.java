import java.util.Scanner;

public class AdvancedCalc extends OrdinaryCalc{
    public AdvancedCalc(int mode) {
        super(mode);
        if(mode==2) {
            while (true) {
                String menu = "Choose opertion:\n \t[1] - ADD\n \t[2] - SUB\n \t[3] - MUL\n \t[4] - DIV\n \t[5] - EXP\n \t[6] - COS\n \t[7] - EXIT";
                System.out.println(menu);
                Scanner in = new Scanner(System.in);
                int operation = in.nextInt();
                if(operation == 7)break;
                if (operation > 4) {
                    EnterNums(2);
                } else {
                    EnterNums(1);
                }
                String result = "";
                switch (operation) {
                    case 1:
                        result = Add();
                        break;
                    case 2:
                        result = Sub();
                        break;
                    case 3:
                        result = Mul();
                        break;
                    case 4:
                        result = Div();
                        break;
                    case 5:
                        result = Exp();
                        break;
                    case 6:
                        result = COS();
                        break;
                    default:
                        System.out.println("Operation error!");
                }

                PrintResult(result);
            }
        }
    }
    public String Exp(){
        if(num1>=-5 && num1<=5) {
            return Double.toString(Math.exp(num1));
        }else {
            return "The entered data is out of bounds [-5;5]";
        }
    }
    public String COS(){
        if(num1>=0 && num1<=360) {
            return Double.toString(Math.cos(num1*0.0174533));
        }else {
            return "The entered data is out of bounds [0;360]";
        }
    }

}
