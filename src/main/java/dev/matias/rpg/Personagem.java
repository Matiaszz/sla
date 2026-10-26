package dev.matias.rpg;

public abstract class Personagem {
    private String nome;
    private int vida;
    private int ataque;

    public abstract void atacar(Personagem p);


    // interface = você FAZ algo
    // classe abstrata = você É algo

}
