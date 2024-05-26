/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.codigo;

import java.util.Scanner;

/**
 *
 * @author Nahilea
 */
public class Codigo {

    public static void main(String[] args) {
        // Características iniciales
        int extrovertido = 0;
        int introvertido = 0;
        int relacion = 0;

        Scanner scanner = new Scanner(System.in);

        // Primer encuentro con Violett
        System.out.println("Violett: ¿ME PUEDO SENTAR AQUI? (1 para SONREIRLE DE VUELTA Y ASENTIR POR BUENA ONDA): ");
        int violettPrimeraReaccion = scanner.nextInt();

        if (violettPrimeraReaccion == 1) {
            extrovertido += 2;
            introvertido += 3;
            System.out.println("Violett se sienta junto a ti.");
        }

        // Conversación bajo el árbol
        if (extrovertido >= 2 && introvertido >= 3) {
            System.out.println("Después de que se hayan sentado en aquel árbol, se encuentran en silencio por unos minutos, pero finalmente te comienza la plática, Violett aun no siente que pueda empezar una buena platica, por el hecho de ser alguien nuevo, pero también tenia curiosidad por lo que podrías brindarle.");

            System.out.println("¿Decirle que sí y hasta darle un espacio? (1 para Sí, 2 para No): ");
            int violettSegundaReaccion = scanner.nextInt();

            if (violettSegundaReaccion == 1) {
                extrovertido += 3;
                relacion += 5;
                System.out.println("Le dices que sí y hasta le das un espacio.");
                System.out.println("Violett al escuchar esto se siente más cómoda y continúa la conversación.");
            } else if (violettSegundaReaccion == 2) {
                System.out.println("Esta opción muestra una actitud más reservada o incluso grosera por parte del jugador, lo que podría tener repercusiones negativas en la relación con Violett.");
                System.out.println("Violett al escuchar esto solo ríe incómoda y permanece callada por esta respuesta pero igual se sienta enseguida tuyo, al no querer dejarte solo/a. Tarda unos segundos en poder dirigirte la palabra.");
                relacion -= 1;
            }
        }

        // Continuación de la conversación
        if (relacion >= 5) {
            System.out.println("Violett: \"El grupo allá parece estar bastante animado, pero a veces prefiero un poco de paz y tranquilidad. ¿Tú también prefieres los momentos más tranquilos?\"");
        }

        System.out.println("Estadísticas finales: Extrovertido: " + extrovertido + ", Introvertido: " + introvertido + ", Relación: " + relacion);
    }
    
}
