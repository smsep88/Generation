package Gen1802.Desafio2;

import java.util.Scanner;

public class Calculadora
{
    /*
    Calculadora
     */


    public static void main(String[] args)
    {
        boolean flagCalc = false;
        boolean flagMenu = true;
        Scanner sc = new Scanner(System.in);

        menu();

        while (flagMenu)
        {


            int opcion;
            opcion = sc.nextInt();

            if (opcion == 1)
            {
                flagCalc = true;
            } else if (opcion == 2)
            {
                flagCalc = false;
            }

            while (flagCalc)
            {
                System.out.println("CALCULADORA - realiza operacion con 2 numeros");
                int valor1;
                int valor2;
                double resultado = 0;
                String operacion;

                Scanner entrada = new Scanner(System.in);
                System.out.println("Digite primer numero: ");
                valor1 = entrada.nextInt();
                System.out.println("Digite segundo numero: ");
                valor2 = entrada.nextInt();
                System.out.println("Escriba Operacion \n Suma -> +\n resta -> -\n multiplicacion -> *\n division -> /");
                entrada.nextLine(); // tengo que poner este codigo para poder leer la siguiente entrada
                operacion = entrada.nextLine();
                switch (operacion)
                {

                    case "+":
                        resultado = valor1 + valor2;
                        break;
                    case "-":
                        resultado = valor1 - valor2;
                        break;
                    case "*":
                        resultado = valor1 * valor2;
                        break;
                    case "/":
                        resultado = (double) valor1 / valor2;
                        break;
                    default:
                        System.out.println("Operacion incorrecta");
                        break;
                }
                System.out.println("El resultado de tu operacion es:");
                System.out.println(valor1 + " " + operacion + " " + valor2 + " = " + resultado);
                System.out.println("\n");
                System.out.println("¿Desea realizar otra operacion?\n(s/n)");
                if (entrada.nextLine().equals("n")) flagCalc = false;
            }


        }

    }// aqui termina el main


    static void menu(){
        System.out.println("Menu Principal");
        System.out.println("1.-Calculadora");
        System.out.println("2.-Salir");
    }






}
