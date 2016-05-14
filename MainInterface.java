/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latihan;

import java.util.Scanner;

/**
 *
 * @author Asus
 */
public class MainInterface{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        subMain i = new subMain();
        double a;
        
        System.out.println("---- INTEGER or DOUBLE ----");
        System.out.print(" Masukkan angka  : ");
        a = in.nextDouble();
        System.out.print(" Result          : ");        
        if ((a % 0.1 <= 0. ) && (a != 0. ) || (a % 1 <= 0)){
            i.methodI1();
        } else {
            i.methodD1();
        }
        System.out.println("---------------------------");
        
    }
}
        
        

            
