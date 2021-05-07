package mercado;

import java.util.Scanner;

public class Produto {

    public Produto(double preco, String nome, int quantidade) {
        this.preco = preco;
        this.nome = nome;
        this.quantidade = quantidade;
    }

    private double preco;
    private String nome;
    private int quantidade;

    public double getPreco() {
        return this.preco;
    }

    public String getNome() {
        return this.nome;
    }

    public int getQuantidade() {
        return this.quantidade;
    }

    //public double desconto(double preco) {
    //  Scanner s = new Scanner(System.in);
    //ouble credito = s.nextDouble();
    //double resto = preco - credito;
    //return resto
    
}
