package br.com.lojinha;

import br.com.lojinha.pojo.Produto;

public class LojinhaApp {

    public static void main(String[] args) {
        Produto meuProduto = new Produto();

        meuProduto.setNome("Xbox Series S");
        meuProduto.setValor(0.10);
        meuProduto.setMarca("Microsoft");
        meuProduto.setTamanho("Medio");
        meuProduto.setItensInclusos("2 Controle e 3 jogos");

        System.out.println(meuProduto.getValor());

    }
}
