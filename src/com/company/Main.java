package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// pedir número entre 0 y 9.999
        //decir cuantas cifras tiene

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un número entre 0 y 9.999");
        int numero = sc.nextInt();

        if (numero >= 1000){
            System.out.println(" Es un número de cuatro cifras");
        } else{
            if (numero >= 100){
                System.out.println("El númmero tiene tres cifras");
            }else{
                if(numero>= 10){
                    System.out.println("El número es de dos cifras");
                }else{
                    if (numero >= 0){
                        System.out.println("El número es de una cifra");
                    }
                }
            }
        }
        sc.close();




    }
}
