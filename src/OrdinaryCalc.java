import com.sun.xml.internal.ws.commons.xmlutil.Converter;

import java.io.Console;
import java.util.Scanner;

public class OrdinaryCalc {
    protected double num1;
    protected double num2;
    protected boolean isOrd = true;
    private boolean isHead = true;
    protected String Add(){
        return Double.toString(num1+num2);
    }
    protected String Sub(){
        return Double.toString(num1-num2);
    }
    protected String Mul(){
        return Double.toString(num1*num2);
    }
    protected String Div(){
        if(num2 != 0) {
            return Double.toString(num1 / num2);
        }else{
            return "Division by zero";
        }
    }
    protected void EnterNums(int mode){
        if(mode == 1){
            Scanner in = new Scanner(System.in);
            System.out.println("Enter num1:");
            this.num1 = in.nextDouble();
            System.out.println("Enter num2:");
            this.num2 = in.nextDouble();
        }else if (mode == 2){
            Scanner in = new Scanner(System.in);
            System.out.println("Enter num:");
            this.num1 = in.nextDouble();
        }
    }
    protected void PrintResult(String result) {
        System.out.println("= "+result);
    }

    public OrdinaryCalc(int mode) {
        Scanner in = new Scanner(System.in);
        if(mode == 1) {
            while(true) {
                String menu = "Choose opertion:\n \t[1] - ADD\n \t[2] - SUB\n \t[3] - MUL\n \t[4] - DIV\n \t[5] - EXIT";
                System.out.println(menu);
                int operation = in.nextInt();
                if(operation == 5)break;
                EnterNums(1);
                String result = "";
                boolean tmp = false;
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
                        tmp = true;
                        break;
                    default:
                        System.out.println("Operation error!");
                }
                if(tmp == true){
                    break;
                }
                PrintResult(result);
            }
        }
}
}
