package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    // opgave 2
    Scanner temp = new Scanner(System.in);
    System.out.println("skriv en temperatur i celsius.");
    double userTemp = temp.nextInt();
    System.out.println("du skrev temperaturen: "+userTemp+" celsius.");
    System.out.println((userTemp*9/5+32)+" F");
    }
}
