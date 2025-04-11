package br.com.mobitbrasil.ped.q7;

import java.io.InputStream;
import java.util.Scanner;

public class Classificador {

    public static long contarPalavras(String palavra) {
        long contador = 0;

        try {
            InputStream inputStream = Classificador.class.getClassLoader().getResourceAsStream("palavras.txt");

            if (inputStream == null) {
                System.out.println("Arquivo não encontrado!");
                return 0;
            }

            Scanner leitor = new Scanner(inputStream);

            while (leitor.hasNext()) {
                String palavraLida = leitor.next();
                if (palavraLida.equalsIgnoreCase(palavra)) {
                    contador++;
                }
            }

            leitor.close();
        } catch (Exception e) {
            System.out.println("Erro ao ler o arquivo: " + e.getMessage());
        }

        return contador;
    }

    public static void main(String[] args) {
        String palavraProcurada = "uma";

        long resultado = contarPalavras(palavraProcurada);

        System.out.println("A palavra \"" + palavraProcurada + "\" aparece " + resultado + " vezes no arquivo.");
    }
}
