
public class Trem {
    private String tipo;
    private String material;
    private String estado;
    
    public Trem() {}
    
    public Trem(String tipo, String material, String estado) {
        this.tipo = tipo;
        this.material = material;
        this.estado = estado;
    }
    
    public String getTipo() {
        return tipo;
    }
    
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    public String getMaterial() {
        return material;
    }
    
    public void setMaterial(String material) {
        this.material = material;
    }
    
    public String getEstado() {
        return estado;
    }
    
    public void setEstado(String estado) {
        this.estado = estado;
    }
    
    public void descarrilhar() {
        System.out.println("Trem " + tipo + " de " + material + " está descarrilhando! Estado: " + estado);
    }
    
    @Override
    public String toString() {
        return "Trem{" +
                "tipo='" + tipo + '\'' +
                ", material='" + material + '\'' +
                ", estado='" + estado + '\'' +
                '}';
    }
}