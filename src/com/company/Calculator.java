package com.company;

import com.company.utilities.CalcHelper;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);

        double d1 = 0;
        double d2 = 0;
        try {
            d1 = getInput(scanner, "Enter 1st number: ");

            d2 = getInput(scanner, "Enter 2nd number: ");
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.print("Select an operation (+ - * /): ");
        var op = scanner.next();

        double res = 0;

        switch (op){
            case "+":
                res = CalcHelper.addValues(d1, d2);
                break;
            case "-":
                res = CalcHelper.subtractValues(d1, d2);
                break;
            case "*":
                res = CalcHelper.multiplyValues(d1, d2);
                break;
            case "/":
                res = CalcHelper.divideValues(d1, d2);
                break;
            default:
                System.out.println("You didn't chose a valid operator");
        }

        System.out.println(String.format("Result is %.2f" , res));
    }

    private static double getInput(Scanner scanner, String ip) {
        System.out.print(ip);
        return scanner.nextDouble();
    }
}
