/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.fatec;

/**
 *
 * @author Aluno
 */
public class Main {
    public static void main(String[] args) {
        Produto p1 = new Produto();
        p1.setCodigo(1);
        p1.setDescricao("Regua");
        //colocar dados do fornecedor
        p1.getFornecedor().setNome("Faber Castel");
        
        Produto p2 = new Produto();
        Fornecedor f = new Fornecedor();
        f.setNome("Pilot");
        p2.setCodigo(2);
        p2.setDescricao("Caneta para Quadro branco");
        //fazendo a agregacao
        p2.setFornecedor(f);
        
        f.setNome("BIC");
    }
}
