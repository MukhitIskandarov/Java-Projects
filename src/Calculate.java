import java.util.Scanner;

/**
 * Created by Мухит on 19.10.2015.
 */
public class Calculate {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        try{
            Calculator calculator = new Calculator();
            String  exit = "no";

            while (!exit.equals("yes")){
                System.out.println("Enter first arg : ");
                int first = Integer.valueOf(scan.next());
                System.out.println("Enter second arg : ");
                int second = Integer.valueOf(scan.next());
                System.out.println("Enter one operation like '+' or '-' or '*' or '/'  : ");
                String operation = scan.next();
                switch (operation) {
                    case "+":
                        calculator.add(first, second);
                        System.out.println("Result = " + calculator.getResult());
                        break;
                    case "-":
                        calculator.sub(first, second);
                        System.out.println("Result = " + calculator.getResult());
                        break;
                    case "*":
                        calculator.mul(first, second);
                        System.out.println("Result = " + calculator.getResult());
                        break;
                    case "/":
                        calculator.div(first, second);
                        System.out.println("Result = " + calculator.getResult());
                        break;
                    default:
                        System.out.println("args = [" + args + "]");
                        break;
                }
                calculator.cleanResult();
                System.out.println("Exit : yes/no");
                exit = scan.next();
            }
        }
        finally {
            scan.close();
        }
    }
}
