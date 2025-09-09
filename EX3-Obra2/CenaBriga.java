
public class CenaBriga {
    private String cenario;
    private String atores;
    private int ano;
    
    public CenaBriga() {}
    
    public CenaBriga(String cenario, String atores, int ano) {
        this.cenario = cenario;
        this.atores = atores;
        this.ano = ano;
    }
    
    public String getCenario() {
        return cenario;
    }
    
    public void setCenario(String cenario) {
        this.cenario = cenario;
    }
    
    public String getAtores() {
        return atores;
    }
    
    public void setAtores(String atores) {
        this.atores = atores;
    }
    
    public int getAno() {
        return ano;
    }
    
    public void setAno(int ano) {
        this.ano = ano;
    }
    
    public void lutar() {
        System.out.println("Cena de luta ocorrendo em " + cenario + " com " + atores + " (ano: " + ano + ")");
    }
    
    @Override
    public String toString() {
        return "CenaBriga{" +
                "cenario='" + cenario + '\'' +
                ", atores='" + atores + '\'' +
                ", ano=" + ano +
                '}';
    }
}