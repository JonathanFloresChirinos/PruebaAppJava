package com.emergentes;
import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        System.out.println("Ingrese su código: ");
        Scanner sc  = new Scanner(System.in);
        int x = sc.nextInt();
        int cont = 0;
//        boolean y = true;
        
        while (x != 1234567) {
            cont++;
            if (x == 1234567) {
                System.out.println("Bienvenido...");
                break;
            } else if (cont == 3) {
                System.out.println("Número de intentos agotados...");
                break;
            } else {
                System.out.println("Ingrese nuevamente su código: ");
                x = sc.nextInt();
            }
        }
        
        if (x == 1234567) {
            System.out.println("Bienvenido...");
        } else {
            System.out.println("Código incorrecto...");
        }
        for (int i = 0; i < 10; i++) {
            System.out.println((i+1)+" Hola Mundo...");
        }
    }
}
