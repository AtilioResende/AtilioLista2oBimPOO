package Exercicio01;

public class Produto {
    public String nome;
    public double preco;

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    @Override
    public String toString(){
        return "Produto {nome ='" + nome + "', preco="+ preco + "}";
    }
}
