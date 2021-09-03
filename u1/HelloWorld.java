package u1; // pacote

import java.time.LocalDate; // importações
import java.util.Scanner;

/**
 * Minha primeira classe.<br>
 * Autor: Waldir<br>
 * Data: 25/8/2021<br><br>
 * 
 * Descrição: exemplo de classe.
 */
public class HelloWorld { // definição de classe
    // declaração de variáveis e constantes
    static final float PI = 3.14f; // constante
    String name; // variável de classe

    private static String getTodaysDate() { // funções/métodos
        return LocalDate.now().toString();
    }

    public static void main(String[] args) { // função principal
        // declaração de variáveis e constantes
        var today = getTodaysDate(); // variável local

        var sc = new Scanner(System.in);

        System.out.println("What is your name?");
        var name = sc.nextLine(); // entrada

        // processamento e saída
        System.out.println("Hello World, " + name + "!");
        System.out.println("Today is " + today);
        System.out.println("Day of the week: " + LocalDate.now().getDayOfWeek());

        // fechamento de recursos
        sc.close();
    }
}
