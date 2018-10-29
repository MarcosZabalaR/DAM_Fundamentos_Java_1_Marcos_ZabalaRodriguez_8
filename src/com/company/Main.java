package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Introduzca los números a comparar.");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        comparar(a,b);
    }

    /*
    La función main sirve para crear la variable scanner e inicializar los valores a y b.
     */

    private static void comparar(int a, int b) {
        if(a==b){
            System.out.println(a+" "+b);
        }else{
            if(a<b){
                System.out.println(b+" "+a);
            }else{
                System.out.println(a+" "+b);
            }
        }
    }

    /*
    Función que compara y muestra oredenadamente 2 números dados.
     */

}
