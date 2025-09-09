
public class Fotografia {
    private String tecnica;
    private String dimensoes;
    private boolean assinada;
    
    public Fotografia() {}
    
    public Fotografia(String tecnica, String dimensoes, boolean assinada) {
        this.tecnica = tecnica;
        this.dimensoes = dimensoes;
        this.assinada = assinada;
    }
    
    public String getTecnica() {
        return tecnica;
    }
    
    public void setTecnica(String tecnica) {
        this.tecnica = tecnica;
    }
    
    public String getDimensoes() {
        return dimensoes;
    }
    
    public void setDimensoes(String dimensoes) {
        this.dimensoes = dimensoes;
    }
    
    public boolean isAssinada() {
        return assinada;
    }
    
    public void setAssinada(boolean assinada) {
        this.assinada = assinada;
    }
    
    public void fotografar() {
        String assinaturaStatus = assinada ? "assinada" : "não assinada";
        System.out.println("Fotografando com técnica " + tecnica + " (" + dimensoes + ") - " + assinaturaStatus);
    }
    
    @Override
    public String toString() {
        return "Fotografia{" +
                "tecnica='" + tecnica + '\'' +
                ", dimensoes='" + dimensoes + '\'' +
                ", assinada=" + assinada +
                '}';
    }
}