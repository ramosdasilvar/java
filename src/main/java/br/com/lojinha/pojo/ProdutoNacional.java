package br.com.lojinha.pojo;

import br.com.lojinha.Interfaces.Favorito;
import br.com.lojinha.enums.Tamanho;

public class ProdutoNacional extends Produto implements Favorito {
    private double impostoNacional;

    public ProdutoNacional(String marcaInicial, Tamanho tamanhoInicial) {
        super(marcaInicial, tamanhoInicial);
    }

    public double getImpostoNacional() {
        return impostoNacional;
    }

    public void setImpostoNacional(double novoImpostoNacional) {
        impostoNacional = novoImpostoNacional;
    }

    public String getDadosFavoritos() {
        return this.getNome() + ", " + this.getMarca() + " e " + this.getValor();
    }
}
