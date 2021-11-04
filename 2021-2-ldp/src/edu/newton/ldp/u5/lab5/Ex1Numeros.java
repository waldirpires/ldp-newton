package edu.newton.ldp.u5.lab5;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex1Numeros {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Informe a quantidade de números a ser informada:");
            var quant = sc.nextInt();
            System.out.println("\nvocê solicitou " + quant + " números.\n");
    
            var nums = new int[quant];
            for (int i = 0; i < quant; i++) {
                System.out.println("Digite o " + (i+1) + "o número:");
                nums[i] = sc.nextInt();
            }
    
            System.out.println("Números informados: ");
            for(int i: nums) {
                System.out.print(i + "  ");
            }
            System.out.println("\n");

        } catch (InputMismatchException e) {
            System.out.println("ERRO: esperado um número inteiro");
        }
        sc.close();
    }
}
