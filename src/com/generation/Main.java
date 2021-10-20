package com.generation;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner console = new Scanner( System.in);
        System.out.print("Enter addition number 1  ");
        int numero1 = console.nextInt();
        System.out.print("Enter addition number 2  ");
        int numero2 = console.nextInt();
        int addition = numero1 + numero2;
        System.out.println( "suma " + numero1+" + "+numero2+" = "+ addition);
        int subtraction = numero1 - numero2;
        System.out.println( "resta " + numero1 + " - " + numero2 + " = " + subtraction);
        int multiplication = numero1 * numero2;
        System.out.println( "multiplicacion " + numero1 + " * " + numero2 +" = "+ multiplication);
        int division = numero1 / numero2;
        System.out.println("division " + numero1 + " / " + numero2 +" = " + division);


    }


}
