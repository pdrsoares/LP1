
public class FeijaoEnlatado {
    private String sabor;
    private String marca;
    private int capacidade;
    
    public FeijaoEnlatado() {}
    
    public FeijaoEnlatado(String sabor, String marca, int capacidade) {
        this.sabor = sabor;
        this.marca = marca;
        this.capacidade = capacidade;
    }
    
    public String getSabor() {
        return sabor;
    }
    
    public void setSabor(String sabor) {
        this.sabor = sabor;
    }
    
    public String getMarca() {
        return marca;
    }
    
    public void setMarca(String marca) {
        this.marca = marca;
    }
    
    public int getCapacidade() {
        return capacidade;
    }
    
    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }
    
    public void comer() {
        System.out.println("Comendo feijão enlatado " + marca + " sabor " + sabor + " (" + capacidade + "g)");
    }
    
    @Override
    public String toString() {
        return "FeijaoEnlatado{" +
                "sabor='" + sabor + '\'' +
                ", marca='" + marca + '\'' +
                ", capacidade=" + capacidade +
                '}';
    }
}