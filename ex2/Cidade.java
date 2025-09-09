
public class Cidade {
    private String localizacao;
    private int populacao;
    private String nome;
    
    public Cidade() {}
    
    public Cidade(String localizacao, int populacao, String nome) {
        this.localizacao = localizacao;
        this.populacao = populacao;
        this.nome = nome;
    }
    
    public String getLocalizacao() {
        return localizacao;
    }
    
    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }
    
    public int getPopulacao() {
        return populacao;
    }
    
    public void setPopulacao(int populacao) {
        this.populacao = populacao;
    }
    
    public String getNome() {
        return nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public void viajar() {
        System.out.println("Viajando para " + nome);
    }
    
    @Override
    public String toString() {
        return "Cidade{" +
                "localizacao='" + localizacao + '\'' +
                ", populacao=" + populacao +
                ", nome='" + nome + '\'' +
                '}';
    }
}