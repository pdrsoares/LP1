
public class Retrato {
    private String pessoa;
    private int idade;
    private String nacionalidade;
    
    public Retrato() {}
    
    public Retrato(String pessoa, int idade, String nacionalidade) {
        this.pessoa = pessoa;
        this.idade = idade;
        this.nacionalidade = nacionalidade;
    }
    
    public String getPessoa() {
        return pessoa;
    }
    
    public void setPessoa(String pessoa) {
        this.pessoa = pessoa;
    }
    
    public int getIdade() {
        return idade;
    }
    
    public void setIdade(int idade) {
        this.idade = idade;
    }
    
    public String getNacionalidade() {
        return nacionalidade;
    }
    
    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }
    
    public void exibir() {
        System.out.println("Exibindo retrato de " + pessoa + " (" + idade + " anos, " + nacionalidade + ")");
    }
    
    @Override
    public String toString() {
        return "Retrato{" +
                "pessoa='" + pessoa + '\'' +
                ", idade=" + idade +
                ", nacionalidade='" + nacionalidade + '\'' +
                '}';
    }
}