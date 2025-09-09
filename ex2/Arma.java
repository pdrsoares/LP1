
public class Arma {
    private String tipo;
    private int calibre;
    private String cor;
    
    public Arma() {}
    
    public Arma(String tipo, int calibre, String cor) {
        this.tipo = tipo;
        this.calibre = calibre;
        this.cor = cor;
    }
    
    public String getTipo() {
        return tipo;
    }
    
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    public int getCalibre() {
        return calibre;
    }
    
    public void setCalibre(int calibre) {
        this.calibre = calibre;
    }
    
    public String getCor() {
        return cor;
    }
    
    public void setCor(String cor) {
        this.cor = cor;
    }
    
    public void atirar() {
        System.out.println("Atirando com arma " + tipo + " calibre " + calibre);
    }
    
    @Override
    public String toString() {
        return "Arma{" +
                "tipo='" + tipo + '\'' +
                ", calibre=" + calibre +
                ", cor='" + cor + '\'' +
                '}';
    }
}