package br.com.mobitbrasil.ped.q5;

import java.util.Scanner;

public class SomaRecursiva {

    /**
     * Soma recursiva de 1 até o número informado.
     *
     * @param numero - Valor numérico
     * @return Soma dos números de 1 até numero
     */
    public static long somarNumeros(long numero) {
        if (numero <= 1) {
            return 1;
        }
        return numero + somarNumeros(numero - 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número para somar de 1 até ele:");
        long numero = scanner.nextLong();

        long resultado = somarNumeros(numero);

        System.out.println("Resultado da soma: " + resultado);

        scanner.close();
    }
}
