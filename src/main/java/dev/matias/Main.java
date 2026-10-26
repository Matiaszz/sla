package dev.matias;

import dev.matias.a_animal.Animal;
import dev.matias.a_animal.Cachorro;
import dev.matias.a_animal.Gato;

public class Main {

    public static void main(String[] args) {
        Animal cachorro = new Cachorro();
        Animal gato = new Gato();

        cachorro.fazerSom();
        gato.fazerSom();
        
        
    }

    private void print(String conteudo) {
        System.out.println(conteudo);
    }

}