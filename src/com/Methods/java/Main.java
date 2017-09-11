package com.Methods.java;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Using a method allow a user to calculate area of various shapes
        String Output;
        String input;
        double variable1;
        double variable2;
        double variable3;
        double solution;

        Scanner sc = new Scanner(System.in);
        int NumberEntered;
        boolean end = false;

        while (end == false) {
            System.out.println("Choose a shape to calculate the area on:");
            System.out.println("1. Rectangle");
            System.out.println("2. Square");
            System.out.println("3. Triangle");
            System.out.println("4. Trapezoid");
            System.out.println("5. Exit");
            System.out.println("Enter a number: ");
            input = sc.nextLine();
            NumberEntered = Integer.parseInt(input);

            switch (NumberEntered) {
                case 1:
                    System.out.println("Enter the width of the rectangle: ");
                    input = sc.nextLine();
                    variable1 = Double.parseDouble(input);
                    System.out.println("Enter the height of the rectangle: ");
                    input = sc.nextLine();
                    variable2 = Double.parseDouble(input);
                    solution = RectangleMethod(variable1, variable2);
                    Output = "The area of the rectangle is " + Double.toString(solution);
                    break;
                case 2:
                    System.out.println("Enter the length of one side of the square: ");
                    input = sc.nextLine();
                    variable1 = Double.parseDouble(input);
                    solution = SquareMethod(variable1);
                    Output = "The area of the square is " + Double.toString(solution);
                    break;
                case 3:
                    System.out.println("Enter the width of the base of the triangle: ");
                    input = sc.nextLine();
                    variable1 = Double.parseDouble(input);
                    System.out.println("Enter the height of the triangle: ");
                    input = sc.nextLine();
                    variable2 = Double.parseDouble(input);
                    solution = TriangleMethod(variable1, variable2);
                    Output = "The area of the triangle is " + Double.toString(solution);
                    break;
                case 4:
                    System.out.println("Enter the width of the bottom of the trapezoid: ");
                    input = sc.nextLine();
                    variable1 = Double.parseDouble(input);
                    System.out.println("Enter the width of the top of the trapezoid: ");
                    input = sc.nextLine();
                    variable2 = Double.parseDouble(input);
                    System.out.println("Enter the height of the trapezoid: ");
                    input = sc.nextLine();
                    variable3 = Double.parseDouble(input);
                    solution = TrapezoidMethod(variable1, variable2, variable3);
                    Output = "The area of the trapezoid is " + Double.toString(solution);
                    break;
                case 5:
                    Output = "Exiting...";
                    end = true;
                    break;
                default:
                    Output = "Invalid entry. Please enter a number between 1 and 5.";
            }


            System.out.println(Output);
        }
    }

    public static double RectangleMethod(
            double width,
            double height){
            double answer = (width * height);
            return answer;
    }

    public static double SquareMethod(
            double side){
            double answer = (side * side);
            return answer;
    }

    public static double TriangleMethod(
            double width,
            double height){
            double answer = .5 * (width * height);
            return answer;
    }

    public static double TrapezoidMethod(
            double topwidth,
            double bottomwidth,
            double height){
            double answer = .5 * (topwidth + bottomwidth) * height;
            return answer;
    }
}