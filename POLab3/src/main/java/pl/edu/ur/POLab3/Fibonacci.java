/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.ur.POLab3;

/**
 *
 * @author DiLLu
 */
public class Fibonacci {
    
    public static void main(String args[]){
        int n1 = 0, n2 = 1, n3, i, x = 25;
        System.out.print(n1 + " " + n2); //Wyświetlenie 0 oraz 1
        
        for (i = 2; i < x; ++i) // Zaczyna się od 2 bo 0 i 1 już są wypisane
        {
            n3 = n1 + n2;
            System.out.print(" " + n3); //" " potrzebne jest, żeby był odstęp
            n1 = n2;
            n2 = n3;
        }
    }
    
}