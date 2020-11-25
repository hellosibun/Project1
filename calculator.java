/*This program will show demo on a simple calculator */
import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        float a,b,res;
        char choice;
        char ch;
        Scanner scan = new Scanner(System.in);

        do{
            System.out.println("1. ADD TWO NUMBERS");
            System.out.println("2. SUBTRACT TWO NUMBERS");
            System.out.println("3. MULTIPLICATION TWO NUMBERS");
            System.out.println("4. DIVISION TWO NUMBERS");
            System.out.println("5. EXIT\n");
            System.out.println("ENTER YOUR CHOICE : ");
            choice=scan.next().charAt(0);
            switch (choice) {
                case '1' :
                    System.out.println("Enter two Numbers : ");
                    a=scan.nextFloat();
                    b=scan.nextFloat();
                    res = a+b;
                    System.out.println("Result = "+res);
                    break;

                case '2' :
                    System.out.println("Enter two Numbers : ");
                    a=scan.nextFloat();
                    b=scan.nextFloat();
                    res = a-b;
                    System.out.println("Result = "+res);
                    break;

                case '3' :
                    System.out.println("Enter two Numbers : ");
                    a=scan.nextFloat();
                    b=scan.nextFloat();
                    res = a*b;
                    System.out.println("Result = "+res);
                    break;

                case '4' :
                    System.out.println("Enter two Numbers : ");
                    a=scan.nextFloat();
                    b=scan.nextFloat();
                    res = a/b;
                    System.out.println("Result = "+res);
                    break;

                case '5' :
                    System.exit(0);
                    break;

                default:
                    System.out.println("INVALID CHOICE !!!");
            }
            System.out.println("--------------------------------------");
        }while (choice!=5);
    }
}
