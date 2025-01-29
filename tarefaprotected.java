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
