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
        //criando um transportador
        Transportador transportador = new Transportador();
        transportador.setRazaoSocial("Kerosvlog");
        transportador.setCusto(666);
         
        
        //passando transportador pra produto 1 // 1ª forma
        //tenho acesso ao transportador de duas maneiras pelo objeto
        //p1 e tambem pelo objeto transportador
        Produto p1 = new Produto(transportador);
        //alterando o custo do transporte
        //1ª maneira
        p1.getTransportador().setCusto(2000);
        //2ª maneira
        transportador.setCusto(2000);
        
        p1.setCodigo(1);
        p1.setDescricao("Regua");
        //colocar dados do fornecedor
        p1.getFornecedor().setNome("Faber Castel");
        
   
        //Criando pp2 com um objeto anonimo
        Produto p2 = new Produto(new Transportador());
        //colocando dados para o transportador
        //so existe uma forma de accesar o objeto transportador
        //pelo objeto p2
        p2.getTransportador().setRazaoSocial("Zeze");
        p2.getTransportador().setCusto(3400);
        
        
        Fornecedor f = new Fornecedor();
        f.setNome("Pilot");
        p2.setCodigo(2);
        p2.setDescricao("Caneta para Quadro branco");
        //fazendo a agregacao
        p2.setFornecedor(f);
        
        f.setNome("BIC");
    }
}
