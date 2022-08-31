package br.com.fatec;

public class Gerente extends Funcionario {
    private String secretaria;

    //Polimorfismo de Sobrescrita (Heranca Apenas)
    @Override //Sobrescrevendo o método listarDados da classe pai
    public void listarDados() {
        //Chamando o metodo listarDados() da classe pai - Funcionario
        super.listarDados();
        System.out.println("Secretaria: " + this.secretaria);
    }

    public String getSecretaria() {
        return secretaria;
    }

    public void setSecretaria(String secretaria) {
        this.secretaria = secretaria;
    }
}