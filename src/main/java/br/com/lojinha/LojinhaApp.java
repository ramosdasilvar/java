package br.com.lojinha;

import br.com.lojinha.enums.Tamanho;
import br.com.lojinha.pojo.ItemIncluso;
import br.com.lojinha.pojo.Produto;

import java.util.ArrayList;
import java.util.List;

public class LojinhaApp {

    public static void main(String[] args) {
        Produto meuProduto = new Produto("MICROSOFT", Tamanho.GRANDE);

        System.out.println("O marca do produto é: " +meuProduto.getMarca());
        System.out.println("O tamanho do produto é: " +meuProduto.getTamanho());

        meuProduto.setNome("Xbox Series S");
        meuProduto.setValor(2599.99);
        meuProduto.setMarca("XBOX");
        meuProduto.setTamanho(Tamanho.PEQUENO);

        List<ItemIncluso> itensInclusos = new ArrayList<>();

        ItemIncluso primeiroItemIncluso = new ItemIncluso("Controle", 2);
        itensInclusos.add(primeiroItemIncluso); // 0

        ItemIncluso segundoItemAdicional = new ItemIncluso("Jogo", 6);
        itensInclusos.add(segundoItemAdicional); // 1

        ItemIncluso terceiroItemIncluso = new ItemIncluso("Cabo HDMI", 1);
        itensInclusos.add(terceiroItemIncluso); //2

        meuProduto.setItensInclusos(itensInclusos);

        System.out.println("A quantidade de itens do produto: " +meuProduto.getItensInclusos().size());
        System.out.println("O valor do produto é: " +meuProduto.getValor());
        System.out.println("A marca do passou a ser: " +meuProduto.getMarca());
        System.out.println("O tamanho do produto passou a ser: " +meuProduto.getTamanho());

        System.out.println("Começando a apresentar os itens");

        for (ItemIncluso itemAtual : meuProduto.getItensInclusos()) {
            System.out.println(itemAtual.getNome());
            System.out.println(itemAtual.getQuantidade());
        }

        System.out.println("Acabou os itens");
    }
}