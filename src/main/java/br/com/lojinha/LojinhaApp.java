package br.com.lojinha;

import br.com.lojinha.enums.Tamanho;
import br.com.lojinha.pojo.ItemAdicional;
import br.com.lojinha.pojo.Produto;

import java.util.ArrayList;
import java.util.List;

public class LojinhaApp {

    public static void main(String[] args) {
        Produto meuProduto = new Produto("MICROSOFT", Tamanho.GRANDE);
        ItemAdicional adicional = new ItemAdicional();

        System.out.println("O marca do produto é: " +meuProduto.getMarca());
        System.out.println("O tamanho do produto é: " +meuProduto.getTamanho());

        meuProduto.setNome("Xbox Series S");
        meuProduto.setValor(2599.99);
        meuProduto.setMarca("XBOX");
        meuProduto.setTamanho(Tamanho.PEQUENO);

        List<String> itensInclusos = new ArrayList<>();
        itensInclusos.add("2 Controles");
        itensInclusos.add("3 Jogos");
        itensInclusos.add("1 cabos de energia");
        itensInclusos.add("1 cabo HDMI");
        meuProduto.setItensInclusos(itensInclusos);

        adicional.setNome("Capa para console");
        adicional.setQtd(2);

        System.out.println(meuProduto.getItensInclusos());
        System.out.println("Quantidade de itens do produto: " +meuProduto.getItensInclusos().size());
        System.out.println("O quarto item do produto é: " +meuProduto.getItensInclusos().get(3));
        System.out.println("O valor do produto é: " +meuProduto.getValor());
        System.out.println("A marca do passou a ser: " +meuProduto.getMarca());
        System.out.println("O tamanho do produto passou a ser: " +meuProduto.getTamanho());
        System.out.println("O item adicional é: " +adicional.getNome());
        System.out.println("A quantidade do item adicional é: " +adicional.getQtd());

    }
}