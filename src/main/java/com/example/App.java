package com.example;

import java.util.Scanner;

public class App {

  public static int multiply(int a, int b) {
    return a * b;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter first number: ");
    int a = sc.nextInt();

    System.out.print("Enter second number: ");
    int b = sc.nextInt();

    System.out.println("Multiplication Result = " + multiply(a, b));
    sc.close();
  }
}
