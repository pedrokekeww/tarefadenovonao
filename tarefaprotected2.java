package meuPacote;

public class Animal {
    public String nome;
    private int idade;
    protected String especie;

    // Construtor da superclasse
    public Animal(String nome, int idade, String especie) {
        this.nome = nome;
        this.idade = idade;
        this.especie = especie;
    }

    // Método para acessar a idade (getter, pois idade é private)
    public int getIdade() {
        return idade;
    }
}

package outroPacote;

import meuPacote.Animal;

public class Cachorro extends Animal {
    private String raca;
    private boolean vacinado;

    // Construtor da subclasse
    public Cachorro(String nome, int idade, String especie, String raca, boolean vacinado) {
        super(nome, idade, especie);
        this.raca = raca;
        this.vacinado = vacinado;
    }

    // Método para imprimir informações
    public void exibirInformacoes() {
        System.out.println("Nome: " + nome + ", Idade: " + getIdade() + ", Espécie: " + especie + ", Raça: " + raca + ", Vacinado: " + vacinado);
    }

    // Método main para testar
    public static void main(String[] args) {
        Cachorro meuCachorro = new Cachorro("Rex", 5, "Canino", "Labrador", true);
        meuCachorro.exibirInformacoes();
    }
}
