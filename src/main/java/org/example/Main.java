package org.example;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try{
            Scanner inp = new Scanner(System.in);
            int n1,n2;
            System.out.println("Input the number: ");
            n1 = inp.nextInt();
            n2 = inp.nextInt();
            int div = n1/n2;
            System.out.println("Your divison results: " + div);
        } catch (Exception e){
            System.out.println("The number divided by zero");
        } finally {
            System.out.println("The 'try catch' is finished");
        }
    }
}
