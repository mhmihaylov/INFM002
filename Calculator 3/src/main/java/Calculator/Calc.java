package Calculator;

public class Calc {
    double firstNumber, secondNumber;
    
    public Calc(double firstNumber, double secondNumber){
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
    }
    public void combine(){
        double finalValue = firstNumber + secondNumber;
        System.out.println(firstNumber + " + " + secondNumber + " = " + finalValue);
    }
    public void separate(){
        double finalValue = firstNumber - secondNumber;
        System.out.println(firstNumber + " - " + secondNumber + " = " + finalValue);
    }
    public void multiply(){
        double finalValue = firstNumber * secondNumber;
        System.out.println(firstNumber + " * " + secondNumber + " = " + finalValue);
    }
    public void devide(){
        try {
            double finalValue = firstNumber / secondNumber;
            System.out.println(firstNumber + " / " + secondNumber + " = " + finalValue);
        } catch (ArithmeticException ex) {
            System.out.print("You cannot devide by ZERO!");
        }   
    }
}
