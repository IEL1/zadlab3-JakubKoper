/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.ur.POLab3;

import static java.lang.Math.pow;
import java.util.Scanner;

/**
 *
 * @author DiLLu
 */
public class RekurencjaIIteracja {
        public static int pot_rek(int x, int n) {
        if (n == 0) {
            return 1;
        } else if (n % 2 != 0) {
            return x * pot_rek(x, n - 1);
        } else {
            return (int) pow(pot_rek(x, n / 2), 2);
        }
    }
    public static int pot_ite(int x, int n) {
        int w = 1;
        while (n > 0) {
            if (n % 2 == 1) {
                w *= x;
            }
            x *= x;
            n /= 2;
        }
        return w;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Podaj liczbe: ");
        int x = sc.nextInt();
        System.out.print("Podaj potege: ");
        int n = sc.nextInt();

        System.out.println("Wynik oblicznony rekurencyjnie: " + pot_rek(x, n));
        System.out.println("Wynik oblicznony iteracyjnie: " + pot_ite(x, n));

    }
}