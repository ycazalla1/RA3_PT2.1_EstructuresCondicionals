/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pt2.estructurescondicionals;
import java.util.Scanner;
/**
 * Classe Morse.
 * Mostra la traducció de les vocals a codi morse.
 * @author Andrea i Yamila
 */
public class Morse {

    public static void main(String[] args) {
        
        // finals on s'indiquen les vocals en majúscules i minúscules
        final char A_MAJUSCULA = 'a';
        final char A_MINUSCULA = 'A';
        final char E_MAJUSCULA = 'E';
        final char E_MINUSCULA = 'e';
        final char I_MAJUSCULA = 'I';
        final char I_MINUSCULA = 'i';
        final char O_MAJUSCULA = 'O';
        final char O_MINUSCULA = 'o';
        final char U_MAJUSCULA = 'U';
        final char U_MINUSCULA = 'u';
        
        Scanner lector = new Scanner(System.in); // Declaració de l'escàner.
        System.out.print("Introdueixi una vocal: "); //Preguntem per una vocal.
        char vocal = lector.next().charAt(0); //Ordre per introduir una lletra.
        
        /*
            Condicional per saber la traducció de les vocals, independement de
            si és majúsucla o minúsucula.
        */
        if (vocal == A_MAJUSCULA || vocal == A_MINUSCULA){
            //Text amb la traducció de la lletra A a morse.
            System.out.println("Es tradueix com: .-");
        } else if (vocal == E_MAJUSCULA || vocal == E_MINUSCULA){
            //Text amb la traducció de la lletra E a morse.
            System.out.println("Es tradueix com: .");
        } else if (vocal == I_MAJUSCULA || vocal == I_MINUSCULA){
            //Text amb la traducció de la lletra I a morse.
            System.out.println("Es tradueix com: ..");
        } else if (vocal == O_MAJUSCULA || vocal == O_MINUSCULA){
            //Text amb la traducció de la lletra O a morse.
            System.out.println("Es tradueix com: ---");
        } else if (vocal == U_MAJUSCULA || vocal == U_MINUSCULA){
            //Text amb la traducció de la lletra U a morse.
            System.out.println("Es tradueix com: ..-");
        } else {
            //Text on indica que no és una vocal.
            System.out.println("Aquesta lletra no és una vocal.");
        }
        
        
    }
}