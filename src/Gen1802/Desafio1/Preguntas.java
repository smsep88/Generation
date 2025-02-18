package Gen1802.Desafio1;

import java.util.Scanner;

public class Preguntas
{
/*
    3 preguntas
    Concatenar las respuestas
    utilizar espacios
 */

    public static void main(String[] args)
    {

        Scanner sc = new Scanner(System.in);
        System.out.println("¿Cual es tu animal favorito?");
        String animal = sc.nextLine();
        System.out.println("¿Cual es tu comida favorita");
        String comida = sc.nextLine();
        System.out.println("¿Que te gusta hacer?");
        String hobby = sc.nextLine();

        System.out.printf(animal + " " + comida + " " + hobby);


    }

}
