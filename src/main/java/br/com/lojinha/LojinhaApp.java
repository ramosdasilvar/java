package br.com.lojinha;

import br.com.lojinha.pojo.Produto;

public class LojinhaApp {

    public static void main(String[] args) {
        Produto meuProduto = new Produto();

        meuProduto.setNome("Xbox Series S");
        meuProduto.setValor(79.99);
        meuProduto.setMarca("Microsoft");
        meuProduto.setTamanho("Medio");
        meuProduto.setItensInclusos("1 Controle");

        System.out.println(meuProduto.getItensInclusos());

    }
}
