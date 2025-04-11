package br.com.mobitbrasil.ped.q2;

import java.util.Scanner;

public class Palindromo {

    /**
     * Checar palindromo
     *
     * @param texto - Texto palindromo
     *
     * @return true se for palíndromo, false caso contrário
     */
    public static boolean checarPalindromo(String texto) {
        // Remove espaços e deixa tudo em minúsculo
        String textoLimpo = texto.replaceAll(" ", "").toLowerCase();

        // Inverte o texto
        String textoInvertido = new StringBuilder(textoLimpo).reverse().toString();

        return textoLimpo.equals(textoInvertido);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite uma frase ou palavra para verificar se é um palíndromo:");
        String entrada = scanner.nextLine();

        if (checarPalindromo(entrada)) {
            System.out.println("É um palíndromo!");
        } else {
            System.out.println("Não é um palíndromo.");
        }

        scanner.close();
    }
}
