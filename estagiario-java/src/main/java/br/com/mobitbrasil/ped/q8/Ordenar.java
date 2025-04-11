package br.com.mobitbrasil.ped.q8;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Ordenar {

    /**
     * Realizar a ordenação da listagem de pessoas utilizando o atributo idade de @Pessoa
     *
     * @param pessoas - Lista de pessoas
     *
     * @return Lista ordenada
     */
    public static List<Pessoa> ordenar(List<Pessoa> pessoas){
        Collections.sort(pessoas, Comparator.comparing(Pessoa::getIdade));
        return pessoas;
    }
}
