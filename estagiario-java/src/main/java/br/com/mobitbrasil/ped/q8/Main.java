package br.com.mobitbrasil.ped.q8;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Pessoa> pessoas = new ArrayList<>();

        pessoas.add(new Pessoa("Lucas", 25, "lucas@email.com", "99999-1111"));
        pessoas.add(new Pessoa("Maria", 20, "maria@email.com", "99999-2222"));
        pessoas.add(new Pessoa("João", 30, "joao@email.com", "99999-3333"));

        System.out.println("Antes de ordenar:");
        for (Pessoa p : pessoas) {
            System.out.println(p.getNome() + " - " + p.getIdade());
        }

        Ordenar.ordenar(pessoas);

        System.out.println("\nDepois de ordenar:");
        for (Pessoa p : pessoas) {
            System.out.println(p.getNome() + " - " + p.getIdade());
        }
    }
}
