package br.com.fatec;

public class Main {
    public static void main(String[] args) {
        Gerente gerente = new Gerente();

        gerente.setNome("João"); //Classe pai
        gerente.setCpf("123.456.789-00"); //Classe pai
        gerente.setSalario(5000); //Classe pai
        gerente.setSecretaria("Maria"); //Classe gerente (filha da classe pai - Funcionario)

        gerente.listarDados();
    }
}