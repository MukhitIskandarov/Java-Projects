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
                String first = scan.next();
                System.out.println("Enter second arg : ");
                String second = scan.next();
                calculator.add(Integer.valueOf(first), Integer.valueOf(second));
                System.out.println("Result = " + calculator.getResult());
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
