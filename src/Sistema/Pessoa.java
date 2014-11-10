package Sistema;

import java.util.ArrayList;

public abstract class Pessoa {
    
    private String nome;
    private String endereco;
    private String documento;
    private Double salario;
    private Double Faturamento;
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    
    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }
    
     public Double getFaturamento() {
        return Faturamento;
    }

    public void setFaturamento(Double Faturamento) {
        this.Faturamento = Faturamento;
    }

    public abstract String getDocumento();
}
