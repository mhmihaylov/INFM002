package Calculator;
import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        

        Scanner scr = new Scanner(System.in);
        while (true) {            
            
            
            System.out.println("Please select the number of the operator:");
            System.out.println("1. Combine");
            System.out.println("2. Separate");
            System.out.println("3. Multiply");
            System.out.println("4. Devide");
            System.out.println("5. Exit");

            int operator = scr.nextInt();

            if(operator<1 || operator>5){
                System.out.println("You have selected an unexisting operator " + operator);
                System.out.println();
                continue;
            } else if(operator == 5){
                break;
            } else {
               System.out.println("Please please choose the first number: ");

                double firstNumber = scr.nextDouble();

                System.out.println("Please please choose the second number: ");

                double secondNumber = scr.nextDouble();

                Calc calc= new Calc(firstNumber, secondNumber);

                switch(operator){
                    case 1 -> calc.combine();
                    case 2 -> calc.separate();
                    case 3 -> calc.multiply();
                    case 4 -> calc.devide();
                }
                System.out.println();
            }
        }
    }
    
}
