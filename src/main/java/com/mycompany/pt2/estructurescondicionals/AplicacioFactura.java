/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pt2.estructurescondicionals;
import java.util.Scanner;
/**
 * Classe AplicacioFactura.
 * Calcula el preu final d'una llista de prodcutes després d'haver aplicar
 * l'IVA.
 * @author Andrea i Yamila
 */
public class AplicacioFactura {

    public static void main(String[] args) {
        
        double preu; //double que serà el valor del preu.
        int articles; // int que serà la quantitat d'articles.
        double totalArticles; // double per indicar el preu total.
        /*
            final que serà el valor del marge. Aquest marge és el que
            compte per fer el descompte.
        */
        final int MARGE = 100;
        // finals que seran el descompte i l'IVA a aplicar.
        final double DESCOMPTE = 0.05, IVA_INCREMENT = 0.21;
        
        Scanner lector = new Scanner(System.in); // Declarem l'escàner.
        //Preguntem a l'usuari per el preu.
        System.out.print("Introdueixi el preu: ");
        preu = lector.nextDouble(); //Ordre per introduir el valor.
        
        //Preguntem a l'usuari quants articles són.
        System.out.print("Quants articles són? ");
        articles = lector.nextInt(); //Ordre per introduir la quantitat.
        //Multiplicació del preu pels articles, per obtenir el preu total.
        totalArticles = preu * articles;
        
        //Frase que ens mostra el preu total de tots els articles.
        System.out.println("El preu total de tots els articles és: " +
                totalArticles + "€.");
        //Creem un double, on es calcula el descompte del 21% del IVA en el preu.
        double IVA = totalArticles * IVA_INCREMENT;
        //Creem un double. És el resultat del càlcul del IVA al preu.
        double resultat = IVA + totalArticles;
        
        /*
            Condicional que compara si el valor resultat és igual o més gran
            que el marge (100€). Si és certa la condició s'aplica un descompte
            d'un 5%.
        */
        if(resultat >= MARGE){
            //Creem un double on es calcula el descompte del 5%.
            double descompte = resultat * DESCOMPTE;
            //Creem un double on es resta el descompte al preu.
            double descompteAplicat = resultat - descompte;
            //Frase que mostra el resultat del IVA afegit.
            System.out.println("El preu amb l'IVA és de " + resultat + "€.");
            //Text que surt dient que s'ha aplicat un descompte del 5%.
            System.out.println("S'ha aplicat un descompte del 5%.");
            //Text que mostra el descopmte aplicat.
            System.out.println("La factura és de " + descompteAplicat + "€.");
        } else{
            /*
                Text que mostra la factura sense el descompte aplicat, si la
                condició és falsa.
            */
            System.out.println("La factura, amb l'IVA, inclòs és de " + resultat
                    + "€.");
        }
    }
}
