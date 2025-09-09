
public class ArenaChunin {
    private String localizacao;
    private int publico;
    private String faseCombate;
    
    public ArenaChunin() {}
    
    public ArenaChunin(String localizacao, int publico, String faseCombate) {
        this.localizacao = localizacao;
        this.publico = publico;
        this.faseCombate = faseCombate;
    }
    
    public String getLocalizacao() {
        return localizacao;
    }
    
    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }
    
    public int getPublico() {
        return publico;
    }
    
    public void setPublico(int publico) {
        this.publico = publico;
    }
    
    public String getFaseCombate() {
        return faseCombate;
    }
    
    public void setFaseCombate(String faseCombate) {
        this.faseCombate = faseCombate;
    }
    
    public void iniciarCombate() {
        System.out.println("=== COMBATE INICIADO ===");
        System.out.println("Local: " + localizacao);
        System.out.println("Público: " + publico + " espectadores");
        System.out.println("Fase: " + faseCombate);
        System.out.println("Rock Lee vs Gaara - LUTEM!");
    }
    
    public void interromper() {
        System.out.println("=== COMBATE INTERROMPIDO ===");
        System.out.println("Might Guy intervém no combate!");
        faseCombate = "Interrompido";
    }
    
    public void anunciarVencedor(String vencedor) {
        System.out.println("=== RESULTADO FINAL ===");
        System.out.println("VENCEDOR: " + vencedor + "!");
        System.out.println("Público aplaude: " + publico + " pessoas ovacionando!");
        faseCombate = "Finalizado";
    }
    
    public void atualizarFase(String novaFase) {
        faseCombate = novaFase;
        System.out.println("Fase do combate atualizada: " + novaFase);
    }
    
    @Override
    public String toString() {
        return "ArenaChunin{" +
                "localizacao='" + localizacao + '\'' +
                ", publico=" + publico +
                ", faseCombate='" + faseCombate + '\'' +
                '}';
    }
}