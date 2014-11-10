package Sistema;

public class PF extends Pessoa implements CalculaImposto<Double> {

    private String CPF;

    public PF(String nome,String Endereco,String Documento,Double Salario,String CPF) {
        setNome(nome);
        setEndereco(Endereco);
        setSalario(Salario);
        this.CPF = CPF;
    }

    @Override
    public String getDocumento() {
        return CPF;
    }

    @Override
    public double calculaImposto(Double salario) {
        Integer valor = salario.intValue();
        return valor * 0.27;
    }

}
