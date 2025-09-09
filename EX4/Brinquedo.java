
public class Brinquedo {
    private String tipo;
    private int capacidade;
    private String estado;
    
    public Brinquedo() {}
    
    public Brinquedo(String tipo, int capacidade, String estado) {
        this.tipo = tipo;
        this.capacidade = capacidade;
        this.estado = estado;
    }
    
    public String getTipo() {
        return tipo;
    }
    
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    public int getCapacidade() {
        return capacidade;
    }
    
    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }
    
    public String getEstado() {
        return estado;
    }
    
    public void setEstado(String estado) {
        this.estado = estado;
    }
    
    public void ativar() {
        System.out.println("Ativando brinquedo " + tipo + " (capacidade: " + capacidade + ")");
        estado = "Ativo";
    }
    
    public void desativar() {
        System.out.println("Desativando brinquedo " + tipo);
        estado = "Inativo";
    }
    
    public void verificarCapacidade() {
        System.out.println("Brinquedo " + tipo + " tem capacidade para " + capacidade + " pessoas");
    }
    
    @Override
    public String toString() {
        return "Bringuedo{" +
                "tipo='" + tipo + '\'' +
                ", capacidade=" + capacidade +
                ", estado='" + estado + '\'' +
                '}';
    }
}