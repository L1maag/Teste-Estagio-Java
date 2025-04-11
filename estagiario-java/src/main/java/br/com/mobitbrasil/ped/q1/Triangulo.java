package br.com.mobitbrasil.ped.q1;

import java.util.Scanner;

public class Triangulo {

    /**
     * Validar triangulo
     *
     * @param a - Lado a
     * @param b - Lado b
     * @param c - Lado c
     *
     * @return true se for um triângulo válido, false caso contrário
     */
    public static boolean checarTriangulo(int a, int b, int c) {
        return (a < b + c && a > Math.abs(b - c)) &&
               (b < a + c && b > Math.abs(a - c)) &&
               (c < a + b && c > Math.abs(a - b));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o valor do lado A:");
        int a = scanner.nextInt();

        System.out.println("Informe o valor do lado B:");
        int b = scanner.nextInt();

        System.out.println("Informe o valor do lado C:");
        int c = scanner.nextInt();

        if (checarTriangulo(a, b, c)) {
            System.out.println("Os lados informados FORMAM um triângulo.");
        } else {
            System.out.println("Os lados informados NÃO FORMAM um triângulo.");
        }

        scanner.close();
    }
}
