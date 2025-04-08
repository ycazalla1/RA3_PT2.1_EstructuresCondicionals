/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pt2.estructurescondicionals;
import java.util.Scanner;
/**
 * Classe Multiple.
 * Calcula si el nombre introduït és múltiple de 3 i de 7.
 * @author Andrea i Yamila
 */
public class Multiple {

    public static void main(String[] args) {
        
        int numero; //Creem un int que serà el valor.
        
        Scanner lector = new Scanner(System.in);
        //Preguntem a l'usuari per un número.
        System.out.println("Introdueix un número:");
        numero = lector.nextInt(); //Ordre per introduir el valor.
        
        //Condicional que calcula si és múltiple de 3 i de 7.
        if (numero % 3 == 0 && numero % 7 == 0){
            //Text que surt si la condició és certa.
            System.out.println("És múltiple de 3 i de 7.");
        } else {
            //Text que surt si la condició és falsa.
            System.out.println("No és múltiple de 3 ni de 7.");
        }
    }
}