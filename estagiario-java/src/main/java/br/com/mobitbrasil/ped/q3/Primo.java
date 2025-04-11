package br.com.mobitbrasil.ped.q3;

import java.util.Scanner;

public class Primo {

    /**
     * Retornar o proximo numero primo após um valor numerico.
     *
     * @param numero - Valor numerico
     *
     * @return próximo número primo
     */
    public static long proximoPrimo(long numero) {
        long proximo = numero + 1;

        while (!ehPrimo(proximo)) {
            proximo++;
        }

        return proximo;
    }


    public static boolean ehPrimo(long numero) {
        if (numero < 2) {
            return false;
        }

        for (long i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe um número para descobrir o próximo número primo:");
        long numero = scanner.nextLong();

        long resultado = proximoPrimo(numero);

        System.out.println("O próximo número primo após " + numero + " é: " + resultado);

        scanner.close();
    }
}
