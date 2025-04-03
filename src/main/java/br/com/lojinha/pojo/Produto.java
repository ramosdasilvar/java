package br.com.lojinha.pojo;

public class Produto {
    public String nome;
    public String marca;
    private double valor;
    public String tamanho;
    public String itensInclusos;

    public double getValor() {
        return this.valor;
    }

    public void setValor(double novoValor) {
        this.valor = novoValor;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String novoNome) {
        this.nome = novoNome;
    }

    public String getMarca() {
        return this.marca;
    }

    public void setMarca(String novaMarca) {
        this.marca = novaMarca;
    }

    public String getTamanho() {
        return this.tamanho;
    }

    public void setTamanho(String novoTamanho) {
        this.tamanho = novoTamanho;
    }

    public String getItensInclusos() {
        return this.itensInclusos;
    }

    public void setItensInclusos(String novoItensinclusos) {
        this.itensInclusos = novoItensinclusos;
    }
}
