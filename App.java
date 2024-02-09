/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.fibonacci;

/**
 *
 * @author Dell-User
 */

import java.util.Scanner;
public class App {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input the number of terms for Fibonacci sequence
        System.out.print("Enter the number of terms for Fibonacci sequence: ");
        int numTerms = scanner.nextInt();
        
        // Generate and display Fibonacci sequence
        System.out.println("Fibonacci sequence up to " + numTerms + " terms:");
        int firstTerm = 0;
        int secondTerm = 1;
        
        for (int i = 0; i < numTerms; i++) {
            System.out.print(firstTerm + " ");
            int nextTerm = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = nextTerm;
        }
        
        scanner.close();
    }
}
