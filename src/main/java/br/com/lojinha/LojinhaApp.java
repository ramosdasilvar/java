package br.com.lojinha;

import br.com.lojinha.pojo.Produto;

import java.util.ArrayList;
import java.util.List;

public class LojinhaApp {

    public static void main(String[] args) {
        Produto meuProduto = new Produto();

        meuProduto.setNome("Xbox Series S");
        meuProduto.setValor(2599.99);
        meuProduto.setMarca("Microsoft");
        meuProduto.setTamanho("Medio");

        List<String> itensInclusos = new ArrayList<>();
        itensInclusos.add("2 Controles");
        itensInclusos.add("3 Jogos");
        itensInclusos.add("1 cabos de energia");
        itensInclusos.add("1 cabo HDMI");
        meuProduto.setItensInclusos(itensInclusos);

        System.out.println(meuProduto.getItensInclusos());
        System.out.println("Quantidade de itens do produto: " +meuProduto.getItensInclusos().size());
        System.out.println("O quarto item do produto é: " +meuProduto.getItensInclusos().get(3));
        System.out.println("O valor do produto é: " +meuProduto.getValor());

    }
}
