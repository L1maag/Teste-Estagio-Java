package br.com.mobitbrasil.ped.q4;

import java.util.Arrays;
import java.util.Scanner;

public class Anagrama {

    /**
     * Checar se dois textos são anagramas.
     *
     * @param texto1 - Primeiro texto
     * @param texto2 - Segundo texto
     *
     * @return true se for anagrama, false caso contrário
     */
    public static boolean checarAnagrama(String texto1, String texto2) {
        // Remove espaços e coloca em minúsculo
        String t1 = texto1.replaceAll(" ", "").toLowerCase();
        String t2 = texto2.replaceAll(" ", "").toLowerCase();

        // Se o tamanho for diferente, já não é anagrama
        if (t1.length() != t2.length()) {
            return false;
        }

        // Converte para array de caracteres e ordena
        char[] array1 = t1.toCharArray();
        char[] array2 = t2.toCharArray();

        Arrays.sort(array1);
        Arrays.sort(array2);

        // Verifica se os arrays são iguais
        return Arrays.equals(array1, array2);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a primeira palavra:");
        String texto1 = scanner.nextLine();

        System.out.println("Digite a segunda palavra:");
        String texto2 = scanner.nextLine();

        if (checarAnagrama(texto1, texto2)) {
            System.out.println("É um anagrama!");
        } else {
            System.out.println("Não é um anagrama.");
        }

        scanner.close();
    }
}
