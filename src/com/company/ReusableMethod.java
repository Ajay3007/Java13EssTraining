package com.company;

import java.util.Scanner;

public class ReusableMethod {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.println("Division calculator: ");

        double d1 = getInput(scanner);

        double d2 = getInput(scanner);

        var res = d1/d2;
        System.out.println(String.format("Result is %.3f" , res));

    }

    private static double getInput(Scanner scanner) {
        System.out.print("Enter number: ");
        return scanner.nextDouble();
    }
}
