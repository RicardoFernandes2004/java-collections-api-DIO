package br.com.dio.collections.main;

import br.com.dio.collections.bean.ListaTarefas;

public class Main {
    public static void main(String[] args){
        ListaTarefas listaTarefas = new ListaTarefas();
        System.out.println("num list de tasks" + listaTarefas.obterNumeroTotalDeTarefas());

        listaTarefas.adicionarTarefa("pinto");
        listaTarefas.adicionarTarefa("bolas");
        System.out.println("num list de tasks: " + listaTarefas.obterNumeroTotalDeTarefas());
        System.out.println(listaTarefas.obterDescricoesDeTarefas());

    }
}
