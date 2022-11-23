package br.com.fatec.model;

import java.util.Objects;

/**
 * importante já reprogramar:
 * equals()
 * hashCode()
 * toString()
 * getters e setters
 * construtores
 * 
 * @author Viotti
 */
public class Veiculo {

    private String placa;
    private String modelo;
    private double valor;

    //composição !!!!
    private Proprietario proprietario;

    //composição
    public Veiculo(Proprietario proprietario) {
        this.proprietario = proprietario;
    }

    //getters e setters
    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public Proprietario getProprietario() {
        return proprietario;
    }

    public void setProprietario(Proprietario proprietario) {
        this.proprietario = proprietario;
    }
        
    //equals e hashcode
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 89 * hash + Objects.hashCode(this.placa);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Veiculo other = (Veiculo) obj;
        if (!Objects.equals(this.placa, other.placa)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return placa + " - " + proprietario;
    }
    
    
}
