package com.company.model;

import java.util.HashMap;
import java.util.List;

public class GuardaRoupa {

    private Integer contador = 0;

  private HashMap<Integer,List<Roupa>>  dicionario = new HashMap<>();



    public Integer guardarRoupas(List<Roupa> listaDeRoupas, List<Roupa> ListaDeRoupas){
        ++contador;
        dicionario.put(contador,ListaDeRoupas);


        return contador;











    }
}


