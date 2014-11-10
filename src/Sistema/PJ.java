package Sistema;

public class PJ extends Pessoa implements CalculaImposto<Double> {

    private String CNPJ;

    public PJ(String nome,String Endereco,String Documento,Double Faturamento, String CNPJ) {
        setNome(nome);
        setEndereco(Endereco);
        setFaturamento(Faturamento);
        this.CNPJ = CNPJ;
    }

    @Override
    public String getDocumento() {
        return CNPJ;
    }
    
    @Override
    public double calculaImposto(Double Faturamento) {
        Integer valor = Faturamento.intValue();
        return valor * 0.27;
    }

}
