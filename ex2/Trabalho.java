
public class Trabalho {
    private int salario;
    private String profissao;
    private String beneficio;
    
    public Trabalho() {}
    
    public Trabalho(int salario, String profissao, String beneficio) {
        this.salario = salario;
        this.profissao = profissao;
        this.beneficio = beneficio;
    }
    
    public int getSalario() {
        return salario;
    }
    
    public void setSalario(int salario) {
        this.salario = salario;
    }
    
    public String getProfissao() {
        return profissao;
    }
    
    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }
    
    public String getBeneficio() {
        return beneficio;
    }
    
    public void setBeneficio(String beneficio) {
        this.beneficio = beneficio;
    }
    
    public void trabalhar() {
        System.out.println("Trabalhando como " + profissao + " com salário de R$" + salario);
    }
    
    @Override
    public String toString() {
        return "Trabalho{" +
                "salario=" + salario +
                ", profissao='" + profissao + '\'' +
                ", beneficio='" + beneficio + '\'' +
                '}';
    }
}