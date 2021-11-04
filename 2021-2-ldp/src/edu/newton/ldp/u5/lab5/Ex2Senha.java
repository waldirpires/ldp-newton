package edu.newton.ldp.u5.lab5;

import java.util.Scanner;

import edu.newton.ldp.u5.lab5.exceptions.SenhaContemRepeticoesException;
import edu.newton.ldp.u5.lab5.exceptions.SenhaNaoContemSimbolosException;
import edu.newton.ldp.u5.lab5.exceptions.SenhaNaoDeveConterEspacosException;
import edu.newton.ldp.u5.lab5.exceptions.SenhaSemDigitoException;
import edu.newton.ldp.u5.lab5.exceptions.SenhaSemLetraMaiusculaException;
import edu.newton.ldp.u5.lab5.exceptions.TamanhoSenhaInvalidaException;

public class Ex2Senha {
    
    private static boolean contemLetraMaiuscula(String senha) {
        for (int i = 0; i < senha.length(); i++) {
            var letra = senha.charAt(i);
            // se houver um caractere em maiusculo, retornar true
            if (letra > 64 && letra < 91) {
                return true;
            }
        }

        // retornar false, nenhum caractere maiusculo encontrado.
        return false;
    }

    private static boolean contemDigito(String senha) {
        for (int i = 0; i < senha.length(); i++) {
            var letra = senha.charAt(i);
            // se houver um caractere em digito, retornar true
            if (letra > 47 && letra < 58) {
                return true;
            }
        }

        // retornar false, nenhum caractere digito encontrado.
        return false;
    }

    private static boolean contemSimbolo(String senha, String simbolos) {
        for (int i = 0; i < senha.length(); i++) {
            var letra = senha.charAt(i);
            // se houver um caractere símbolo, retornar true
            if (simbolos.contains(""+letra)) {
                return true;
            }
        }

        // retornar false, nenhum caractere símbolo encontrado.
        return false;
    }

    private static boolean contemRepeticoes(String senha) {
        for (int i = 1; i < senha.length(); i++) {
            var letra = senha.charAt(i);
            var letraAnt = senha.charAt(i-1);
            if (letraAnt == letra) {
                return true;
            }

        }

        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite a senha para validação: ");
        var senha = sc.nextLine();

        try {
            // tamanho
            if (senha.length()< 8 || senha.length() > 12) {
                throw new TamanhoSenhaInvalidaException("Tamanho da senha deve ser entre 8 e 12: " + senha.length());
            }

            // letra maiuscula - ASCII 65 a 90
            if (!contemLetraMaiuscula(senha)) {
                throw new SenhaSemLetraMaiusculaException("Senha deve conter pelo menos uma letra maiúscula.");
            }

            // digito - ASCII 48 a 57
            if (!contemDigito(senha)) {
                throw new SenhaSemDigitoException("Senha deve conter pelo menos um dígito.");
            }

            // símbolos
            var simbolos = "!@#?]";
            if (!contemSimbolo(senha, simbolos)) {
                throw new SenhaNaoContemSimbolosException("Senha deve conter pelo menos um dos símbolos: "+ simbolos);
            }

            // repetiçoes
            if (contemRepeticoes(senha)) {
                throw new SenhaContemRepeticoesException("Senha não pode conter repetições.");
            }

            // espaços
            if (senha.contains(" ")) {
                throw new SenhaNaoDeveConterEspacosException("Senha não pode conter espaços.");
            }

            System.out.println("Senha configurada com sucesso.");
            
        } catch (Exception e) {
            System.out.println("ERRO: " + e.getMessage());
        } finally {
            sc.close();
        }
    }
}
