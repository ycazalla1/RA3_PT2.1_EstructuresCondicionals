/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pt2.estructurescondicionals;
import java.util.Scanner;
/**
 * Classe Gran_Petit.
 * Comprova quin és el nombre més gran.
 * @author Andrea i Yamila
 */
public class Mes_Gran {

    public static void main(String[] args) {
        
        int numero1; //Creem un int que serà el primer valor a introduir.
        int numero2; //Creem un int que serà el primer valor a introduir.
        
        Scanner lector = new Scanner(System.in); // Declaració de l'escàner.
        //Preguntem a l'usuari per un número.
        System.out.print("Introdueix ún número:");
        numero1 = lector.nextInt(); //Ordre per introduir el valor.
        //Preguntem a l'usuari per un segon número.
        System.out.print("Introdueix un segon número:");
        numero2 = lector.nextInt(); //Ordre per introduir el valor.
        
        //Condicional per averiguar si el primer valor és més gran que el segon.
        if (numero1 > numero2){
            //Text que surt si la condició és certa.
            System.out.println("El primer valor introduit és major que el segon.");
        /*
            Si no compleix la primera condició, compara si el segon número és
            més gran que el primer.
        */
        } else if (numero1 < numero2){
            //Text que surt si la condició és certa.
            System.out.println("El segon valor introduit és major que el primer.");
        } else { //Si cap condició és certa, és perquè els valors són iguals.
            //Text que surt si la condició és certa.
            System.out.println("Els dos valors introduits són iguals.");
        }
        
    }
}