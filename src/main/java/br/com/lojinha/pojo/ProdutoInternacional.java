package br.com.lojinha.pojo;

import br.com.lojinha.enums.Tamanho;

public class ProdutoInternacional extends Produto {
    private double taxaInternacional;

    public ProdutoInternacional(String marcaInicial, Tamanho tamanhoInicial) {
        super(marcaInicial, tamanhoInicial);
    }

    public double getTaxaInternacional(){
        return taxaInternacional;
    }

    public void setTaxaInternacional(double novaTaxaInternacional){
        taxaInternacional = novaTaxaInternacional;
    }
}
