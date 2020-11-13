/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Calculator;

/**
 *
 * @author mihailmihaylov
 */
public class Calc {
    double firstNumber, secondNumber;
    
    public Calc(double x, double y){
        firstNumber = x;
        secondNumber = y;
    };
    public void combine(){
        double finalValue = firstNumber + secondNumber;
        System.out.println(firstNumber + " + " + secondNumber + " = " + finalValue);
    };
    public void separate(){
        double finalValue = firstNumber - secondNumber;
        System.out.println(firstNumber + " - " + secondNumber + " = " + finalValue);
    };
    public void multiply(){
        double finalValue = firstNumber * secondNumber;
        System.out.println(firstNumber + " * " + secondNumber + " = " + finalValue);
    };
    public void devide(){
        try {
            double finalValue = firstNumber / secondNumber;
            System.out.println(firstNumber + " / " + secondNumber + " = " + finalValue);
        } catch (ArithmeticException ex) {
            System.out.print("You cannot devide by ZERO!");
        }   
    };
}
