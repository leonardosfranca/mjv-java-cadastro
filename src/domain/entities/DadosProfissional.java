package domain.entities;

public class DadosProfissional {

    private String profissao;
    private String empresa;
    private Double salario;
    private Boolean empregoAtual;

    public DadosProfissional() {
    }

    public DadosProfissional(String profissao, String empresa, Double salario, Boolean empregoAtual) {
        this.profissao = profissao;
        this.empresa = empresa;
        this.salario = salario;
        this.empregoAtual = empregoAtual;
    }

    public String getProfissao() {
        return profissao;
    }

    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    public Boolean getEmpregoAtual() {
        return empregoAtual;
    }

    public void setEmpregoAtual(Boolean empregoAtual) {
        this.empregoAtual = empregoAtual;
    }
}
