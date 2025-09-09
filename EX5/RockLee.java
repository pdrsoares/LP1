
public class RockLee {
    private int velocidade;
    private int forca;
    private int chakraPortoes;
    
    public RockLee() {}
    
    public RockLee(int velocidade, int forca, int chakraPortoes) {
        this.velocidade = velocidade;
        this.forca = forca;
        this.chakraPortoes = chakraPortoes;
    }
    
    public int getVelocidade() {
        return velocidade;
    }
    
    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }
    
    public int getForca() {
        return forca;
    }
    
    public void setForca(int forca) {
        this.forca = forca;
    }
    
    public int getChakraPortoes() {
        return chakraPortoes;
    }
    
    public void setChakraPortoes(int chakraPortoes) {
        this.chakraPortoes = chakraPortoes;
    }
    
    public void retirarPesos() {
        System.out.println("Rock Lee retirou os pesos! Velocidade aumentada drasticamente!");
        velocidade *= 5;
        System.out.println("Nova velocidade: " + velocidade);
    }
    
    public void atacar() {
        System.out.println("Rock Lee ataca com taijutsu extremo! Força: " + forca);
    }
    
    public void socar() {
        System.out.println("Rock Lee desfere um soco poderoso! Força: " + (forca * 2));
    }
    
    public void abrirPortoes(int portao) {
        if (portao <= chakraPortoes) {
            System.out.println("Rock Lee abriu o " + portao + "º Portão! Poder máximo!");
            forca *= portao * 2;
            velocidade *= portao * 3;
        }
    }
    
    @Override
    public String toString() {
        return "RockLee{" +
                "velocidade=" + velocidade +
                ", forca=" + forca +
                ", chakraPortoes=" + chakraPortoes +
                '}';
    }
}