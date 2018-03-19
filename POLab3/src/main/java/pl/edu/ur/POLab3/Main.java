/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.ur.POLab3;

/**
 *
 * @author Asia
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO 1.4, 1.7, 
        // TODO 2.2
        // TODO 3.3, 3.4
        //1.4
        int a = 10;
        int w1, w2, w3, w4;
        System.out.println(a);
        w1 = a << 3;
        //10 << 3 = 10* 2^3 = 10 * 80 = 80
        a = 10;
        w2 = a >> 3;
        System.out.println(w2);
        //10 >> 3 = 10 / 2^3 = 10 / 8 = 1
        a = 10;
        w3 = a >>> 3;
        System.out.println(w3);
        //10 >>> 3 = 10 >> 3 = 10 / 2^3 = 1
        a = -17;
        w4 = a >>> 3;
        System.out.println(w4);
        //-17 >>> 3 = 536870909
        
        //1.7
        //NOR -> !
        //XOR -> ^
    }

}