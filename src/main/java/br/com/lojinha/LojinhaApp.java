package br.com.lojinha;

import br.com.lojinha.pojo.Produto;

public class LojinhaApp {

    public static void main(String[] args) {
        Produto meuProduto = new Produto();

        meuProduto.nome = "Xbox Series S";
        meuProduto.valor = 2499;
        meuProduto.marca = "Microsoft";
        meuProduto.tamanho = "Médio";
        meuProduto.itensInclusos = "1 Controle";

        System.out.println(meuProduto.valor);

    }
}
