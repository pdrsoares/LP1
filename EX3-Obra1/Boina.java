
public class Boina {
    private String cor;
    private String corEstrela;
    private String material;
    
    public Boina() {}
    
    public Boina(String cor, String corEstrela, String material) {
        this.cor = cor;
        this.corEstrela = corEstrela;
        this.material = material;
    }
    
    public String getCor() {
        return cor;
    }
    
    public void setCor(String cor) {
        this.cor = cor;
    }
    
    public String getCorEstrela() {
        return corEstrela;
    }
    
    public void setCorEstrela(String corEstrela) {
        this.corEstrela = corEstrela;
    }
    
    public String getMaterial() {
        return material;
    }
    
    public void setMaterial(String material) {
        this.material = material;
    }
    
    public void vestir() {
        System.out.println("Vestindo boina " + cor + " com estrela " + corEstrela + " de " + material);
    }
    
    @Override
    public String toString() {
        return "Boina{" +
                "cor='" + cor + '\'' +
                ", corEstrela='" + corEstrela + '\'' +
                ", material='" + material + '\'' +
                '}';
    }
}