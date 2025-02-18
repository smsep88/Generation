package Gen1802;

import java.util.Objects;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("¿Quien le pregunto?");
        String input = sc.nextLine();

        if (Objects.equals(input, "nadie"))
        {
            System.out.printf("¿entonces porque habla?");

        } else if (Objects.equals(input, "yo"))
        {
            System.out.printf("SILENCIO");
        } else
        {
            System.out.printf("Que quisiste decir?");
        }
    }
}