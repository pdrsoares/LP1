
public class PessoaVisitante {
    private String nome;
    private int idade;
    private String atividade;
    
    public PessoaVisitante() {}
    
    public PessoaVisitante(String nome, int idade, String atividade) {
        this.nome = nome;
        this.idade = idade;
        this.atividade = atividade;
    }
    
    public String getNome() {
        return nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public int getIdade() {
        return idade;
    }
    
    public void setIdade(int idade) {
        this.idade = idade;
    }
    
    public String getAtividade() {
        return atividade;
    }
    
    public void setAtividade(String atividade) {
        this.atividade = atividade;
    }
    
    public void comprar() {
        System.out.println(nome + " está comprando produtos Kellogg's");
    }
    
    public void falar() {
        System.out.println(nome + " diz: 'They're Grrreat!'");
    }
    
    public void andar() {
        System.out.println(nome + " está andando pela loja");
    }
    
    @Override
    public String toString() {
        return "PessoaVisitante{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", atividade='" + atividade + '\'' +
                '}';
    }
}